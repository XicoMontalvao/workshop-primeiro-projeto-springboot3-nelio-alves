package com.francisco.course.config;

import com.francisco.course.entities.Order;
import com.francisco.course.entities.User;
import com.francisco.course.entities.enums.OrderStatus;
import com.francisco.course.repositories.OrderRepository;
import com.francisco.course.repositories.UserRepositoy;
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
    private UserRepositoy userRepositoy;
    @Autowired
    private OrderRepository orderRepository;

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

        userRepositoy.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, u21, u22, u23, u24, u25, u26, u27, u28, u29, u30, u31, u32, u33, u34, u35, u36, u37, u38, u39, u40, u41, u42, u43, u44, u45, u46, u47, u48, u49));

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o31, o32, o33, o34, o35, o36, o37, o38, o39, o40, o41, o42, o43, o44, o45, o46, o47, o48, o49, o50));
    }
}
