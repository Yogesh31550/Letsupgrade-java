package com.QuizApplication;

public class Game
{
    Question[] questions=new Question[3];
    Player player=new Player();

    public void initGame()
    {
        // 3 objects created.
        for(int i=0;i<3;i++)
        {
            questions[i]=new Question();
        }
        //Applying value to the variables
        questions[0].questions="Who is the MC of ONE PUNCH MAN";
        questions[0].option1="SAITAMA";
        questions[0].option2="GOKU";
        questions[0].option3="GENOS";
        questions[0].option4="TANJIRO";
        questions[0].CorrectAns=1;

        questions[1].questions="From whom did NATSU inherits the DRAGON SLAYER MAGIC";
        questions[1].option1="METALICANA";
        questions[1].option2="GRANDEENEY";
        questions[1].option3="IGNEEL";
        questions[1].option4="ACNALOGIA";
        questions[1].CorrectAns=3;

        questions[2].questions="What is NARUTO'S TAILED BEAST name";
        questions[2].option1="KURAMA";
        questions[2].option2="SON KUN";
        questions[2].option3="SHUKAKU";
        questions[2].option4="MATATABI";
        questions[2].CorrectAns=1;
    }

    public void play()
    {
        player.getDetails();
        for(int i=0;i<3;i++)
        {
           boolean status= questions[i].AskQuestions();
           if(status==true)
           {
               System.out.println("SUGOI YOU GOT IT RIGHT");
               player.score= player.score+5;
           }
           else
           {
               System.out.println("CHIGAU YOU GOT IT WRONG");
           }
        }
        System.out.println(player.name+" Your Score is "+player.score);
    }
}
