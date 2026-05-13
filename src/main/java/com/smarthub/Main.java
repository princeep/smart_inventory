package main.java.com.smarthub;

import main.java.com.smarthub.dao.ProductDAOImpl;
import main.java.com.smarthub.model.Product;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ProductDAOImpl dao =
                new ProductDAOImpl();

        while (true) {

            System.out.println("\n1 Add");
            System.out.println("2 View");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name =
                            sc.nextLine();

                    System.out.print("Category: ");
                    String category =
                            sc.nextLine();

                    System.out.print("Price: ");
                    double price =
                            sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty =
                            sc.nextInt();

                    dao.addProduct(
                            new Product(
                                    name,
                                    category,
                                    price,
                                    qty
                            )
                    );

                    break;

                case 2:

                    dao.viewProducts();

                    break;

                case 3:

                    System.out.print("Id: ");
                    int id =
                            sc.nextInt();

                    System.out.print("New Quantity: ");
                    int quantity =
                            sc.nextInt();

                    dao.updateProduct(
                            new Product(
                                    id,
                                    null,
                                    null,
                                    0,
                                    quantity
                            )
                    );

                    break;

                case 4:

                    System.out.print("Id: ");

                    dao.deleteProduct(
                            sc.nextInt()
                    );

                    break;

                case 5:

                    System.exit(0);
            }
        }
    }
}