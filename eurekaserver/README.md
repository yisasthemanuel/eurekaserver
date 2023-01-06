# YISAS EUREKA SERVER

## Introducción

El Eureka Server de Yisas (Yisas' Discovery Server)

## Desarrollo

### Prerequisitos

* Un IDE con soporte al proyecto Lombok (<https://projectlombok.org/>): Eclipse, IntelliJ, Visual Studio Code.
* Máquina versión Java instalada. Bien:
** JKD 1.8 de Oracle
** La JVM OpenJ9 instalada (<https://adoptopenjdk.net/installation.html#linux-pkg>, <https://adoptopenjdk.net/releases.html?variant=openjdk8&jvmVariant=openj9>)
* Maven: No necesario, está integrado en el proyecto mediante "maven wrapper" / mvnw (<https://github.com/takari/maven-wrapper>)
* Docker: para construir y ejecutar imágenes Docker -
** Windows / Mac: <https://www.docker.com/products/docker-desktop>
** WSL (Windows Subsystem Linux) + Docker Desktop: <https://nickjanetakis.com/blog/setting-up-docker-for-windows-and-wsl-to-work-flawlessly>
** WSL + Remote Docker Server: <https://dev.to/sebagomez/installing-the-docker-client-on-windows-subsystem-for-linux-ubuntu-3cgd>
** Ubuntu: <https://docs.docker.com/install/linux/docker-ce/ubuntu/> - Ubuntu

### Configuración

* No hay ninguna configuración adicional, en el application.yml se declaran los endpoints que utilizará prometheus (health, metricas y prometheus)

### Variables de entorno y valores por defecto

No tiene definida ninguna variable de entorno

### Banner de arranque

* Banner generado con la fuente alligator2 (https://devops.datenkollektiv.de/banner.txt/index.html)

### Ejecución en desarrollo

Se deben tener las variables de entorno configuradas y ejecutar, dentro del proyecto, el siguiente comando:

```sh
$ cd eurekaserver
$ ./mvnw spring-boot:run
```

## Docker

### Variables Docker

No hay variables

### Construcción de imagen Docker

El nombre de la imagen se genera a partir de dos propiedades definidas en el pom.xml

${docker.image.prefix}/${artifactId} -> yisasthemanuel/eurekaserver

```sh
$ cd eurekaserver
$ ./mvnw clean package
```

### Ejecución de la imagen

```shell
docker run -d -p 8761:8761 --name yisas-eureka yisasthemanuel/eurekaserver:0.0.2.RELEASE
```

## Changelog [ES]

* **0.0.1 (06/01/2019)** - Versión inicial
* **0.0.2 (06/01/2019)** - Se añaden los endpoints para la intrumentalización general del microservicio por parte de prometheus y grafana

## TO DOs

* Tests