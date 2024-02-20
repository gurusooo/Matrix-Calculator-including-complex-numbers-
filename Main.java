import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi! It's a matrix calculator, to set numbers use the code segment below, please;)   this work is completed by M Shkuleva, SE");
        Matrices matrix1 = new Matrices(2, 2);
        matrix1.data[0][0] = new Complex_nums(1, 2);
        matrix1.data[0][1] = new Complex_nums(3, 4);
        matrix1.data[1][0] = new Complex_nums(5, 6);
        matrix1.data[1][1] = new Complex_nums(7, 8);

        Matrices matrix2 = new Matrices(2, 2);
        matrix2.data[0][0] = new Complex_nums(1, 1);
        matrix2.data[0][1] = new Complex_nums(1, 1);
        matrix2.data[1][0] = new Complex_nums(1, 1);
        matrix2.data[1][1] = new Complex_nums(1, 1);

        System.out.println("\nFirst matrix: ");
        matrix1.print();
        System.out.println("Second matrix: ");
        matrix2.print();

        while (true)
        {
            System.out.println("\nChoose your next action: ");
            System.out.println("Press 1 to add matrix 1 and matrix 2: ");
            System.out.println("      2 to multiply matrix 1 and matrix 2: ");
            System.out.println("      3 to transpose matrix 1");
            System.out.println("      4 to find determinant of matrix 1");
            System.out.println("      5 to exit");
            int key = scan.nextInt();

            switch (key)
            {
                case 1:
                    System.out.println("Sum of matrices: ");
                    matrix1.madd(matrix2).print();
                    break;

                case 2:
                    System.out.println("Product of matrices: ");
                    matrix1.mmultiply(matrix2).print();
                    break;

                case 3:
                    System.out.println("Transposed matrix 1: ");
                    matrix1.transpose().print();
                    break;

                case 5:
                    System.out.println("Have a good day!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }


        }
    }
}
