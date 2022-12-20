import java.util.Scanner;

public class Main {
    final static int RublesPerMiles = 20;
    public static void main(String[] args) {
        System.out.println("Введите стоимость билета:");

        Scanner in = new Scanner(System.in);
        int cost = in.nextInt();

        int miles = cost / RublesPerMiles;
        System.out.println(String.format("Вы получаете %d миль!", miles));
    }
}