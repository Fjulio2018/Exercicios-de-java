package Contrutores.estoque.app;

import Contrutores.estoque.classes.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );



        System.out.println("Enter with name of product: ");
        String name = sc.nextLine();
        System.out.println("Enter with price of product: ");
        double price = sc.nextDouble();
        System.out.println("Enter with quantity of product: ");
        int quantity = sc.nextInt();

        //Product p1 = new Product( name , price , quantity );
        Product p1 = new Product( name , price  );

        System.out.println("Product data: " + p1 );




        System.out.println("Add more quantity");
         quantity = sc.nextInt();
        p1.AddProducts( quantity );
        System.out.println("Product data update more: " + p1);


        System.out.println("Sub more quantity");
        quantity = sc.nextInt();
        p1.removeProducts( quantity );
        System.out.println("Product data update lass: " + p1);


















        sc.close();

    }
}
