import java.util.Scanner;

class Complex{
   double real;
   double img;
   Complex(){

   }
   Complex(double r,double i){
   real=r;
   img=i;
   }
   Complex add(Complex c2){
   Complex result=new Complex();
   result.real=real + c2.real;
   result.img=img + c2.img;
   return result;   
   }
   Complex sub(Complex c2){
   Complex result=new Complex();
   result.real=real - c2.real;
   result.img=img - c2.img;
   return result;   
   }
   Complex mult(Complex c2){
   Complex result=new Complex();
   result.real=(real * c2.real) - (img * c2.img);
   result.img=(real * c2.img) + (img * c2.real);
   return result;   
   }
   void display(){
      System.out.println(real+"+"+img+"i");
   }
}
class ComplexMain{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first real part:");
       Double r1=sc.nextDouble();
       sc.nextLine();      
       System.out.println("Enter the first imaginary part:");
       Double i1=sc.nextDouble();
       sc.nextLine();
       System.out.println("Enter the second real part:");
       Double r2=sc.nextDouble();
       sc.nextLine();
       System.out.println("Enter the second imaginary part:");
       Double i2=sc.nextDouble();
       sc.nextLine();
       
       Complex c1=new Complex(r1,i1);
       Complex c2=new Complex(r2,i2);
       
       
       System.out.println("-----Result------");
       
       
       Complex sum=c1.add(c2);
       Complex diff = c1.sub(c2);
       Complex prod = c1.mult(c2); 
       
       System.out.println("Sum:");
       sum.display();
       System.out.println("diff:");
       diff.display();
       System.out.println("mult:");
       prod.display();
       
             
             
       

}
}
 
