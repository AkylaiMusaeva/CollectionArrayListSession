package Task2.model;

import Task2.model.Client;
import Task2.model.Product;

import java.util.List;

public class Shop {
    private String name;
    private String address;
    private List<Product>products;
    private List <Client> clients;
    public Shop(){

    }

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Shop(String name, String address, List<Product> products, List<Client> clients) {
        this.name = name;
        this.address = address;
        this.products = products;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "\nShop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                ", clients=" + clients +
                '}';
    }
}
