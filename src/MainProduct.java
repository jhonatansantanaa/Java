import entities.exercicioProduct.Product;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

    public static void main(String[] args) {
        Product product;
        product = new Product();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------- SYSTEM ADD PRODUCT -------");
        System.out.println("Enter product name: ");
        product.name = sc.nextLine();

        System.out.println("Enter product price: ");
        product.price = sc.nextDouble();

        System.out.println("Enter product qtdInStock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int addNewValueProduct = sc.nextInt();
        product.AddProductToStock(addNewValueProduct);

        System.out.println("Updated product data: " + product);

        System.out.println("Enter the number of products to be remove in stock: ");
        int removeValueProduct = sc.nextInt();
        product.RemoveProducts(removeValueProduct);

        System.out.println("Updated product data: " + product);

    }

}
