import java.util.Scanner;

class Geometry{


double area(double r)
{
return Math.PI*r*r;
}

double area(double l,double b)
{
return l*b;
}
double area(double a,double b,double c)
{
if ((a+b <= c) | (a+c <= b) | (b+c <= a)){
System.out.println("check your value");
return 0.0;
}
double s=(a + b +c)/2;
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}




}
public class MthdOvrld{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Geometry g=new Geometry();
System.out.println("---Method Overloading: Area Calculation ---\n");


System.out.print("Enter radius of the circle:");
double r=sc.nextDouble();

System.out.println("area of the circle is:"+g.area(r));




System.out.print("\n Enter length and breadth of the rectangle:");
double l=sc.nextDouble();
double b=sc.nextDouble();


System.out.println("area of the Rectangle is:"+g.area(l,b));

System.out.print("\n Enter three sides of the Triangle (a,b,c):");

double sideA=sc.nextDouble();
double sideB=sc.nextDouble();
double sideC=sc.nextDouble();

System.out.println("area of the Triangle is:"+g.area(sideA,sideB,sideC));
}
}
