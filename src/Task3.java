import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = input.nextInt();

        System.out.print("Enter y1: ");
        int y1 = input.nextInt();

        System.out.print("Enter x2: ");
        int x2 = input.nextInt();

        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        int length = x2 - x1;
        int width = y1 - y2;

        int s = length * width;
        int p = 2 * (length + width);

        System.out.println("s = " + s);
        System.out.println("p = " + p);

        input.close();
    }
}
