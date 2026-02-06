import java.util.Scanner;

class CPU {
double price;

CPU(double price) {
this.price = price;
}

class Processor {
int noOfCores;
String manufacturer;

Processor(int noOfCores, String manufacturer) {
this.noOfCores = noOfCores;
this.manufacturer = manufacturer;
}
}

static class RAM {
int memory;
String manufacturer;

RAM(int memory, String manufacturer) {
this.memory = memory;
this.manufacturer = manufacturer;
}
}
}

public class CPUMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("CPU price: ");
double price = sc.nextDouble();
sc.nextLine();

CPU cpuObj = new CPU(price);

System.out.print("Processor cores: ");
int cores = sc.nextInt();
sc.nextLine();

System.out.print("Processor manufacturer: ");
String pMan = sc.nextLine();

CPU.Processor p = cpuObj.new Processor(cores, pMan);

System.out.print("RAM memory: ");
int memory = sc.nextInt();
sc.nextLine();

System.out.print("RAM manufacturer: ");
String rMan = sc.nextLine();

CPU.RAM r = new CPU.RAM(memory, rMan);

System.out.println("\n--- DETAILS ---");
System.out.println("CPU Price: " + cpuObj.price);
System.out.println("Processor Cores: " + p.noOfCores);
System.out.println("Processor Manufacturer: " + p.manufacturer);
System.out.println("RAM Memory: " + r.memory);
System.out.println("RAM Manufacturer: " + r.manufacturer);

sc.close();
}
}

