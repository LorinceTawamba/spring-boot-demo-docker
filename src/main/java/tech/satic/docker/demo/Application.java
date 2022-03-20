// Package
package tech.satic.docker.demo;

// Librairie
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author TAWAMBA KOUAKAM Lorince S.
 * @version 1.0.0
 * @since 20/03/2022
 */
@SpringBootApplication
public class Application {

    /**
     * Methode principale de lancement de l'application.
     * @param       args tableau des arguments fournis sur la ligne de commande.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /**
     * Methode d'exécution des traitements du microservice.
     * @return       CommandLineRunner : traitement à exécuter.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    @Bean
    CommandLineRunner start() {
        return args -> {
            System.out.println("==== SPRING BOOT DEMO DOCKER ====");
        };
    }

}
