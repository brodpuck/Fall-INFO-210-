import java.util.Random;

public class Exercise07_29 {

    public static void main(String[] args) {
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };

        int[] values = {
            1, 2, 3, 4, 5, 6, 7,
            8, 9, 10, 11, 12, 13
        };

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        Random rand = new Random();
        int picks = 0;
        int sum = 0;

        String[] pickedCards = new String[4];

        do {
            sum = 0;
            picks++;

            for (int i = 0; i < 4; i++) {
                int rankIndex = rand.nextInt(13);
                int suitIndex = rand.nextInt(4);

                pickedCards[i] = ranks[rankIndex] + " of " + suits[suitIndex];
                sum += values[rankIndex];
            }

        } while (sum != 24);

        System.out.println("Number of picks until the sum is 24: " + picks);
        System.out.println("Cards picked:");

        for (String card : pickedCards) {
            System.out.println(card);
        }

        System.out.println("Sum of card values = " + sum);
    }
}
