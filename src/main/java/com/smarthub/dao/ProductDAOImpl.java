package main.java.com.smarthub.dao;
import main.java.com.smarthub.config.DBConnection;
import main.java.com.smarthub.model.Product;
import  java.sql.*;
public class ProductDAOImpl implements ProductDAO {
    @Override
    public void addProduct(Product product){
        String sql = "insert into products(name,category,price,quantity) values(?,?,?,?)";
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,product.getName());

            ps.setString(2, product.getCategory());

            ps.setDouble(3,product.getPrice());

            ps.setInt(4,product.getQuantity());

            ps.executeUpdate();
            System.out.println("Product added");

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
