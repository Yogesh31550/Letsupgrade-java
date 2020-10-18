package com.company;
import java.util.Scanner;
public class num {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        System.out.println("Enter any 5 no:-");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("The sum is:-"+sum);
    }
}
