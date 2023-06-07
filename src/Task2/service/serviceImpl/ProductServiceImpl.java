package Task2.service.serviceImpl;

import Task2.model.DataBase;
import Task2.model.Product;
import Task2.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    DataBase dataBase=new DataBase();

    @Override
    public List<Product> getAllProduct(List<Product> products) {
        return products;
    }
}
