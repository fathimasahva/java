import java.util.Scanner;

class Product{

int pcode;
String pname;
double price;

Product(){
pcode=0;
pname="unknown";
price=0;


}
Product(int c,String n,double p){
pcode=c;
pname=n;
price=p;
}
void display(){
System.out.println(pcode+"\t"+pname+"\t"+price);
}}

public class ProductMain{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

Product p1=new Product(101,"laptop",45000.00);

System.out.println("enter details for product 2:");



System.out.print(" Product code:");
int c2=sc.nextInt();
sc.nextLine();


System.out.print("Product name:");
String n2=sc.nextLine();
System.out.print("price:");
double pr2=sc.nextDouble();
Product p2=new Product(c2,n2,pr2);


System.out.println("Enter details for product 3:");
Product p3=new Product();
System.out.print("product code:");
p3.pcode=sc.nextInt();
sc.nextLine();
System.out.print("Product name:");
p3.pname=sc.nextLine();
System.out.print("price:");
p3.price=sc.nextDouble();
System.out.println("\n -- Product with lowest price--");

Product low=p1;
if(p2.price<low.price){
low=p2;
}
if(p3.price<low.price){
low=p3;
}
System.out.println("code \t name \t price");
low.display();
}
}

