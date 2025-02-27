package module01.lesson03controlflow.selfstudy01;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            System.out.println("Outer loop iteration: i=" + i);
            System.out.println("The inner loop needs to finish for outer loop's next iteration to start.");
            System.out.println("Next inner loop starts now:");

            for (int j = 0; j <= 5; j++) {
                System.out.print("i=" + i + ", j=" + j + "\n");
            }

            System.out.println("Inner loop completed for outer loop's variable i=" + i);
            System.out.println();
        }

        System.out.println("Loop Completed");
    }
}