# Taxi Service
This is a very handy application that aims to help organize and coordinate all the inside information of your taxi business.
It is easy to use, has a user-friendly interface and allows you to:
- Create a new car.
- Create a new driver.
- Assign a driver to one or more cars.
- Add detailed vehicle description by creating vehicle manufacturer information.
- Provide a list of cars assigned to each driver.
- Delete cars, drivers and manufacturers.

Allows access only to authorized users, and also provides the ability to register new ones.
This project follows the rules of N-tier Architecture and SOLID. Has DAO, SERVICE and CONTROLLER layers and uses custom Injector class.
### The relations between Car, Driver and Manutacturer are shown in this table:
![car_diagram_db_2_4f50942103](https://user-images.githubusercontent.com/83809337/127296817-e1af8215-1819-49ed-ba0a-6526e71e6542.png)

## Login Page
![2021-07-28](https://user-images.githubusercontent.com/83809337/127278546-766c4314-eec8-49e6-a948-d7e181809230.png)
## Create new User/Driver Page
![2021-07-28 (5)](https://user-images.githubusercontent.com/83809337/127292758-d0997b4b-9966-4952-a578-f68dee75e155.png)
## Menu Page
![2021-07-28 (4)](https://user-images.githubusercontent.com/83809337/127286181-27828f5e-f4d8-4682-b56f-730a3b1e3b58.png)
## List All Cars Page
![2021-07-28 (3)](https://user-images.githubusercontent.com/83809337/127292234-24632505-bbf2-4a2e-a604-ae9b600e685a.png)
## List All Drivers Page
![2021-07-28 (2)](https://user-images.githubusercontent.com/83809337/127292438-83d9f225-bece-4348-b038-636f464c8825.png)
## Add New Car Page
![2021-07-28 (6)](https://user-images.githubusercontent.com/83809337/127293037-de79a48b-7f22-4ab9-98b7-406fcec433b3.png)
## Assign Driver To Car Page
![2021-07-28 (8)](https://user-images.githubusercontent.com/83809337/127293364-09f38b7f-a8e0-44d7-a711-04662f001020.png)
## Add New Manufacturer Page
![2021-07-28 (7)](https://user-images.githubusercontent.com/83809337/127293629-3c476dfb-50bc-4248-951b-0c0085c7ca46.png)

## Technologies used
- Apache Tomcat - version 9.0.46
- MySQL - version 8.0.25
- JDBC
- Servlet
- JSTL
- JSP
- HTML, CSS

## Run Project
To run this project need to have installed 
- IntelliJ IDEA Ultimate [IDEA](https://www.jetbrains.com/idea/download/#section=windows) 
- ApacheTomcat [TOMCAT](https://tomcat.apache.org/download-90.cgi)
- MySQL MySQL Workench [MySQL](https://www.mysql.com/downloads/)

- Fork the project on your IDE
- In MySQL Workbench run the script from resources/init_db.sql.
- In src/main/java/taxi/util/ConnectionUtil change URL, USERNAME and PASSWORD with your data

![2021-07-28 (9)](https://user-images.githubusercontent.com/83809337/127299771-25ceddd3-305a-4108-86ae-f0fe9acc8a69.png)
for exemple



