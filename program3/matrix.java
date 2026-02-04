import java.util.Scanner;

public class matrix {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first matrix row and column size:");
int r1 = sc.nextInt();
int c1 = sc.nextInt();

System.out.println("Enter the second matrix row and column size:");
int r2 = sc.nextInt();
int c2 = sc.nextInt();

int[][] A = new int[r1][c1];
int[][] B = new int[r2][c2];

System.out.println("Enter elements for matrix A:");
for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
        A[i][j] = sc.nextInt();
    }
}

System.out.println("Enter elements for matrix B:");
for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
        B[i][j] = sc.nextInt();
    }
}

while (true) {
    System.out.println("\n----Menu----");
    System.out.println("1. Addition");
    System.out.println("2. Multiplication");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");

    int choice = sc.nextInt();

    if (choice == 3) break;

    switch (choice) {

        case 1:
            if (r1 == r2 && c1 == c2) {
                System.out.println("Sum Matrix:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        System.out.print((A[i][j] + B[i][j]) + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Error: Dimensions must be same for addition");
            }
            break;

        case 2:
            if (c1 == r2) {
                System.out.println("Product Matrix:");
                int[][] C = new int[r1][c2];

                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        C[i][j] = 0;
                        for (int k = 0; k < c1; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                        System.out.print(C[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Error: Column of A must equal row of B");
            }
            break;

        default:
            System.out.println("Invalid choice");
    }
}

sc.close();
}
}

