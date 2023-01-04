package testpingjava;

import java.util.Scanner;

public class ExerciseConditional4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double price_trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddy_bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int sum_toys = puzzles+dolls+teddy_bears+minions+trucks;
        double orders = puzzles*2.60+dolls*3+teddy_bears*4.10+minions*8.20+trucks*2;
        if(sum_toys>=50){
            double orders1= 0.75*orders;
            double rents = 0.1*orders1;
            double ni = orders1-rents;
            double pr = ni-price_trip;
            if(pr>=0){
                System.out.printf("Yes! %.2f USD left.", pr);
            }else{
                System.out.printf("Not enough money! %.2f USD needed.", pr*-1);
            }
        }else{
            double orders1 = orders;
            double rents = 0.1*orders1;
            double ni = orders1-rents;
            double pr = ni-price_trip;
            if(pr>=0){
                System.out.printf("Yes! %.2f USD left.", pr);
            }else{
                System.out.printf("Not enough money! %.2f USD needed.", pr*-1);
            }
        }
    }
}
