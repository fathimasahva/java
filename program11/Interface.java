import java.util.Scanner;

interface Shape {
double area();
double perimeter();
}

class Circle implements Shape {
private double r;

public Circle(double radius) {
this.r = Math.abs(radius);
}

@Override
public double area() {
return Math.PI * r * r;
}

@Override
public double perimeter() {
return 2 * Math.PI * r;
}
}

class Rectangle implements Shape {
private double l;
private double w;

public Rectangle(double length, double width) {
this.l = Math.abs(length);
this.w = Math.abs(width);
}

@Override
public double area() {
return l * w;
}

@Override
public double perimeter() {
return 2 * (l + w);
}
}

public class Interface {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Shape currentShape = null;

while (true) {
System.out.println("\n--- Shape Calculator ---");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Exit");
System.out.print("Select your option: ");

int choice = sc.nextInt();

if (choice == 3) {
break;
}

switch (choice) {
case 1:
System.out.print("Enter radius: ");
double r = sc.nextDouble();
currentShape = new Circle(r);
break;

case 2:
System.out.print("Enter length and width: ");
double l = sc.nextDouble();
double w = sc.nextDouble();
currentShape = new Rectangle(l, w);
break;

default:
System.out.println("Error: Invalid selection. Try again.");
continue;
}

System.out.println("Area: " + currentShape.area());
System.out.println("Perimeter: " + currentShape.perimeter());
}

sc.close();
}
}
