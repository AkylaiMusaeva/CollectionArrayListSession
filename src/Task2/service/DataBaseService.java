package Task2.service;

import Task2.model.DataBase;
import Task2.model.Product;
import Task2.model.Shop;

import java.util.List;

public interface DataBaseService {
    void searchName(String name);
    Shop addProductToShop(Shop shop,List <Product> product);
    Shop deleteProduct(String name);



}
