package com.android.andrewtenajeros.bugtongbugtong;

/**
 * Created by Andrew Tenajeros on 12/26/2017.
 */

public class bugtongs {


    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 5;          //Array maximum size
    public final int TOTAL_SIZE = 5;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public bugtongs() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

        bugtong[0] = "ANSWER IS : A";
        choices[0][0] = "A";
        choices[0][1] = "B";
        choices[0][2] = "C";
        choices[0][3] = "D";
        answer[0] = "A";

        bugtong[1] = "ANSWER IS : D";
        choices[1][0] = "A";
        choices[1][1] = "B";
        choices[1][2] = "C";
        choices[1][3] = "D";
        answer[1] = "D";

        bugtong[2] = "ANSWER IS : C";
        choices[2][0] = "A";
        choices[2][1] = "B";
        choices[2][2] = "C";
        choices[2][3] = "D";
        answer[2] = "C";

        bugtong[3] = "ANSWER IS : B";
        choices[3][0] = "A";
        choices[3][1] = "B";
        choices[3][2] = "C";
        choices[3][3] = "D";
        answer[3] = "B";

        bugtong[4] = "ANSWER IS : D";
        choices[4][0] = "A";
        choices[4][1] = "B";
        choices[4][2] = "C";
        choices[4][3] = "D";
        answer[4] = "D";
    }

    public String getbugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
