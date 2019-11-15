# Spring-boot-tickets

## Levantar un servidor de mysql con docker
docker run -p 3306:3306 --name mysql-tickets -e MYSQL_ROOT_PASSWORD=devhoss -d mysql

## Ingresar al servidor  y crear una base
docker exec -it mysql-tickets mysql -u root -p

## Compilar proyecto maven
mvn spring-boot:run

## Ingresar a swagger 
http://localhost:8081/swagger-ui.html
