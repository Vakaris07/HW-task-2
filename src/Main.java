//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score ");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("Your grade is A");
        }else if (score >= 80) {
            System.out.println("Your grade is B");
        } else if (score >= 70) {
            System.out.println("Your grade is C");
        } else if (score >= 60) {
            System.out.println("Your grade is D");
        } else if (score >= 50) {
            System.out.println("Your grade is F");
        } else if (score <= 50) {
            System.out.println("Your grade is F");
        }



    }
    }
