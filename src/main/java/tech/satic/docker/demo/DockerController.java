// Package
package tech.satic.docker.demo;

// Librairie

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TAWAMBA KOUAKAM Lorince S.
 * @version 1.0.0
 * @since 20/03/2022
 */
@RestController
@RequestMapping(path = "/api/v1/appli/")
public class DockerController {

    @GetMapping(path = "info")
    public String getInfo() {
        return "= = = = SPRING BOOT DEMO DOCKER = = = =";
    }

    @GetMapping(path = "version")
    public String getVersion() {
        return "= = = = Version 1.0.0 = = = =";
    }

    @GetMapping(path = "message")
    public String getMessage() {
        return "= = = = MERCI POUR CET EXEMPLE = = = =";
    }
}
