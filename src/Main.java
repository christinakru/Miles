import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prev solution
        //int rublesPerMiles = 20;
        //System.out.println("Введите стоимость билета:");
        //Scanner in = new Scanner(System.in);
        //int cost = in.nextInt();
        //int miles = cost / rublesPerMiles;
        //System.out.printf("Вы получаете %d миль!%n", miles);

        // New solution
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}