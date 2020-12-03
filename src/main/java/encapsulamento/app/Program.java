package encapsulamento.app;



import encapsulamento.classes.Product;

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

        Product p1 = new Product( name , price , quantity );
        //Product p1 = new Product( name , price  );

//        System.out.println("Product data: " + p1 );


        //mudamos o nome e o preço do produto com o set.name  e set.price.
        p1.setName( "computer" );
        System.out.println("Este é o novo nome do produto agora: " + p1.getName() );
        System.out.println();
        p1.setPrice( 22000.00 );
        System.out.println("Este é o novo preço agora: " + p1.getPrice() );
        System.out.println();


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
