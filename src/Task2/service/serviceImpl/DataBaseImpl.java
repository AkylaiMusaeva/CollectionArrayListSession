package Task2.service.serviceImpl;

import Task2.model.Client;
import Task2.model.DataBase;
import Task2.model.Product;
import Task2.model.Shop;
import Task2.service.DataBaseService;

import java.util.ArrayList;
import java.util.List;

public class DataBaseImpl  implements DataBaseService {
    DataBase dataBase=new DataBase();
    public DataBaseImpl() {

    }
    public DataBaseImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void searchName(String name) {
        for (int i = 0; i < dataBase.getShops().size(); i++) {
            if(dataBase.getShops().get(i).getName().equals(name)){
                System.out.println(dataBase.getShops().get(i));
            }
        }
        for (int i = 0; i <dataBase.getProducts().size() ; i++) {
            if(dataBase.getProducts().get(i).getName().equals(name)){
                System.out.println(dataBase.getProducts().get(i));
            }
        }
        for (int i = 0; i < dataBase.getClients().size(); i++) {
            if(dataBase.getClients().get(i).getName().equals(name)){
                System.out.println(dataBase.getClients().get(i));
            }

        }
    }

    @Override
    public Shop addProductToShop(Shop shop,List <Product> product) {
        shop.setProducts(product);
        //dataBase.getProducts().add(new Product("apple",100,"red apple"));
        return shop;
    }

    @Override
    public Shop deleteProduct(String name) {
        for (int i = 0; i < dataBase.getProducts().size() ; i++) {
            if(dataBase.getProducts().get(i).getName().equals(name)){
                dataBase.getProducts().remove(dataBase.getProducts().get(i));
            }
        }
        System.out.println(dataBase.getProducts());

//        for(int i=0;i< product.size();i++){
//            if(dataBase.getProducts().get(i).getName().equals(name)){
//                dataBase.getProducts().remove(product.get(i));
//            }
//        }
//        System.out.println("We successfully deleted product\nProducts we have after deleting ");
//        System.out.println(dataBase.getProducts());
        return null;
    }
}
