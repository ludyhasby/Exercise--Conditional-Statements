package testpingjava;

import java.util.Scanner;

public class ExerciseConditional6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double records_sec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time_sec = Double.parseDouble(scanner.nextLine());

        double current = distance*time_sec;
        double down_count = distance/15;
        double down = Math.floor(down_count)*12.5;
        double current1 = current+down;

        if(current1<records_sec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", current1);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", current1-records_sec);
        }
    }
}