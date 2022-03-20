# Spring Boot Demo Docker Application

The simple Spring Boot application using Docker

## Made with

* [Java 8](https://www.java.com/fr/download/) - JDK 8
* [Spring initializr](https://start.spring.io/) - 2.6.4
* [IntelliJ IDEA Utlimate](https://www.jetbrains.com/fr-fr/idea/) - IntelliJ IDEA 2021.2.3 (Ultimate Edition)
* [Docker](https://www.docker.com/) - version 20.10.12

## Versions

- **Dernière version stable :** 1.0.0
- **Dernière version :** 1.0.0
  The list of versions : [Click to display](https://github.com/LorinceTawamba/spring-boot-demo-docker/tags)

## About this Service

**Spring boot demo application using docker**

## Deployment

```bash
  docker build -t lorincetawamba/spring-boot-demo-docker:1.0.0 -f Dockerfile .
```

```bash
  docker images     ou     docker image ls
```

```bash
  docker run -d -p 8585:8080 -t lorincetawamba/spring-boot-demo-docker:1.0.0 
  docker run -d -p 8181:8080 -t lorincetawamba/spring-boot-demo-docker:1.0.0
```

```bash
  docker container ls
```

## API Reference

#### Get information

```http
  GET /api/v1/appli/info
```

#### Get current version

```http
  GET /api/v1/appli/version
```

#### Get message 

```http
  GET /api/v1/appli/message
```

## Authors

* **TAWAMBA KOUAKAM Lorince S.** _alias_ [@LorinceTawamba](https://github.com/LorinceTawamba)

Read the list of [contributors](https://github.com/LorinceTawamba/spring-boot-demo-docker/contributors) to see who helped with the project !

## Documentation

For more details refer to the swagger documentation.

## License

Ce document est placé sous licence CC BY-NC-SA :  [Creative Commons
Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions](https://creativecommons.org/licenses/by-nc-sa/4.0/)

![Logo](https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png)

En savoir plus sur [les licences Creative Commons](https://creativecommons.org/licenses/?lang=fr-FR)...
