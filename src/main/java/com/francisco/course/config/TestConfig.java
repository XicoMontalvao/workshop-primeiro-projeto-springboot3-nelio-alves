package com.francisco.course.config;

// ... (Mantenha todos os seus imports)

import com.francisco.course.entities.Category;
import com.francisco.course.entities.Order;
import com.francisco.course.entities.Product;
import com.francisco.course.entities.User;
import com.francisco.course.entities.enums.OrderStatus;
import com.francisco.course.repositories.CategoryRepository;
import com.francisco.course.repositories.OrderRepository;
import com.francisco.course.repositories.ProductRepository;
import com.francisco.course.repositories.UserRepository;
import com.github.javafaker.Faker; // <-- Importe o Faker
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList; // <-- Use listas dinâmicas
import java.util.Arrays;
import java.util.List; // <-- Use listas dinâmicas
import java.util.Locale; // <-- Para gerar dados em Português!
import java.util.concurrent.TimeUnit; // <-- Para gerar datas

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // Seus repositories continuam aqui...
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Faker faker = new Faker(new Locale("pt-BR"));

        // Crie uma lista para guardar os usuários gerados
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress(name.toLowerCase().replace(" ", "."));
            String phone = faker.phoneNumber().cellPhone();
            String password = faker.internet().password(6, 10);

            userList.add(new User(null, name, email, phone, password));
        }
        userRepository.saveAll(userList);


        List<Order> orderList = new ArrayList<>();
        OrderStatus[] allStatus = OrderStatus.values(); // Pega todos os status do Enum
        for (int i = 0; i < 200; i++) {
            // Pega um usuário aleatório da lista que acabamos de salvar
            User randomUser = userList.get(faker.random().nextInt(userList.size()));

            // Pega um status aleatório (PAID, SHIPPED, etc.)
            OrderStatus randomStatus = allStatus[faker.random().nextInt(allStatus.length)];

            // Gera uma data passada aleatória (ex: nos últimos 365 dias)
            Instant randomInstant = faker.date().past(365, TimeUnit.DAYS).toInstant();

            orderList.add(new Order(null, randomInstant, randomStatus, randomUser));
        }

        orderRepository.saveAll(orderList);


        Category cat1 = new Category(null, "Eletrônicos");
        Category cat2 = new Category(null, "Livros");
        Category cat3 = new Category(null, "Computadores");
        Category cat4 = new Category(null, "Casa e Cozinha");
        Category cat5 = new Category(null, "Esportes");
        Category cat6 = new Category(null, "Brinquedos");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));

        // Você também pode gerar produtos com o Faker
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            String name = faker.commerce().productName();
            String description = faker.lorem().sentence(20);
            double price = Double.parseDouble(faker.commerce().price(50.0, 5000.0).replace(",", "."));
            String imgUrl = faker.internet().image();

            productList.add(new Product(null, name, description, price, imgUrl));
        }

        productRepository.saveAll(productList);



        for (Product p : productList) {
            // Adiciona este produto a 1 ou 2 categorias aleatórias
            Category randomCat1 = categoryRepository.findAll().get(faker.random().nextInt(6));
            Category randomCat2 = categoryRepository.findAll().get(faker.random().nextInt(6));
            Category randomCat3 = categoryRepository.findAll().get(faker.random().nextInt(6));

            p.getCategories().add(randomCat1);
            p.getCategories().add(randomCat2);
            p.getCategories().add(randomCat3);
        }

        productRepository.saveAll(productList);
    }
}