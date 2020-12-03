package ContaBancária.APP;

import ContaBancária.Classes.ContaCorrente;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );
        ContaCorrente conta;


        // Entrada do nome e numero da conta

        System.out.println( "Entre com o nome do Cliente: " );
        String nome = sc.nextLine();

        System.out.println( "Entre com o número de sua conta: " );
        int numeroConta = sc.nextInt();
        sc.hasNextLine();

        System.out.println( "Houve deposito inicial:  Y/N " );
        char depOk = sc.next().charAt( 0 );


        if (depOk == 'Y') {
            System.out.println( "Entre com o valor do depósito: " );
            double depInicial = sc.nextDouble();
            conta = new ContaCorrente( numeroConta, nome, depInicial );

        } else {
            conta = new ContaCorrente( numeroConta, nome );
        }
        System.out.println();
        System.out.println( "Dados da conta: " );
        System.out.println( conta );

        System.out.println();
        char novaOp = 'S';
        while (novaOp == 'S') {
            System.out.println( "Deseja fazer uma operação? Sim (S) / Não (N)" );
            ;
            novaOp = sc.next().charAt( 0 );


            if (novaOp == 'S') {
                System.out.println();
                System.out.println( " Qual operação?  Dep (D) / Saque (S)" );
                char tipoOp = sc.next().charAt( 0 );
                if (tipoOp == 'D') {
                    System.out.println( "Entre com o valor do depósito: " );
                    double valorDep = sc.nextDouble();
                    conta.deposito( valorDep );
                    System.out.println( conta );

                } else {
                    System.out.println( "Entre com o valor do saque: " );
                    double valorSaque = sc.nextDouble();
                    conta.saque( valorSaque );
                    System.out.println( conta );


                }

            } else {
                System.out.println( "Até mais" );
            }

        }


        sc.close();


    }
}
