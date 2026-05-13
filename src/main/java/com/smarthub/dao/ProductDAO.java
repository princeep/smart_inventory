package main.java.com.smarthub.dao;
import main.java.com.smarthub.model.Product;

public interface ProductDAO {
    void addProduct(Product product);

    void viewProducts();

    void updateProduct(Product product);

    void deleteProduct(int id);
}
