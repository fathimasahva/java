import java.util.Scanner;
import mathutils.calculator;

public class c{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("enter first number:");
double a = sc.nextDouble();

System.out.println("Enter second number:");
double b=sc.nextDouble();

calculator calc=new calculator();
System.out.println("Addition="+calc.add(a, b));
System.out.println("Subtraction="+calc.sub(a, b));
System.out.println("Multiplication="+calc.mult(a, b));
if(b==0){
System.out.println("Error:Invalid");

}
else{
System.out.println("Division="+calc.div(a, b));
}
}
}
