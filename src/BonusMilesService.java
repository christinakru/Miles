import java.util.Scanner;

public class BonusMilesService {
    public int calculate(int cost){
        int rublesPerMiles = 20;
        int miles = cost / rublesPerMiles;
        return miles;
    }
}
