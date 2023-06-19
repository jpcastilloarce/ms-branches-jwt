# Getting Started

## Run following SQL insert statements (PostgreSQL)
```
CREATE DATABASE branchdb;
```

## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`
```
spring.datasource.url= jdbc:postgresql://localhost:5432/branchdb
spring.datasource.username= postgres
spring.datasource.password= 123

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update

# App Properties
equifax.msbranchesjwt.jwtSecret= ======================Spring===========================
equifax.msbranchesjwt.jwtExpirationMs= 86400000
```

## Install dependencies
```
mvn clean install
```

## Run test
```
mvn test
```

## Run Spring Boot application
```
mvn spring-boot:run
```

## Run following SQL insert statements (PostgreSQL)
```
INSERT INTO branch(id,name,address,latitude, longitude) VALUES(1,'Providencia', 'Est. Metro Tobalaba Local 04', '-33.4184663','-70.6034608');
INSERT INTO branch(id,name,address,latitude, longitude) VALUES(2,'Puerto Montt', 'OHiggins 167, Edificio Plaza of 201', '-41.4713186','-72.942401');
INSERT INTO branch(id,name,address,latitude, longitude) VALUES(3,'Temuco', 'Claro Solar 780, Local 1 y 2', '-38.7394164','-72.5938003');
INSERT INTO branch(id,name,address,latitude, longitude) VALUES(4,'La Serena', 'Pedro Pablo Muñoz 550', '-29.9039801','-71.2565655');

INSERT INTO users(id,username,password) VALUES(1,'user','$2a$10$o4vbAE/sJtxgMSdz1tzX3.M6Wyg3bnAUnSAsVGpnqhdfdb3ofvw66');
INSERT INTO users(id,username,password) VALUES(2,'user1','$2a$10$Tac5n8IiRgfdip8slribi.cPdsar.PnKZ1xOIGI.XQE/M8sXQdzby');
INSERT INTO users(id,username,password) VALUES(3,'user2','$2a$10$c4fbMXcA5q9Z6My2D4O8Iu.AdS9LcTflZhM1IFRsrAENmzt6lBlEO');
INSERT INTO users(id,username,password) VALUES(4,'user3','$2a$10$PsjRgpdgZ.oyjeOWmRpY/O7sVo9rDPW2shFJv73Zcu1ME1tP666I2');
```