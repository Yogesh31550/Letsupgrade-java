package com.company;
import java.util.Scanner;
public class number {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("Enter Any 5 values:-");
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("The ODD no are:-");
        for(int i=0;i<5;i++)
        {
            if(num[i]%2 !=0)
            {
                System.out.println(num[i]);
            }
        }
    }
}
