import java.util.Random;
import java.util.Scanner;

public class Main{
public static  char [][]ticTac={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
public static Scanner input = new Scanner(System.in);
public static int roundX=0;
public static int roundO=0;
public static int round=0;
// I put all variables public to easy use it in all methods

public static void main(String[] args) {
    int inputRound;

        System.out.println("Do you want to play the tic tac one round or three ? choose 1 or 3");
        switch (input.nextInt()){
            case 1:   countRound();System.out.println("Round is O: "+roundO+" \t X:"+roundX);
            break;
            case 3:
                int i=0;
                for ( i=0;i<3;i++){
                    displayTicTac();countRound();restArray();}
                if (roundX==i){
                    System.out.println("Congratulation You're winner in 3 times round");
                }else if (roundX==2){System.out.println("Good job You're winner in 2 times round");
                }else {System.out.println("Round Random ( O ) is : "+roundO+" \t Your round is: "+roundX);}

                break;
            default:
                System.out.println("Round is O: "+roundO+" \t X:"+roundX);
        }


//    while (true) {//till one of if (playround or randomround comes true then break from while
//        //displayTicTac();
//
//        playerround();
//        if (isArrayFully()){displayTicTac();break;}
//        randomPlayer();
//        if (isArrayFully()){displayTicTac(); break;}
//        displayTicTac(); // one diplay tictac this after random choose
//    }//end while (true)

    // displayTicTac();


}//end main
//---------------------------------Method To count round ---------------
    public static void countRound(){
    //displayTicTac();
        while (true) {//till one of if (playround or randomround comes true then break from while
            //displayTicTac();

            playerround();
            if (isArrayFully()){displayTicTac();break;}
            randomPlayer();
            if (isArrayFully()){displayTicTac(); break;}
            displayTicTac(); // one diplay tictac this after random choose
            round+=1;
        }//end while (true)

    }
//------------------------------isArrayFully----------------------------
public static boolean isArrayFully() {

    if (whosWin( 'X')) {// here check if Array 2D is full with win x
        roundX+=1;
        System.out.println("Player wins!, Round is "+roundX);
        return true;
    }

    if (whosWin( 'O')) {//// here check if Array 2D is full with win x
       roundO+=1; System.out.println("Random wins!");
        return true;
    }
//else for loop all array to check is it full with x or o
    for (int i = 0; i < ticTac.length; i++) {
        for (int j = 0; j < ticTac[i].length; j++) {
            if (ticTac[i][j]=='x'||ticTac[i][j]=='o'||ticTac[i][j]=='X'||ticTac[i][j]=='O') {
                return false;
            }
        }
    }
    displayTicTac();
    System.out.println("The tic tac fully no one win ");
    return true;
}

//----------------------------------------whosWin Methods-----------------------------------------
public static boolean whosWin( char x_or_0) {
    if (ticTac[0][0] == x_or_0 && ticTac [0][1] == x_or_0 && ticTac [0][2] == x_or_0) {return true;}//frist row
    else if(ticTac[1][0] == x_or_0 && ticTac [1][1] == x_or_0 && ticTac [1][2] == x_or_0) {return true;}//secon row
    else if (ticTac[2][0] == x_or_0 && ticTac [2][1] == x_or_0 && ticTac [2][2] == x_or_0) {return true;}//third row
    else if(ticTac[0][0] == x_or_0 && ticTac [1][0] == x_or_0 && ticTac [2][0] == x_or_0) {return true;}// first columns
    else if(ticTac[0][1] == x_or_0 && ticTac [1][1] == x_or_0 && ticTac [2][1] == x_or_0) {return true;}// first back \
    else if(ticTac[0][2] == x_or_0 && ticTac [1][2] == x_or_0 && ticTac [2][2] == x_or_0) {return true;}//third columns
    else if(ticTac[0][0] == x_or_0 && ticTac [1][1] == x_or_0 && ticTac [2][2] == x_or_0) {return true;}///second back \
    else if(ticTac[0][2] == x_or_0 && ticTac [1][1] == x_or_0 && ticTac [2][0] == x_or_0)  {return true;}//second back \
    return false;
}

//------------------------------randomPlayer---------------------------
public static void randomPlayer() {
    Random random = new Random();
    int position;
    while (true) {
        position = random.nextInt(9) + 1;
        if (checkPosition( Integer.toString(position))) {
            break;
        }
    }
    System.out.println("Random chose " + position);// to show me which position random chosen
     bookPosition(Integer.toString(position), 'O');
}

//----------------------------checkPosition----------------------------
public static boolean checkPosition (String position) {
    switch(position) {
        case "1":
            if (ticTac[0][0] == '1'){return true;}
            else {return false;}
        case "2":
            if (ticTac[0][1] == '2'){return true;}
            else {return false;}
        case "3":
            if (ticTac[0][2] == '3'){return true;}
            else {return false;}
        case "4":
            if (ticTac[1][0] == '4'){return true;}
            else {return false;}
        case "5":
            if (ticTac[1][1] == '5'){return true;}
            else {return false;}

        case "6":
            if (ticTac[1][2] == '6'){return true;}
            else {return false;}

        case "7":
            if (ticTac[2][0] == '7'){return true;}
            else {return false;}

        case "8":
            if (ticTac[2][1] == '8'){return true;}
            else {return false;}
        case "9":
            if (ticTac[2][2] == '9'){
                return true;
            }else { return false;}
        default:
            return false;
    }
}
//---------------------------UserPlayer-------------------------------------------------------------------
public static void playerround() {
    String postion;
    while (true) {
        System.out.println("Please Choose tic tac from 1-9");
        postion = input.next();
        if (checkPosition(postion)){break;}
        else {
            System.out.println(postion + " is chosen already.");
        }
    }
    bookPosition(postion, 'X');//if while check is true break from while then send it to bookMethod
}

//-------------------------bookPosition----------------------------------------------------------
public static void bookPosition( String position, char x_or_o) {
    switch(position) {
        case "1":
            ticTac[0][0] = x_or_o;
            break;
        case "2":
            ticTac[0][1] = x_or_o;
            break;
        case "3":
            ticTac[0][2] = x_or_o;
            break;
        case "4":
            ticTac[1][0] = x_or_o;
            break;
        case "5":
            ticTac[1][1] = x_or_o;
            break;
        case "6":
            ticTac[1][2] = x_or_o;
            break;
        case "7":
            ticTac[2][0] = x_or_o;
            break;
        case "8":
            ticTac[2][1] = x_or_o;
            break;
        case "9":
            ticTac[2][2] = x_or_o;
            break;

    }
}
//----------------------Rest2DArray from every round---------------------------------------------------------------------------------------
public static void restArray(){
    ticTac[0][0]='1';
    ticTac[0][1]='2';
    ticTac[0][2]='3';
    ticTac[1][0]='4';
    ticTac[1][1]='5';
    ticTac[1][2]='6';
    ticTac[2][0]='7';
    ticTac[2][1]='8';
    ticTac[2][2]='9';
    //after each round rest array
//    ticTac[0][0]='1';
//    ticTac[0][0]='1';
//    ticTac[0][0]='1';
//    ticTac[0][0]='1';

    //={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
}

//---------------------------displayTicTac-------------------------------------
public static void displayTicTac(){
    System.out.println("  TIC TAC GAME   ");
    System.out.println(" ______________");
    System.out.println("|  "+ticTac[0][0]+" | "+ticTac[0][1]+"  | "+ticTac[0][2]+"  |");
    System.out.println("|____|____|____|");
    System.out.println("|  "+ticTac[1][0]+" | "+ticTac[1][1]+"  | "+ticTac[1][2]+"  |");
    System.out.println("|____|____|____|");
    System.out.println("|  "+ticTac[2][0]+" | "+ticTac[2][1]+"  | "+ticTac[2][2]+"  |");
    System.out.println("|____|____|____|");


}//end displayTicTac


}
