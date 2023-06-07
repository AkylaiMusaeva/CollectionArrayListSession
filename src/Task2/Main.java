package Task2;

import Task2.model.*;
import Task2.service.DataBaseService;
import Task2.service.serviceImpl.ClientServiceImpl;
import Task2.service.serviceImpl.DataBaseImpl;
import Task2.service.serviceImpl.ProductServiceImpl;
import Task2.service.serviceImpl.ShopServiceImpl;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ;
        ProductServiceImpl productService=new ProductServiceImpl();
        Product product1=new Product("apple",120,"red apples");
        Product product2=new Product("bread",30,"bread");
        Product product3=new Product("juice",150,"cherry juice");
        Product product4=new Product("rice",180,"uzgen rice");
        ArrayList<Product>products=new ArrayList<>(List.of(product1,product2,product3,product4));
        ArrayList<Product>newProduct=new ArrayList<>(List.of(product1));

        ClientServiceImpl clientService=new ClientServiceImpl();
        Client client1=new Client("Akylai",21, Gender.FEMALE,"akumusaeva01@gmail.com",4354);
        Client client2=new Client("Temirlan",54, Gender.MALE,"tima@gmail.com",1234);
        Client client3=new Client("Iskender",36, Gender.MALE,"iso@gmail.com",2345);
        ArrayList<Client>clients=new ArrayList<>(List.of(client1,client2,client3));

        System.out.println("--------Get all products----------");
        System.out.println(productService.getAllProduct(products));
        System.out.println("\n--------Get all clients----------");
        System.out.println(clientService.getAllClients(clients));

        System.out.println("\n--------Get all shops----------");
        ShopServiceImpl shopService=new ShopServiceImpl();
        Shop shop1=new Shop("Frunze","Ahunbaev");
        Shop shop2=new Shop("Globus","Manas");
        ArrayList<Shop>shops=new ArrayList<>(List.of(shop1,shop2));
        System.out.println(shopService.getAllStore(shops));


        System.out.println("\n--------Search by uni name----------");
        DataBase dataBase = new DataBase(products,clients,shops);
        DataBaseImpl dataBase1=new DataBaseImpl(dataBase);
        dataBase1.searchName("apple");
        System.out.println("\n--------Add product to shop----------");
        System.out.println(dataBase1.addProductToShop(shop1,products));
        System.out.println("\n--------Delete product by name----------");
        System.out.println(dataBase1.deleteProduct("apple"));






    }
}
