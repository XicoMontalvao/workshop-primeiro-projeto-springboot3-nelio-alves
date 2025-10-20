package com.francisco.course.config;

import com.francisco.course.entities.User;
import com.francisco.course.repositories.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepositoy userRepositoy;

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

        userRepositoy.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, u21, u22, u23, u24, u25, u26, u27, u28, u29, u30, u31, u32, u33, u34, u35, u36, u37, u38, u39, u40, u41, u42, u43, u44, u45, u46, u47, u48, u49));
    }
}
