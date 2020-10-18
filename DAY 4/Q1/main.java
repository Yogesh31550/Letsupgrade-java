package com.company;

public class main {

    public static void main(String[] args)
    {
        avenger[] marvel=new avenger[5];

        //object created
        for(int i=0;i<5;i++)
        {
            marvel[i]=new avenger();
        }

        //getDetails && displayDetails
        for(int i=0;i<5;i++)
        {
            marvel[i].getDetails();
            marvel[i].displayDetails();
        }
    }
}
