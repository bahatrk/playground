import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz:");
        int numberOne = input.nextInt();
        System.out.println("2.Sayıyı giriniz:");
        int numberTwo = input.nextInt();
        int sum = numberOne+numberTwo;
        System.out.println("Girilen sayıların toplamı Baha sdadas: " + sum);
    }
}
