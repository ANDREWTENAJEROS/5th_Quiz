package com.android.andrewtenajeros.bugtongbugtong;

/**
 * Created by Andrew Tenajeros on 12/26/2017.
 */

public class bugtongs {


    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 21;          //Array maximum size
    public final int TOTAL_SIZE = 6;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 10;
    public bugtongs() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][4];
        answer = new String [MAX_SIZE];

//        bugtong[0] = "WHICH PLANET IS CLOSEST TO THE SUN";
//        choices[0][0] = "VENUS";
//        choices[0][1] = "MERCURY";
//        choices[0][2] = "MARS";
//        choices[0][3] = "EARTH";
//        answer[0] = "B";

        bugtong[1] = "AIR PRESSURE IS MEASURED WITH A";
        choices[1][0] = "RULER";
        choices[1][1] = "BAROMETER";
        choices[1][2] = "THERMOMETER";
        choices[1][3] = "ANEMOMETER";
        answer[1] = "B";


        bugtong[2] = "WHAT FORCE IS USED TO LAUNCH WATER ROCKETS";
        choices[2][0] = "AIR PRESSURE";
        choices[2][1] = "FRICTION";
        choices[2][2] = "GRAVITY";
        choices[2][3] = "MAGNET";
        answer[2] = "A";

        bugtong[3] = "WHO COMPILED THE THREE LAWS OF MOTION";
        choices[3][0] = "GALILEO";
        choices[3][1] = "NEWTON";
        choices[3][2] = "EINSTEIN";
        choices[3][3] = "TESLA";
        answer[3] = "B";

        bugtong[4] = "WHAT IS AN ELEMENT OF FORCE";
        choices[4][0] = "PUSH OR PULL";
        choices[4][1] = "MOTION";
        choices[4][2] = "WEIGHT";
        choices[4][3] = "MASS";
        answer[4] = "A";

        bugtong[5] = "BODY LEANS TO A SIDE WHEN TAKING SHARP TURN BECAUSE OF";
        choices[5][0] = "MASS";
        choices[5][1] = "FRICTION";
        choices[5][2] = "GRAVITY";
        choices[5][3] = "INERTIA";
        answer[5] = "D";

        bugtong[6] = "WHICH PLANET IS CLOSEST TO THE SUN";
        choices[6][0] = "VENUS";
        choices[6][1] = "MERCURY";
        choices[6][2] = "MARS";
        choices[6][3] = "EARTH";
        answer[6] = "B";

        bugtong[7] = "ANSWER IS : D";
        choices[7][0] = "7A";
        choices[7][1] = "B";
        choices[7][2] = "C";
        choices[7][3] = "D";
        answer[7] = "D";

        bugtong[8] = "ANSWER IS : D";
        choices[8][0] = "8A";
        choices[8][1] = "B";
        choices[8][2] = "C";
        choices[8][3] = "D";
        answer[8] = "D";

        bugtong[9] = "ANSWER IS : D";
        choices[9][0] = "9A";
        choices[9][1] = "B";
        choices[9][2] = "C";
        choices[9][3] = "D";
        answer[9] = "D";

        bugtong[10] = "ANSWER IS : D";
        choices[10][0] = "10A";
        choices[10][1] = "B";
        choices[10][2] = "C";
        choices[10][3] = "D";
        answer[10] = "D";

        bugtong[11] = "ANSWER IS : D";
        choices[11][0] = "11A";
        choices[11][1] = "B";
        choices[11][2] = "C";
        choices[11][3] = "D";
        answer[11] = "D";

        bugtong[12] = "ANSWER IS : C";
        choices[12][0] = "12A";
        choices[12][1] = "B";
        choices[12][2] = "C";
        choices[12][3] = "D";
        answer[12] = "C";

        bugtong[13] = "ANSWER IS : B";
        choices[13][0] = "13A";
        choices[13][1] = "B";
        choices[13][2] = "C";
        choices[13][3] = "D";
        answer[13] = "B";

        bugtong[14] = "ANSWER IS : D";
        choices[14][0] = "14A";
        choices[14][1] = "B";
        choices[14][2] = "C";
        choices[14][3] = "D";
        answer[14] = "D";

        bugtong[15] = "ANSWER IS : D";
        choices[15][0] = "15A";
        choices[15][1] = "B";
        choices[15][2] = "C";
        choices[15][3] = "D";
        answer[15] = "D";

        bugtong[16] = "ANSWER IS : D";
        choices[16][0] = "16A";
        choices[16][1] = "B";
        choices[16][2] = "C";
        choices[16][3] = "D";
        answer[16] = "D";

        bugtong[17] = "ANSWER IS : D";
        choices[17][0] = "17A";
        choices[17][1] = "B";
        choices[17][2] = "C";
        choices[17][3] = "D";
        answer[17] = "D";

        bugtong[18] = "ANSWER IS : D";
        choices[18][0] = "18A";
        choices[18][1] = "B";
        choices[18][2] = "C";
        choices[18][3] = "D";
        answer[18] = "D";

        bugtong[19] = "ANSWER IS : D";
        choices[19][0] = "19A";
        choices[19][1] = "B";
        choices[19][2] = "C";
        choices[19][3] = "D";
        answer[19] = "D";

        bugtong[20] = "ANSWER IS : D";
        choices[20][0] = "20A";
        choices[20][1] = "B";
        choices[20][2] = "C";
        choices[20][3] = "D";
        answer[20] = "D";

//        bugtong[21] = "ANSWER IS : D";
//        choices[1][0] = "A";
//        choices[1][1] = "B";
//        choices[1][2] = "C";
//        choices[1][3] = "D";
//        answer[21] = "D";
//
//        bugtong[22] = "ANSWER IS : C";
//        choices[2][0] = "A";
//        choices[2][1] = "B";
//        choices[2][2] = "C";
//        choices[2][3] = "D";
//        answer[22] = "C";
//
//        bugtong[23] = "ANSWER IS : B";
//        choices[3][0] = "A";
//        choices[3][1] = "B";
//        choices[3][2] = "C";
//        choices[3][3] = "D";
//        answer[23] = "B";
//
//        bugtong[24] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[24] = "D";
//
//        bugtong[25] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[25] = "D";
//
//        bugtong[26] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[26] = "D";
//
//        bugtong[27] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[27] = "D";
//
//        bugtong[28] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[28] = "D";
//
//        bugtong[29] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[29] = "D";
//
//        bugtong[30] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[30] = "D";
//
//        bugtong[31] = "ANSWER IS : D";
//        choices[1][0] = "A";
//        choices[1][1] = "B";
//        choices[1][2] = "C";
//        choices[1][3] = "D";
//        answer[31] = "D";
//
//        bugtong[32] = "ANSWER IS : C";
//        choices[2][0] = "A";
//        choices[2][1] = "B";
//        choices[2][2] = "C";
//        choices[2][3] = "D";
//        answer[32] = "C";
//
//        bugtong[33] = "ANSWER IS : B";
//        choices[3][0] = "A";
//        choices[3][1] = "B";
//        choices[3][2] = "C";
//        choices[3][3] = "D";
//        answer[33] = "B";
//
//        bugtong[34] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[34] = "D";
//
//        bugtong[35] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[35] = "D";
//
//        bugtong[36] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[36] = "D";
//
//        bugtong[37] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[37] = "D";
//
//        bugtong[38] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[38] = "D";
//
//        bugtong[39] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[39] = "D";
//
//        bugtong[40] = "ANSWER IS : D";
//        choices[1][0] = "A";
//        choices[1][1] = "B";
//        choices[1][2] = "C";
//        choices[1][3] = "D";
//        answer[40] = "D";
//
//        bugtong[41] = "ANSWER IS : D";
//        choices[1][0] = "A";
//        choices[1][1] = "B";
//        choices[1][2] = "C";
//        choices[1][3] = "D";
//        answer[41] = "D";
//
//        bugtong[42] = "ANSWER IS : C";
//        choices[2][0] = "A";
//        choices[2][1] = "B";
//        choices[2][2] = "C";
//        choices[2][3] = "D";
//        answer[42] = "C";
//
//        bugtong[43] = "ANSWER IS : B";
//        choices[3][0] = "A";
//        choices[3][1] = "B";
//        choices[3][2] = "C";
//        choices[3][3] = "D";
//        answer[43] = "B";
//
//        bugtong[44] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[44] = "D";
//
//        bugtong[45] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[45] = "D";
//
//        bugtong[46] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[46] = "D";
//
//        bugtong[47] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[47] = "D";
//
//        bugtong[48] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[48] = "D";
//
//        bugtong[49] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[49] = "D";
//
//        bugtong[50] = "ANSWER IS : D";
//        choices[4][0] = "A";
//        choices[4][1] = "B";
//        choices[4][2] = "C";
//        choices[4][3] = "D";
//        answer[50] = "D";
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
