package module01.lesson04arrays.selfstudy01;

public class LotteryTicket {

    public static void main(String[] args) {
        int[][] lotteryCard = {{57, 72, 38}, {49, 95, 26}};

        for (int i = 0; i < lotteryCard.length; i++) {
            for (int j = 0; j < lotteryCard[i].length; j++) {
                System.out.print(lotteryCard[i][j] + " ");
            }
        }
    }
}
