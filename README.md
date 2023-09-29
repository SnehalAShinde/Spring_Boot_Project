
#  SS-Beauty-Products Business Management Web Application : <br>


<img width="960" alt="Home Page" src="https://github.com/SnehalAShinde/Spring_Boot_Project/assets/126142130/3e29d81e-ac4d-4e4c-98fe-9aaf600867a3">


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

1. Clone the repository : $ git clone https://github.com/SnehalAShinde/Spring_Boot_Project.git <br>

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
<img width="960" alt="Product Page" src="https://github.com/SnehalAShinde/Spring_Boot_Project/assets/126142130/afbd9286-8ca1-4708-9586-b6fed113cac3">



#### Location 

<img width="960" alt="Location page" src="https://github.com/SnehalAShinde/Spring_Boot_Project/assets/126142130/880e2a07-f155-4f22-baa6-ce7a5377a379">


#### Login Page

<img width="960" alt="Login Page" src="https://github.com/SnehalAShinde/Spring_Boot_Project/assets/126142130/29641b29-9181-4ac9-8037-5740baf269ff">


#### AdminPanel


<img width="960" alt="Admin Page" src="https://github.com/SnehalAShinde/Spring_Boot_Project/assets/126142130/54684ea2-e0f0-456f-9c35-d98b0a30e3e1">


