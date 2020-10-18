package com.company;
import java.util.Scanner;
public class avenger {

        Scanner sc = new Scanner(System.in);
        int age;
        String name,power,weapon,planet;

        public void getDetails()
        {
            System.out.println("The name of the avenger is:-");
            name=sc.nextLine();
            System.out.println("The age of the avenger is:-");
            age=sc.nextInt();
            power=sc.nextLine();
            System.out.println("The power of the avenger is:-");
            power=sc.nextLine();
            System.out.println("The weapon of the avenger is:-");
            weapon=sc.nextLine();
            System.out.println("The planet of the avenger is:-");
            planet=sc.nextLine();
        }
        public void displayDetails()
        {
            System.out.println("The name is:-"+name);
            System.out.println("The age is:-"+age);
            System.out.println("The power is:-"+power);
            System.out.println("The weapon is:-"+weapon);
            System.out.println("The planet is:-"+planet);
        }
}
