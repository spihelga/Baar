import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kui palju rummi sul on? (L)");
        Scanner srum = new Scanner(System.in);
        double ruml = srum.nextDouble();
        System.out.println("Kui palju colat sul on? (L)");
        double colal = srum.nextDouble();
        System.out.println("Sul on " + ruml + " L rummi ja " + colal + " L colat");
        double kontroll = ruml / colal;
        System.out.println(kontroll);
        double koka = colal / 0.2;
        double rumm = ruml / 0.05;

        if (kontroll > 0.25)
            System.out.println("Saad teha " + koka + " 250 ml rumcolat");
        else
            System.out.println("Saad teha " + rumm + " 250 ml rumcolat");
    }
}