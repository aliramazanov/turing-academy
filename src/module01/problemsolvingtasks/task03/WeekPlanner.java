package module01.problemsolvingtasks.task03;

import java.util.Scanner;

public class WeekPlanner {
    public static String[][] schedule = new String[7][2];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSchedule();
        run();
    }

    public static void initializeSchedule() {
        schedule[0][0] = "Monday";
        schedule[0][1] = "go to the police station";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "go to the gym";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "meet with friends";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "read a book";
        schedule[4][0] = "Friday";
        schedule[4][1] = "do leftover tasks";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "plan next week";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "chill out";
    }

    public static void run() {
        while (true) {
            System.out.println("Write the day: ");
            String input = scanner.nextLine().trim().toLowerCase();
            boolean isFound = false;

            if (input.equals("exit")) {
                break;
            }

            for (int i = 0; i < schedule.length; i++) {
                String day = schedule[i][0].toLowerCase();
                String task = schedule[i][1];

                if (day.equals(input)) {
                    System.out.println(day + ": " + task + ".");
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Please try again.");
            }
        }
    }
}