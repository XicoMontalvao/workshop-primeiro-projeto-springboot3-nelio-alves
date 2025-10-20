package com.francisco.course.config;

import com.francisco.course.entities.Category;
import com.francisco.course.entities.Order;
import com.francisco.course.entities.Product;
import com.francisco.course.entities.User;
import com.francisco.course.entities.enums.OrderStatus;
import com.francisco.course.repositories.CategoryRepository;
import com.francisco.course.repositories.OrderRepository;
import com.francisco.course.repositories.ProductRepository;
import com.francisco.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Ana Clara Melo", "anaclara.melo@gmail.com", "987654321", "p4sSw0rd");
        User u2 = new User(null, "Bruno Costa", "bruno.costa@gmail.com", "912345678", "aBcDeF1");
        User u3 = new User(null, "Carla Dias", "carla.dias@gmail.com", "988776655", "s3cReT9");
        User u4 = new User(null, "Daniel Moreira", "daniel.moreira@gmail.com", "999888777", "usEr123");
        User u5 = new User(null, "Elisa Fernandes", "elisa.fernandes@gmail.com", "981234567", "myP@ss!");
        User u6 = new User(null, "Fábio Gomes", "fabio.gomes@gmail.com", "991122334", "lOgIn45");
        User u7 = new User(null, "Gabriela Lima", "gabriela.lima@gmail.com", "987651234", "gAbI789");
        User u8 = new User(null, "Heitor Martins", "heitor.martins@gmail.com", "996543210", "hEiT0r!");
        User u9 = new User(null, "Isabela Nogueira", "isabela.nogueira@gmail.com", "984567890", "1sAb3la");
        User u10 = new User(null, "João Pedro Alves", "joaopedro.alves@gmail.com", "998877665", "jP@2025");
        User u11 = new User(null, "Karina Oliveira", "karina.oliveira@gmail.com", "981112233", "kArInA9");
        User u12 = new User(null, "Lucas Ribeiro", "lucas.ribeiro@gmail.com", "992233445", "LuCaS!@");
        User u13 = new User(null, "Manuela Sousa", "manuela.sousa@gmail.com", "983344556", "mAnu345");
        User u14 = new User(null, "Nicolas Azevedo", "nicolas.azevedo@gmail.com", "994455667", "nIcO777");
        User u15 = new User(null, "Olívia Rocha", "olivia.rocha@gmail.com", "985566778", "oLiViA#");
        User u16 = new User(null, "Paulo Santos", "paulo.santos@gmail.com", "996677889", "pAuLoSs");
        User u17 = new User(null, "Quitória Bessa", "quitoria.bessa@gmail.com", "987788990", "qUiT*88");
        User u18 = new User(null, "Rafael Barbosa", "rafael.barbosa@gmail.com", "998899001", "rAfA_01");
        User u19 = new User(null, "Sofia Carvalho", "sofia.carvalho@gmail.com", "981212121", "sOfIaCar");
        User u20 = new User(null, "Tiago Correia", "tiago.correia@gmail.com", "993434343", "tIaGo99");
        User u21 = new User(null, "Úrsula Freitas", "ursula.freitas@gmail.com", "984545454", "uRsUlA!#");
        User u22 = new User(null, "Vitor Pires", "vitor.pires@gmail.com", "995656565", "vItOrP$");
        User u23 = new User(null, "Yasmin Teixeira", "yasmin.teixeira@gmail.com", "986767676", "yAsMiN_t");
        User u24 = new User(null, "Xavier Mendes", "xavier.mendes@gmail.com", "997878787", "xAvIeR_m");
        User u25 = new User(null, "Zilda Castro", "zilda.castro@gmail.com", "989090909", "zIlDaC@");
        User u26 = new User(null, "Arthur Farias", "arthur.farias@gmail.com", "991231231", "aRtHuR_f");
        User u27 = new User(null, "Beatriz Lemos", "beatriz.lemos@gmail.com", "982342342", "bIaLeMoS");
        User u28 = new User(null, "Cauã Silveira", "caua.silveira@gmail.com", "993453453", "cAuA_sIl");
        User u29 = new User(null, "Davi Lucas Pinto", "davilucas.pinto@gmail.com", "984564564", "dAvI_pT");
        User u30 = new User(null, "Esther Viana", "esther.viana@gmail.com", "995675675", "eStHeR!V");
        User u31 = new User(null, "Felipe Arruda", "felipe.arruda@gmail.com", "986786786", "fElIpE_A");
        User u32 = new User(null, "Giovanna Barros", "giovanna.barros@gmail.com", "997897897", "gIoBaRr");
        User u33 = new User(null, "Hugo Rezende", "hugo.rezende@gmail.com", "981010101", "hUgOrEz#");
        User u34 = new User(null, "Isaac Salles", "isaac.salles@gmail.com", "992121212", "iSaAcS!");
        User u35 = new User(null, "Júlia Drummond", "julia.drummond@gmail.com", "983232323", "jUlIa_D!");
        User u36 = new User(null, "Kevin Meireles", "kevin.meireles@gmail.com", "994343434", "kEvIn_M#");
        User u37 = new User(null, "Laura Peixoto", "laura.peixoto@gmail.com", "985454545", "lAuRaP!");
        User u38 = new User(null, "Miguel Tavares", "miguel.tavares@gmail.com", "996565656", "mIgUeL_T");
        User u39 = new User(null, "Natália Zago", "natalia.zago@gmail.com", "987676767", "nAtAlIaZ");

        User u40 = new User(null, "Pedro Henrique Neves", "pedrohenrique.neves@gmail.com", "989898989", "pH_nEvEs");

        User u41 = new User(null, "Rebeca Matos", "rebeca.matos@gmail.com", "991919191", "rEbEcAmS");
        User u42 = new User(null, "Samuel Dantas", "samuel.dantas@gmail.com", "982828282", "sAmUeL_D");
        User u43 = new User(null, "Theo Furtado", "theo.furtado@gmail.com", "993939393", "tHeOfUrT");
        User u44 = new User(null, "Valentina Campos", "valentina.campos@gmail.com", "984848484", "vAlEnTi#");
        User u45 = new User(null, "Vinícius Guerra", "vinicius.guerra@gmail.com", "995959595", "vInIgUe!");
        User u46 = new User(null, "Wagner Nunes", "wagner.nunes@gmail.com", "986868686", "wAgNeRnS");
        User u47 = new User(null, "Yasmin Brandão", "yasmin.brandao@gmail.com", "997979797", "yAsBrAn!");
        User u48 = new User(null, "Enzo Gabriel Dias", "enzogabriel.dias@gmail.com", "981717171", "eNzO_gD!");
        User u49 = new User(null, "Maria Júlia Costa", "mariajulia.costa@gmail.com", "992727272", "mJ_cOsTa");


        Order o1 = new Order(null, Instant.parse("2023-01-15T10:30:45Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2023-02-20T14:22:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2023-02-21T08:05:30Z"), OrderStatus.SHIPPED, u1);
        Order o4 = new Order(null, Instant.parse("2023-03-10T11:15:00Z"), OrderStatus.DELIVERED, u3);
        Order o5 = new Order(null, Instant.parse("2023-04-05T09:30:15Z"), OrderStatus.CANCELED, u4);
        Order o6 = new Order(null, Instant.parse("2023-05-12T18:45:20Z"), OrderStatus.WAITING_PAYMENT, u5);
        Order o7 = new Order(null, Instant.parse("2023-06-18T20:10:55Z"), OrderStatus.PAID, u6);
        Order o8 = new Order(null, Instant.parse("2023-07-01T13:00:00Z"), OrderStatus.SHIPPED, u7);
        Order o9 = new Order(null, Instant.parse("2023-08-14T07:55:12Z"), OrderStatus.DELIVERED, u8);
        Order o10 = new Order(null, Instant.parse("2023-09-30T22:18:40Z"), OrderStatus.CANCELED, u9);
        Order o11 = new Order(null, Instant.parse("2023-10-11T16:05:05Z"), OrderStatus.WAITING_PAYMENT, u10);
        Order o12 = new Order(null, Instant.parse("2023-11-25T12:30:00Z"), OrderStatus.PAID, u11);
        Order o13 = new Order(null, Instant.parse("2023-12-05T14:14:14Z"), OrderStatus.SHIPPED, u12);
        Order o14 = new Order(null, Instant.parse("2024-01-19T10:00:00Z"), OrderStatus.DELIVERED, u13);
        Order o15 = new Order(null, Instant.parse("2024-01-20T11:20:30Z"), OrderStatus.CANCELED, u14);
        Order o16 = new Order(null, Instant.parse("2024-02-02T19:40:50Z"), OrderStatus.WAITING_PAYMENT, u15);
        Order o17 = new Order(null, Instant.parse("2024-02-15T09:12:30Z"), OrderStatus.PAID, u16);
        Order o18 = new Order(null, Instant.parse("2024-03-01T17:50:00Z"), OrderStatus.SHIPPED, u17);
        Order o19 = new Order(null, Instant.parse("2024-03-10T18:21:15Z"), OrderStatus.DELIVERED, u18);
        Order o20 = new Order(null, Instant.parse("2024-04-07T21:00:00Z"), OrderStatus.CANCELED, u19);
        Order o21 = new Order(null, Instant.parse("2024-05-16T13:13:13Z"), OrderStatus.WAITING_PAYMENT, u20);
        Order o22 = new Order(null, Instant.parse("2024-06-20T15:05:10Z"), OrderStatus.PAID, u21);
        Order o23 = new Order(null, Instant.parse("2024-07-22T10:30:00Z"), OrderStatus.SHIPPED, u22);
        Order o24 = new Order(null, Instant.parse("2024-08-01T08:25:45Z"), OrderStatus.DELIVERED, u23);
        Order o25 = new Order(null, Instant.parse("2024-09-10T12:00:00Z"), OrderStatus.CANCELED, u24);
        Order o26 = new Order(null, Instant.parse("2024-10-15T14:55:30Z"), OrderStatus.WAITING_PAYMENT, u25);
        Order o27 = new Order(null, Instant.parse("2024-11-05T19:20:10Z"), OrderStatus.PAID, u26);
        Order o28 = new Order(null, Instant.parse("2024-12-01T23:59:59Z"), OrderStatus.SHIPPED, u27);
        Order o29 = new Order(null, Instant.parse("2025-01-10T09:00:00Z"), OrderStatus.DELIVERED, u28);
        Order o30 = new Order(null, Instant.parse("2025-01-11T10:45:15Z"), OrderStatus.CANCELED, u29);
        Order o31 = new Order(null, Instant.parse("2025-02-14T11:30:20Z"), OrderStatus.WAITING_PAYMENT, u30);
        Order o32 = new Order(null, Instant.parse("2025-02-20T16:10:30Z"), OrderStatus.PAID, u31);
        Order o33 = new Order(null, Instant.parse("2025-03-03T18:00:00Z"), OrderStatus.SHIPPED, u32);
        Order o34 = new Order(null, Instant.parse("2025-03-15T14:20:40Z"), OrderStatus.DELIVERED, u33);
        Order o35 = new Order(null, Instant.parse("2025-04-01T07:15:50Z"), OrderStatus.CANCELED, u34);
        Order o36 = new Order(null, Instant.parse("2025-04-10T10:10:10Z"), OrderStatus.WAITING_PAYMENT, u35);
        Order o37 = new Order(null, Instant.parse("2025-05-05T12:05:00Z"), OrderStatus.PAID, u36);
        Order o38 = new Order(null, Instant.parse("2025-05-20T09:30:00Z"), OrderStatus.SHIPPED, u37);
        Order o39 = new Order(null, Instant.parse("2025-06-11T08:45:10Z"), OrderStatus.DELIVERED, u38);
        Order o40 = new Order(null, Instant.parse("2025-06-12T13:25:20Z"), OrderStatus.CANCELED, u39);
        Order o41 = new Order(null, Instant.parse("2025-07-01T15:00:00Z"), OrderStatus.WAITING_PAYMENT, u40);
        Order o42 = new Order(null, Instant.parse("2025-07-07T17:35:30Z"), OrderStatus.PAID, u41);
        Order o43 = new Order(null, Instant.parse("2025-08-10T19:40:40Z"), OrderStatus.SHIPPED, u42);
        Order o44 = new Order(null, Instant.parse("2025-08-15T20:50:50Z"), OrderStatus.DELIVERED, u43);
        Order o45 = new Order(null, Instant.parse("2025-09-01T22:15:00Z"), OrderStatus.CANCELED, u44);
        Order o46 = new Order(null, Instant.parse("2025-09-05T00:10:20Z"), OrderStatus.WAITING_PAYMENT, u45);
        Order o47 = new Order(null, Instant.parse("2025-09-15T11:00:00Z"), OrderStatus.PAID, u46);
        Order o48 = new Order(null, Instant.parse("2025-10-01T16:30:00Z"), OrderStatus.SHIPPED, u47);
        Order o49 = new Order(null, Instant.parse("2025-10-10T18:18:18Z"), OrderStatus.DELIVERED, u48);
        Order o50 = new Order(null, Instant.parse("2025-10-19T23:59:00Z"), OrderStatus.CANCELED, u49);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        Category cat4 = new Category(null, "Home Appliances");
        Category cat5 = new Category(null, "Sports & Outdoors");
        Category cat6 = new Category(null, "Toys & Games");


        Product p1 = new Product(null, "Smart TV 4K 55\"", "Experience stunning 4K visuals.", 2499.90, "img/tv.png");
        Product p2 = new Product(null, "The Lord of the Rings", "Complete trilogy box set.", 129.99, "img/books_lotr.png");
        Product p3 = new Product(null, "Gaming Laptop 16GB RAM", "High performance for all your games.", 5800.00, "img/laptop.png");
        Product p4 = new Product(null, "Coffee Maker", "Brews up to 12 cups.", 149.50, "img/coffee.png");
        Product p5 = new Product(null, "Running Shoes", "Comfortable and lightweight.", 399.00, "img/shoes.png");
        Product p6 = new Product(null, "LEGO Star Wars Set", "Build the Millennium Falcon.", 899.99, "img/lego.png");
        Product p7 = new Product(null, "Smartphone 256GB", "Latest model with advanced camera.", 4200.00, "img/phone.png");
        Product p8 = new Product(null, "Dune by Frank Herbert", "Sci-fi classic paperback.", 45.90, "img/book_dune.png");
        Product p9 = new Product(null, "Mechanical Keyboard", "RGB lighting and tactile switches.", 550.00, "img/keyboard.png");
        Product p10 = new Product(null, "Air Fryer 5L", "Healthy cooking with less oil.", 480.00, "img/airfryer.png");
        Product p11 = new Product(null, "Yoga Mat", "Non-slip and eco-friendly.", 89.90, "img/yoga.png");
        Product p12 = new Product(null, "Board Game - Catan", "Strategy game for the family.", 220.00, "img/catan.png");
        Product p13 = new Product(null, "Bluetooth Headphones", "Noise-cancelling over-ear.", 750.00, "img/headphones.png");
        Product p14 = new Product(null, "Java Programming Book", "Learn Java from scratch.", 95.00, "img/book_java.png");
        Product p15 = new Product(null, "MacBook Pro 14\"", "Apple M3 Pro chip.", 12500.00, "img/macbook.png");
        Product p16 = new Product(null, "Robotic Vacuum Cleaner", "Smart mapping technology.", 1800.00, "img/vacuum.png");
        Product p17 = new Product(null, "Basketball", "Official NBA size and weight.", 130.00, "img/basketball.png");
        Product p18 = new Product(null, "RC Drone", "4K camera and 30-min flight time.", 1100.00, "img/drone.png");
        Product p19 = new Product(null, "Wireless Earbuds", "True wireless with charging case.", 320.00, "img/earbuds.png");
        Product p20 = new Product(null, "A Brief History of Time", "By Stephen Hawking.", 55.00, "img/book_hawking.png");
        Product p21 = new Product(null, "Curved Gaming Monitor", "27-inch 144Hz.", 1600.00, "img/monitor.png");
        Product p22 = new Product(null, "Blender", "1000W motor for smoothies.", 210.00, "img/blender.png");
        Product p23 = new Product(null, "Dumbbell Set", "Adjustable weights.", 600.00, "img/dumbbell.png");
        Product p24 = new Product(null, "Action Figure", "Collectible superhero figure.", 180.00, "img/figure.png");
        Product p25 = new Product(null, "Soundbar", "Dolby Atmos sound system.", 950.00, "img/soundbar.png");
        Product p26 = new Product(null, "1984 by George Orwell", "Dystopian classic.", 40.00, "img/book_1984.png");
        Product p27 = new Product(null, "External SSD 1TB", "High-speed data transfer.", 650.00, "img/ssd.png");
        Product p28 = new Product(null, "Microwave Oven", "20L capacity, digital panel.", 420.00, "img/microwave.png");
        Product p29 = new Product(null, "Camping Tent", "4-person waterproof tent.", 530.00, "img/tent.png");
        Product p30 = new Product(null, "Puzzle 1000 Pieces", "Jigsaw puzzle, beautiful landscape.", 75.00, "img/puzzle.png");
        Product p31 = new Product(null, "Digital Camera", "Mirrorless camera with lens.", 3800.00, "img/camera.png");
        Product p32 = new Product(null, "The Pragmatic Programmer", "Journey to mastery.", 110.00, "img/book_pragmatic.png");
        Product p33 = new Product(null, "Wireless Mouse", "Ergonomic design.", 150.00, "img/mouse.png");
        Product p34 = new Product(null, "Washing Machine", "10kg front load.", 2100.00, "img/washing.png");
        Product p35 = new Product(null, "Bicycle", "21-speed mountain bike.", 1300.00, "img/bike.png");
        Product p36 = new Product(null, "Plush Toy", "Soft teddy bear.", 60.00, "img/teddy.png");
        Product p37 = new Product(null, "Smartwatch", "Fitness tracking and GPS.", 890.00, "img/watch.png");
        Product p38 = new Product(null, "Clean Code", "By Robert C. Martin.", 140.00, "img/book_cleancode.png");
        Product p39 = new Product(null, "Graphics Card RTX 4070", "Next-gen graphics.", 4500.00, "img/gpu.png");
        Product p40 = new Product(null, "Refrigerator", "Frost-free, 400L.", 3100.00, "img/fridge.png");
        Product p41 = new Product(null, "Treadmill", "Foldable electric treadmill.", 2200.00, "img/treadmill.png");
        Product p42 = new Product(null, "Doll House", "Wooden doll house with furniture.", 350.00, "img/dollhouse.png");
        Product p43 = new Product(null, "Projector", "Full HD 1080p projector.", 980.00, "img/projector.png");
        Product p44 = new Product(null, "Sapiens: A Brief History", "By Yuval Noah Harari.", 65.00, "img/book_sapiens.png");
        Product p45 = new Product(null, "All-in-One PC", "24-inch, 8GB RAM.", 3400.00, "img/allinone.png");
        Product p46 = new Product(null, "Electric Kettle", "1.7L stainless steel.", 110.00, "img/kettle.png");
        Product p47 = new Product(null, "Soccer Ball", "Official league ball.", 90.00, "img/soccer.png");
        Product p48 = new Product(null, "Electric Scooter", "Foldable and portable.", 1700.00, "img/scooter.png");
        Product p49 = new Product(null, "Gaming Console", "Latest generation console.", 3999.00, "img/console.png");
        Product p50 = new Product(null, "Atomic Habits", "By James Clear.", 52.00, "img/book_habits.png");




        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, u21, u22, u23, u24, u25, u26, u27, u28, u29, u30, u31, u32, u33, u34, u35, u36, u37, u38, u39, u40, u41, u42, u43, u44, u45, u46, u47, u48, u49));

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o31, o32, o33, o34, o35, o36, o37, o38, o39, o40, o41, o42, o43, o44, o45, o46, o47, o48, o49, o50));


        p1.getCategories().add(cat1);
        p3.getCategories().add(cat1);
        p7.getCategories().add(cat1);
        p13.getCategories().add(cat1);
        p15.getCategories().add(cat1);
        p18.getCategories().add(cat1);
        p19.getCategories().add(cat1);
        p25.getCategories().add(cat1);
        p31.getCategories().add(cat1);
        p37.getCategories().add(cat1);
        p43.getCategories().add(cat1);
        p48.getCategories().add(cat1);
        p49.getCategories().add(cat1);

// Books (cat2)
        p2.getCategories().add(cat2);
        p8.getCategories().add(cat2);
        p14.getCategories().add(cat2);
        p20.getCategories().add(cat2);
        p26.getCategories().add(cat2);
        p32.getCategories().add(cat2);
        p38.getCategories().add(cat2);
        p44.getCategories().add(cat2);
        p50.getCategories().add(cat2);

// Computers (cat3)
        p3.getCategories().add(cat3);
        p9.getCategories().add(cat3);
        p15.getCategories().add(cat3);
        p21.getCategories().add(cat3);
        p27.getCategories().add(cat3);
        p33.getCategories().add(cat3);
        p39.getCategories().add(cat3);
        p45.getCategories().add(cat3);

// Home Appliances (cat4)
        p4.getCategories().add(cat4);
        p10.getCategories().add(cat4);
        p16.getCategories().add(cat4);
        p22.getCategories().add(cat4);
        p28.getCategories().add(cat4);
        p34.getCategories().add(cat4);
        p40.getCategories().add(cat4);
        p46.getCategories().add(cat4);

// Sports & Outdoors (cat5)
        p5.getCategories().add(cat5);
        p11.getCategories().add(cat5);
        p17.getCategories().add(cat5);
        p23.getCategories().add(cat5);
        p29.getCategories().add(cat5);
        p35.getCategories().add(cat5);
        p37.getCategories().add(cat5);
        p41.getCategories().add(cat5);
        p47.getCategories().add(cat5);

// Toys & Games (cat6)
        p6.getCategories().add(cat6);
        p12.getCategories().add(cat6);
        p18.getCategories().add(cat6);
        p24.getCategories().add(cat6);
        p30.getCategories().add(cat6);
        p36.getCategories().add(cat6);
        p42.getCategories().add(cat6);
        p49.getCategories().add(cat6);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));



    }
}
