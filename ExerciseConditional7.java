package testpingjava;

import java.util.Scanner;

public class ExerciseConditional7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int avid_cards = Integer.parseInt(scanner.nextLine());
        int aCPUs = Integer.parseInt(scanner.nextLine());
        int aRAM = Integer.parseInt(scanner.nextLine());

        double vid_cards = 250*avid_cards;
        double CPUs = 0.35*vid_cards*aCPUs;
        double RAM = 0.1*vid_cards*aRAM;

        double final_bill = vid_cards+CPUs+RAM;
        if(avid_cards>aCPUs){
            double final_bill1 = 0.85*final_bill;
            if(final_bill1<budget){
                System.out.printf("You have %.2f USD left!", budget-final_bill1);
            }else{
                System.out.printf("Not enough money! You need %.2f USD more!", final_bill1-budget);
            }
        }else{
            double final_bill1 = final_bill;
            if(final_bill1<=budget){
                System.out.printf("You have %.2f USD left!", budget-final_bill1);
            }else{
                System.out.printf("Not enough money! You need %.2f USD more!", final_bill1-budget);
            }
        }
    }
}
