package com.company;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// variable declaration
        final byte months = 12 ;
        final byte percent = 100;
        //scanner
        Scanner scanner = new Scanner(System.in);
        //principal
        System.out.print("Principal :");
        int principal = scanner.nextInt();
        //Annual Interset rate
        System.out.print("Annual Interset Rate :");
        float annualInterset = scanner.nextFloat();
        //period rate
        System.out.print("Rate :");
        int period = scanner.nextInt();

        //solution
        float monthlyInterset = annualInterset / percent / months;
        int numberOfpayment = period * months ;
        double mortgage = principal *(monthlyInterset * Math.pow(1 + monthlyInterset , numberOfpayment)
                /(Math.pow(1+ monthlyInterset,numberOfpayment)-1));

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage Value :"+ mortgageFormat);
    }
}
