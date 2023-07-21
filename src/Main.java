import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz:");
        int numberOne = input.nextInt();
        System.out.println("2.Sayıyı giriniz:");
        int numberTwo = input.nextInt();
        System.out.println("3.Sayıyı giriniz:");
        int numberThree = input.nextInt();
        int sum = numberOne+numberTwo+numberThree;
        System.out.println("Girilen sayıların toplamı: " + sum);
    }
}