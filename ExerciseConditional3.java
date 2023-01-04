package testpingjava;

import java.util.Scanner;

public class ExerciseConditional3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int tot_minutes = minutes + 15;

        if(tot_minutes>59){
            int tot_minutes1 = tot_minutes % 60;
            int hours1 = hours + 1;

            if(hours1 >23){
                int hours2 = 0;
                if(tot_minutes1<10){
                    System.out.printf("%d:0%d", hours2, tot_minutes1);
                } else{
                    System.out.printf("%d:%d", hours2, tot_minutes1);
                }
            } else{
                if(tot_minutes1<10){
                    System.out.printf("%d:0%d", hours1, tot_minutes1);
                } else{
                    System.out.printf("%d:%d", hours1, tot_minutes1);
                }
            }
        } else{
            System.out.printf("%d:%d", hours, tot_minutes);
        }
    }
}