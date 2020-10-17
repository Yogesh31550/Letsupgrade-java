package com.company;

import java.util.Scanner;

public class subject {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5,sum;
        double per;
        System.out.println("Enter mark of English subject :");
        m1=sc.nextInt();
        System.out.println("Enter mark of Math subject :");
        m2=sc.nextInt();
        System.out.println("Enter mark of History subject :");
        m3=sc.nextInt();
        System.out.println("Enter mark of Science subject :");
        m4=sc.nextInt();
        System.out.println("Enter mark of Civics subject :");
        m5=sc.nextInt();
        sum=m1+m2+m3+m4+m5;
        per=sum*100/500;
        System.out.println("Your percentage is"+per);
        if(per>=90)
        {
            System.out.println("YOU HAVE A+ GRADE");
        }
        else if(per<90 && per>=80)
        {
            System.out.println("YOU HAVE A GRADE");
        }
        else if(per<80 && per>=60)
        {
            System.out.println("YOU HAVE B GRADE ");
        }
        else if(per<70 && per>=50)
        {
            System.out.println("YOU HAVE C GRADE");
        }
        else if(per<50 && per>=35)
        {
            System.out.println("YOU HAVE D GRADE");
        }
        else
        {
            System.out.println("YOU ARE FAILED!!!!!");
        }
    }
}
