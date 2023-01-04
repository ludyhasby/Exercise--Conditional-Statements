package testpingjava;

import java.util.Scanner;

public class ExerciseConditional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movie_budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double price_marginal = Double.parseDouble(scanner.nextLine());
        double set = 0.1 * movie_budget;

        if (extras > 150) {
            double clothing1 = extras * price_marginal * 0.9;
            double expend = set + clothing1;
            double selisih = movie_budget - expend;
            if (selisih >= 0) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.", selisih);
            } else {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", selisih * -1);
            }
        } else {
            double clothing1 = extras * price_marginal;
            double expend = set + clothing1;
            double selisih = movie_budget - expend;
            if (selisih >= 0) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f USD left.", selisih);
            } else {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f USD more.", selisih * -1);
            }
        }
    }
}