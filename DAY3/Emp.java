package com.company;

import java.util.Scanner;

public class Emp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int date,month,year,age,salary,annual,tax;
        System.out.println("Enter Employee Name:");
        name=sc.nextLine();
        System.out.println("Enter your birth date:");
        date=sc.nextInt();
        System.out.println("Enter your birth month:");
        month=sc.nextInt();
        System.out.println("Enter your birth year:");
        year=sc.nextInt();
        System.out.println("Enter your montly salary:");
        salary=sc.nextInt();
        age=2020-year;
        if(month>10)
        {
            age--;
        }
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        annual=salary*12;
        System.out.println("The annual salary is"+annual);
        if(annual>=500000)
        {
            tax=annual*20/100;
            System.out.println("The tax is"+tax);
        }
        else if(annual<500000 && annual>=400000)
        {
            tax=annual*15/100;
            System.out.println("The tax is"+tax);
        }
        else if(annual<400000 && annual>=300000)
        {
            tax=annual*10/100;
            System.out.println("The tax is"+tax);
        }
        else if(annual<300000 && annual>=200000)
        {
            tax=annual*5/100;
            System.out.println("The tax is"+tax);
        }
        else
        {
            System.out.println("No need to pay the tax");
        }
    }
}
