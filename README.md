
#  SS-Beauty-Products Business Management Web Application : <br>

<img width="960" alt="Home Page" src="https://github.com/SnehalAShinde/SS-Beauty-Products/assets/126142130/97129941-f081-4a49-a1d1-d907d2687394">


## Project Desc : Business Management Web Application 
  => The Business Management web application is a comprehensive tool designed to help businesses manage various aspects of their operations. 
          It provides a user-friendly interface for tasks like managing customer data, inventory, orders, and more.


## Features  :

- **Customer Management**: Easily add, update, and delete customer information.
- **Inventory Management**: Keep track of your inventory items, including stock levels and pricing.
- **User Authentication**: Secure login and authentication for admin and staff members.
- **Role-Based Access Control**: Define roles and permissions for different user types.
- **Thymeleaf Templates**: Utilizes Thymeleaf for dynamic HTML templates.
- **Database Integration**: Integrated with MySQL for data storage.


## Technologies Used :

- Spring Boot: Backend framework for building Java-based web applications.
- Thymeleaf: Server-side Java template engine for dynamic HTML generation.
- MySQL: Relational database management system for data storage.
- IDE/Tool : Spring Tool Suite 4 (Eclipse)


## Installation :

1. Clone the repository : $ git clone https://github.com/SnehalAShinde/SS_Beauty-Products.git <br>

2. Import the project inside STS/Eclipse : <br>
     - Open STS/Eclipse > file > import > maven > existing project > browse > finish . <br>
     
3. Make sure you are in the SS_Beauty_Products directory. <br>

4.Configure the database connection in application.properties (check the Database section for more information). <br>

5.Run the project (by running main method is SsBeautyProductsApplication.java) OR right clink on the project > Run As > Spring Boot App. <br>

6.Open http://localhost:8080/home in any browser. <br>

7.Now your tables will be created in the databse. <br>
   - You have to add one admin data manually to login as admin, So add one admin data. <br>
    

## Database :

MySQL can be used as the database for this project. 
The database connection can be configured in the application.properties file, with the appropriate values for the following properties: <br>

spring.datasource.name=[Your Database Name] <br>
spring.datasource.url=jdbc:mysql://localhost:3306/[Your Database Name] <br>
spring.datasource.password=[Your password] <br>
spring.datasource.username=[Your username] <br>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <br>
spring.jpa.hibernate.ddl-auto=update <br>



## Preview :

#### Products 
<img width="960" alt="Product Page" src="https://github.com/SnehalAShinde/SS-Beauty-Products/assets/126142130/cb7fea22-6981-4764-afa0-4f33bc2ad7a5">


#### Location 
<img width="960" alt="Location page" src="https://github.com/SnehalAShinde/SS-Beauty-Products/assets/126142130/c22e4cb2-68a8-416f-851e-44dd11d35e5a">


#### Login Page

<img width="960" alt="Login Page" src="https://github.com/SnehalAShinde/SS-Beauty-Products/assets/126142130/c2cfaf54-f2ab-4d42-a815-a66254516d9e">

#### AdminPanel
<img width="960" alt="Admin Page" src="https://github.com/SnehalAShinde/SS-Beauty-Products/assets/126142130/9537b47d-1dd9-48eb-9334-05f922255ed2">



