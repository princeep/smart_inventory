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
            e.printStackTrace();
        }
    }

    @Override
    public void viewProducts(){
        String sql = "select * from products";

        try{
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("category") + " | " +
                                rs.getDouble("price") + " | " +
                                rs.getInt("quantity")
                );
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateProduct(Product product) {

        String sql =
                "update products set quantity=? where id=?";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,
                    product.getQuantity());

            ps.setInt(2,
                    product.getId());

            ps.executeUpdate();

            System.out.println("Updated");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
