import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class Java_Console_Calculator_Task1{
     
    //Addition Method
    public static void Addition(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("------Addition------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();            
            sum = sum +arr[i];

            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
            }

        }
        System.out.println(sum);
    }

    //Subtraction Method
    public static void Subtraction(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("------Subtraction------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int[] arr = new int[n];
        int sub = 0;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();            
            if(i==0){
                sub = arr[0];
            }
            else{
                sub = sub - arr[i];
            }

            if (sub > Integer.MAX_VALUE || sub < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }

        }
        System.out.println(sub);
    }

    //Multiplication Method
    public static void Multiplication(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("------Multiplication------");
        
        System.out.print("Enter the number of numbers : ");
        int n = sc.nextInt();
        if(n>25){
            System.out.println("Limit Exceded");
            return;
        }

        int[] arr = new int[n];
        int mul = 1;

        for(int i =0; i<n; i++){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();            
            mul = mul *arr[i];

            if (mul > Integer.MAX_VALUE || mul < Integer.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }

        }
        System.out.println(mul);
    }

    //Division Method
    public static void Division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Division------");

        System.out.print("Enter numerator (top number): ");
        double num = sc.nextInt();

        System.out.print("Enter denominator (bottom number): ");
        double den = sc.nextInt();

        if(den == 0){
            System.out.println("undefined");
            return;            
        }
        else if (num == 0){
            System.out.println(0);
            return;
        }
        else{
            double result = num/den;
            if (result > Double.MAX_VALUE || result < Double.MIN_VALUE) {
            System.out.println("Limit Exceeded");
            return;
        }
            System.out.println(result);            
        }        
    }

    //Power Method
    public static void Power(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Power------");

        System.out.print("Enter power value: ");
        double power = sc.nextInt();

        System.out.print("Enter the number: ");
        double number = sc.nextInt();

        double result = Math.pow(number, power);
        System.out.println(result);
    }

    //SqureRoot Method
    public static void SqureRoot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------SqureRoot------");

        System.out.print("Enter the Number: ");
        double Number = sc.nextInt();

        double result = Math.sqrt(Number);
        System.out.println(result);
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        boolean m = true;
        while(m == true){
            //calculator Options
            System.out.println("------Calculator------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Squreroot");
            System.out.println("7. Exit");
            System.out.print("Enter the index value to choose: ");

            int index = sc.nextInt();
            //switch loop
            switch(index){
                case 1:
                    Addition();
                    break;

                case 2:
                    Subtraction();
                    break;

                case 3:
                    Multiplication();
                    break;

                case 4:
                    Division();
                    break;

                case 5:
                    Power();
                    break;

                case 6:
                    SqureRoot();
                    break;

                case 7:
                    m = false;
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;               

        }
        }
        
    }
}