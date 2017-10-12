package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int customer_id;
        String name;
        double sales_amount;
        String tax_code;
        double sales_tax;
        double total_amount;
        double tax_amount = 5;
        double NPF = 0, NRM = 0.6, BIZ = 0.045;
        String answer;

        do {
            System.out.println("enter customer_id:");
            customer_id = sc.nextInt();
            System.out.println(" enter customer_name:");
            name = sc.next();
            System.out.println("sales_amount:");
            sales_amount = sc.nextDouble();

            sales_tax = sales_amount * tax_amount;
            total_amount = sales_amount * sales_tax;
            sc.nextLine();
            System.out.println("enter tax_code: ");
            tax_code = sc.nextLine();
            if (tax_code.equalsIgnoreCase("NPF")) {
                sales_tax = sales_amount * 0;
            } else if (tax_code.equalsIgnoreCase("BIZ")) {
                sales_tax = sales_amount * 0.045;
            } else if (tax_code.equalsIgnoreCase("NRM")) {
                sales_tax = sales_amount * 0.6;
            } else
                {
                System.out.println("0");
            }
            System.out.println("do you want to enter another record: y/N");
                      answer = sc.nextLine();
        }
       while (answer.equalsIgnoreCase("Y"));

        System.out.println("sales report: " + customer_id + "  " + name + " " + sales_amount + "  " + total_amount);

    }

}

