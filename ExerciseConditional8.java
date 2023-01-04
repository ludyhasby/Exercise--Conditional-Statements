package testpingjava;

import java.util.Scanner;

public class ExerciseConditional8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name_episode = scanner.nextLine();
        int duration_epi = Integer.parseInt(scanner.nextLine());
        int duration_break = Integer.parseInt(scanner.nextLine());

        double time_lunch = duration_break*0.125;
        double time_rest = duration_break*0.25;
        double rest  = duration_break-time_lunch-time_rest;
        double enough = rest-duration_epi;
        double enough1 = Math.ceil(rest-duration_epi);
        double enough2 = Math.ceil(duration_epi-rest);

        if(enough>=0){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name_episode, enough1);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name_episode, enough2);
        }
    }
}