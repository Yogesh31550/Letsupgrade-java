package com.QuizApplication;
import java.util.Scanner;
public class Question
{
    Scanner sc= new Scanner(System.in);
    String questions,option1,option2,option3,option4;
    int CorrectAns,UserAns;


    public boolean AskQuestions()
    {
        System.out.println("Questions:-"+questions);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Please select a option");
        UserAns=sc.nextInt();
        if(CorrectAns==UserAns)
        {
            return true;
        }
        return false;
    }
}
