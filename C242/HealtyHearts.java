package C242;
import java.util.Scanner;
public class HealtyHearts {

    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        a =sc.nextInt();

        System.out.println("Your maximum heart rate should be " + (220 - a) + ".");
        System.out.println("Your target HR Zone is " + .5*(220 - a) + " - " + .85*(220 - a) + " beats per minute.");
    }
}
