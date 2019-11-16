# Spring-boot-tickets
## parte 1

## Levantar un servidor de mysql con docker
docker run -p 3306:3306 --name mysql-tickets -e MYSQL_ROOT_PASSWORD=devhoss -d mysql

## Ingresar al servidor  y crear una base
docker exec -it mysql-tickets mysql -u root -p

## Compilar proyecto maven
mvn spring-boot:run

## Ingresar a swagger 
http://localhost:8080/swagger-ui.html

## docker compose generar compilacion correcta
 docker-compose build

 ## ejecutar docker compose
 docker-compose up
 
## parte 2
docker build --tag hhvelascoa/app-ticket:1.0 .

## secrets k8s
$ kubectl create secret generic mysql-root-pass --from-literal=password=R00t

$ kubectl create secret generic mysql-user-pass --from-literal=username=devhoss --from-literal=password=devhoss

kubectl create secret generic mysql-db-url --from-literal=database=tickets --from-literal=url='jdbc:mysql://ticket-app-mysql:3306/tickets'


# deploy server app 
    kubectl apply -f app-server

# deploy server bd
    kubectl apply -f bd

 # forward
 kubectl  port-forward service/ticket-app-server 8080:8080   
