package testpingjava;

import java.util.Scanner;

public class ExerciseConditional1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sumsec = a+b+c;
        int minutes = sumsec/60;
        int seconds = sumsec%60;

        if(seconds<10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else{
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
