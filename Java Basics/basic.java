import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Taking input for int Data type scn.nextInt()
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.print(a);
        // sc.close();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.print(a);

        // Scanner sc = new Scanner(System.in);
        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // System.out.print(c+d);

        // Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.print(a+b+c);

        //Taking input for long data type: scn.nextLong();
        // Scanner scn = new Scanner(System.in);
        // long N = scn.nextLong();
        // System.out.print(N);

        // Scanner scn = new Scanner(System.in);
        // Long N = scn.nextLong();
        // System.out.println(N); //Error
        //custom input was 10000000000L
        //Because scn.nextLong() itself means to long value
        //a long value and therefore it is self explanation 
        //for the computer to use a long container
        
        // input = 25000
        // Scanner scn = new Scanner (System.in);
        // long x = scn.nextInt();//implicit typecasting
        // System.out.print(x);

        //input = 1000
        // Scanner scn = new Scanner (System.in);
        // int x = scn.nextLong();
        // System.out.print(x);
 
        //Double vs float ------->
        // double d = 3.14;
        // System.out.print(d);//3.14

        // float f = 3.14;
        // System.out.print(f);//Error

        // float f = 3.14f;
        // System.out.print(f);//output 3.14

        //For specifying the compiler to use a float container
        // "f" or "F" at the end of the decimal number
        //We always look for more precision hence by default
        //we have double as the container for decimal numbers

        //typecasting in Double and float
        //double a = 100.123;
        //float x = a;
        //System.out.print(x); Error

        // double x = 123.3;
        // float y = (float)x;//Explicit typecasting
        // System.out.print(y);//123.3

        // double x = 3.14;
        // int y = (int)x;
        // System.out.print(y);//output 3
        // int dont have decimal part

        // int x = 40;
        // double y = x;
        // System.out.print(y);//40.0 implicit typecasting

        //Reading input for  float and Double from Scanner
        //scn.nextFloat() and scn.nextDouble()
        // Scanner scn = new Scanner(System.in);
        // double x = scn.nextDouble();
        // // float y = (float)scn.nextDouble();
        // System.out.print(x);

        // input = 3.14 20 
        // Scanner scn = new Scanner (System.in);
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        // System.out.print(a+b);//input mismatch exception

        // input = 3.14
        // Scanner scn = new Scanner (System.in);
        // float a = scn.nextFloat();
        // float b = scn.nextFloat();//its value is not given
        // System.out.print(a);// error 

        // // input 3
        // Scanner scn = new Scanner(System.in);
        // double x = scn.nextInt();
        // System.out.println(x);

        // input 3.14
        // Scanner scn = new Scanner(System.in);
        // double x = scn.nextFloat();
        // System.out.println(x);

        // input 3.14
        // Scanner scn = new Scanner(System.in);
        // float x = (float)scn.nextDouble();
        // System.out.println(x); 

        // float a = 5/2;
        // System.out.print(a);//2.0

        // Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
        // You are a programmer and your brother asks you to write a code that helps him to check his approach.
        // 14 63 12
        // Scanner mast = new Scanner(System.in);
        // int a = mast.nextInt();
        // int b = mast.nextInt();
        // int c = mast.nextInt();
        // System.out.print((a+b)%c);//output5
        
        // You're going to write some code to help you cook a gorgeous lasagna 
        // from your favorite cookbook. According to your cookbook, the Lasagna 
        // should be in the oven for 40 minutes. Given the time (in minutes), 
        // the lasagna has been in the oven, find how many more minutes the lasagna
        // still needs to bake for.
        // Scanner scn = new Scanner(System.in);
        // int text = scn.nextInt();
        // System.out.print(40-text);

        // Scanner bt = new Scanner(System.in);
        // int a = (int)bt.nextDouble();
        // int b = (int)bt.nextDouble();
        // System.out.print(a/b);

        // Area of Rectangle
        // Scanner bt = new Scanner(System.in);
        // int a = (int)bt.nextInt();
        // int b = (int)bt.nextInt();
        // System.out.print(a*b);





    }
}