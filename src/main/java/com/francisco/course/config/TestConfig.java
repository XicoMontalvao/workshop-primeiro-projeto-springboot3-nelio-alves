package com.francisco.course.config;

import com.francisco.course.entities.*;
import com.francisco.course.entities.enums.OrderStatus;
import com.francisco.course.repositories.*;
import com.github.javafaker.Faker; // Importe o Faker
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // 1. Todos os Repositories necessários
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    // 2. Instância do Faker como variável da classe
    private final Faker faker = new Faker(new Locale("pt-BR"));

    // 3. Método 'run' agora só orquestra as chamadas
    @Override
    public void run(String... args) throws Exception {

        // Cada método agora tem uma responsabilidade única
        List<Category> categories = seedCategories();
        List<Product> products = seedProducts(categories);
        List<User> users = seedUsers();
        List<Order> orders = seedOrders(users);

        seedOrderItems(orders, products);

        // Este método salva os pedidos novamente para persistir os pagamentos
        seedPayments(orders);
    }


    private List<User> seedUsers() {
        System.out.println("Gerando usuários...");
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress(name.toLowerCase().replace(" ", "."));
            String phone = faker.phoneNumber().cellPhone();
            String password = faker.internet().password(6, 10);

            userList.add(new User(null, name, email, phone, password));
        }

        return userRepository.saveAll(userList);
    }

    private List<Category> seedCategories() {
        System.out.println("Gerando categorias...");
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        Category cat4 = new Category(null, "Home Appliances");
        Category cat5 = new Category(null, "Sports & Outdoors");
        Category cat6 = new Category(null, "Toys & Games");

        // Salva e retorna a lista de categorias com IDs
        return categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
    }

    private List<Product> seedProducts(List<Category> categories) {
        System.out.println("Gerando produtos e associando categorias...");
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            String name = faker.commerce().productName();
            String description = faker.lorem().sentence();
            double price = Double.parseDouble(faker.commerce().price(10.0, 9999.0).replace(",", "."));
            String imgUrl = faker.internet().url();

            productList.add(new Product(null, name, description, price, imgUrl));
        }

        // Salva os produtos primeiro (para eles terem ID)
        productRepository.saveAll(productList);

        // Agora, faz a associação ManyToMany
        for (Product p : productList) {
            // Pega de 1 a 3 categorias aleatórias
            int categoryCount = faker.random().nextInt(1, 3);
            Set<Category> cats = new HashSet<>();
            for(int i = 0; i < categoryCount; i++) {
                cats.add(categories.get(faker.random().nextInt(categories.size())));
            }
            p.getCategories().addAll(cats);
        }

        // Salva DE NOVO para persistir as associações e retorna a lista
        return productRepository.saveAll(productList);
    }

    private List<Order> seedOrders(List<User> userList) {
        System.out.println("Gerando pedidos...");
        List<Order> orderList = new ArrayList<>();
        OrderStatus[] allStatus = OrderStatus.values(); // Pega todos os status do Enum

        for (int i = 0; i < 50; i++) {
            User randomUser = userList.get(faker.random().nextInt(userList.size()));
            OrderStatus randomStatus = allStatus[faker.random().nextInt(allStatus.length)];
            Instant randomInstant = faker.date().past(365, TimeUnit.DAYS).toInstant();

            orderList.add(new Order(null, randomInstant, randomStatus, randomUser));
        }

        // Salva e retorna a lista de pedidos com IDs
        return orderRepository.saveAll(orderList);
    }

    private void seedOrderItems(List<Order> orderList, List<Product> productList) {
        System.out.println("Gerando itens dos pedidos...");
        List<OrderItem> orderItemList = new ArrayList<>();

        for (Order order : orderList) {
            int itemsPerOrder = faker.random().nextInt(1, 3);
            Set<Product> productsInThisOrder = new HashSet<>();

            for (int i = 0; i < itemsPerOrder; i++) {
                Product randomProduct;

                do {
                    randomProduct = productList.get(faker.random().nextInt(productList.size()));
                } while (productsInThisOrder.contains(randomProduct));

                productsInThisOrder.add(randomProduct);

                int quantity = faker.random().nextInt(1, 3);
                double price = randomProduct.getPrice();

                OrderItem oi = new OrderItem(order, randomProduct, quantity, price);
                orderItemList.add(oi);
            }
        }

        orderItemRepository.saveAll(orderItemList);
    }

    private void seedPayments(List<Order> orderList) {
        System.out.println("Gerando pagamentos...");

        for (Order order : orderList) {

            if (order.getOrderStatus() == OrderStatus.PAID ||
                    order.getOrderStatus() == OrderStatus.SHIPPED ||
                    order.getOrderStatus() == OrderStatus.DELIVERED) {

                Instant paymentMoment = order.getMoment().plusSeconds(faker.random().nextInt(60, 3600));
                Payment payment = new Payment(null, paymentMoment, order);

                order.setPayment(payment);
            }
        }
        orderRepository.saveAll(orderList);
    }
}