package Task2.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Product> products;
    private List<Client> clients;
    private List<Shop> shops;

    public DataBase(){

    }
    public DataBase(List<Product> products, List<Client> clients, List<Shop> shops) {
        this.products = products;
        this.clients = clients;
        this.shops = shops;
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

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }



    @Override
    public String toString() {
        return "DataBase{" +
                "products=" + products +
                ", clients=" + clients +
                ", shops=" + shops +
                '}';
    }
}
