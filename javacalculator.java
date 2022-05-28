import java.sql.SQLOutput;
import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter value");
        long a = sc.nextLong();
        System.out.println("enter number");
        long b =  sc.nextLong();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);
           float r = 0.000F;
        //SWITCH CASE

        switch(op){
            case '+': r = a + b;
                System.out.println(a + " + " + b + " = " +r);
            break;
            case '-' : r = a - b;
                System.out.println(a+ " - " + b + " = " + r);
            break;
            case '*' : r = a * b;
                System.out.println(a + " * " + b + " = " + r);
                break;
            case '/' : r = a / b;
                System.out.println(a + " / " + b + " = " + r);
                break;
            default:
                System.out.println("invalid operation");
        }

    }
}
