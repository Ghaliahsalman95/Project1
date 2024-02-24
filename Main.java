import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
      boolean exit=true;
        ArrayList<Float> allResult=new ArrayList<Float>();

float snum=0f;
     try{

        do {

            System.out.println("First number");
            float newfnum=input.nextFloat();
            System.out.println("Enter 1 to addition the numbers");
            System.out.println("Enter 2 to subtraction the numbers");
            System.out.println("Enter 3 to multiplication the numbers");
            System.out.println("Enter 4 to division the numbers");
            System.out.println("Enter 5 to modulus the numbers");
            System.out.println("Enter 6 to find minimum number");
            System.out.println("Enter 7 to find maximum number");
            System.out.println("Enter 8 to find the average of numbers");
            System.out.println("Enter 9 to print the last result in calculator");
            System.out.println("Enter 10 to print the list of all results in calculator");
            System.out.println("Exit * or Press any Character Latter");
          //  System.out.println("PLease Enter two numbers");

            switch (input.nextInt()){
            case 1:
                System.out.println("Second number");
                 snum=input.nextInt();
                System.out.println("Result Addition is :"+(newfnum+snum));
               // float result=fnum+snum;
                allResult.add((newfnum+snum));
                break;
            case 2:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Subtraction is :"+(newfnum-snum));
                // float result=fnum+snum;
                allResult.add((newfnum-snum));
                break;
            case 3:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Multiplication is :"+(newfnum*snum));
                // float result=fnum+snum;
                allResult.add((newfnum*snum));
                break;
            case 4:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Division is :"+(newfnum/snum));
                // float result=fnum+snum;
                allResult.add((snum/newfnum));
                break;
            case 5:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Modulus is :"+(newfnum%snum));
                // float result=fnum+snum;
                allResult.add((newfnum%snum));
                break;
            case 6:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Minimum is :"+Math.min(newfnum,snum));
                // float result=fnum+snum;
                allResult.add(Math.min(newfnum,snum));
                break;
            case 7:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Maximum is :"+Math.max(newfnum,snum));
                // float result=fnum+snum;
                allResult.add(Math.max(newfnum,snum));
                break;
            case 8:
                System.out.println("Second number");
                snum=input.nextInt();
                System.out.println("Result Average is :"+((newfnum+snum)/2));
                // float result=fnum+snum;
                allResult.add(((newfnum+snum)/2));
                break;


            case 9:
                System.out.println("The Last result in calculator :"+allResult.get(allResult.size()-1));
                // float result=fnum+snum;
                break;
                case 10:
                    System.out.println("All result are ");
                    for (int re=0;re<allResult.size();re++){
                        System.out.println(re+" "+allResult.get(re));
                    }
                System.out.println("The Last result in calculator :"+allResult.get(allResult.size()-1));
                // float result=fnum+snum;
                break;

        }

        }while(exit);
}catch (InputMismatchException e){
         System.out.println("You Choose exit");
     }
    }
}