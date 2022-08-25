import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import math_operations.IMath;
import math_operations.Math;
import math_operations.MathProxy;

public class calculator {
    private static String expression;
    private static double num1,num2;
    private static int values[];
    private static char signs[];

    public static void main(String[] args) {
        System.out.println("Welcome to calculator app");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        expression = in.nextLine();
        in.close();

        //for 2 numbers
       /* Matcher matcher = Pattern.compile("\\d+").matcher(expression);
        matcher.find();
        num1 = Integer.valueOf(matcher.group());
        matcher.find();
        num2 = Integer.valueOf(matcher.group());
        System.out.printf("%.2f ",num1);
        System.out.printf("%.2f \n",num2);*/

        //for more numbers
        values= new int[10];
        Matcher matcher = Pattern.compile("\\d+").matcher(expression);
        int countValues=0;
        //System.out.printf("%b ",matcher.find());
        while(matcher.find()==true){
            values[countValues] = Integer.valueOf(matcher.group());
            countValues++;
        }
        /*for(int i=0;i<countValues;i++)
        {
            System.out.printf("%d ",values[i]);
        }*/

        signs=new char[10];
        char expr[]=expression.toCharArray();
        int countSigns=0;
        for(int i=0;i!=expr.length;i++)
        {
            if(expr[i]=='+'||expr[i]=='-'||expr[i]=='*'||expr[i]=='/') {
                signs[countSigns] = expr[i];
                countSigns++;
            }
        }
       // System.out.println(Arrays.toString(signs));

        IMath p=new MathProxy();
        double res = p.result(values,signs);
        System.out.printf("%.2f",res);




        //System.out.print("How old are you? Type here: ");
        //age=in.nextInt();
        //System.out.printf("You're %d years old!\n", age);
    }
}


