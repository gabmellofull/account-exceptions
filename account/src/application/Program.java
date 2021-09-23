package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double limit = sc.nextDouble();

            Account gabriel = new Account(number, holder, balance, limit);

            System.out.print("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();

        try {
            gabriel.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", gabriel.getBalance());
        }
        catch (DomainException e){
            System.out.println("Erro na operação: " + e.getMessage());
        }



    }

}
