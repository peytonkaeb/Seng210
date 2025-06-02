package package1;
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lol");
        //comment
        System.out.print("How many times do you want to toss the coin? ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println("Toss " + (i + 1) + ": " + tossCoin());
        }
    }

    public static String tossCoin() {
        return Math.random() < 0.5 ? "Heads" : "Tails";
    }
}