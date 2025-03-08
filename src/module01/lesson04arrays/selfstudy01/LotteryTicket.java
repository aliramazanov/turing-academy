package module01.lesson04arrays.selfstudy01;

public class LotteryTicket {

    public static void main(String[] args) {
        int[][] lotteryCard = {{57, 72, 38}, {49, 95, 26}};

        for (int[] lotteryCard1 : lotteryCard) {
            for (int i : lotteryCard1) {
                System.out.print(i + " ");
            }
        }
    }
}
