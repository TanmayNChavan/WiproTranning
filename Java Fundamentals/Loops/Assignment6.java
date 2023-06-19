import java.util.*;

class Assignment6 {
    public static void main(String args[]) {
        String a = args[0];
        int age = Integer.parseInt(args[1]);
        if (a.equals("Male")) {
            if (age <= 58 && age >= 1) {
                System.out.println("the percentage intrest of 8.2%");
            } else {
                System.out.println("the percentage intrest of 9.2%");
            }
        } else {
            if (age <= 58 && age >= 1) {
                System.out.println("the percentage intrest of 8.4%");
            } else {
                System.out.println("the percentage intrest of 10.5%");
            }
        }

    }
}