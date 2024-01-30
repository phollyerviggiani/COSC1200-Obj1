import java.util.Scanner;

public class in_class {
    public static int[] sumDiff(int x, int y) {
        int sum = x + y;
        int diff = x - y;
        int[] result = { sum, diff };
        return result;
    }

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter num1: ");
int num1 = input.nextInt();
System.out.print("Please enter num2: ");
int num2 = input.nextInt();
int[] result = sumDiff(num1, num2);
int s = result[0];
int d = result[1];
System.out.println("The sum is " + s + " and the difference is " + d);
input.close();
}
}
