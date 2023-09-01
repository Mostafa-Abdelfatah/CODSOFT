import java.util.Scanner;
public class NumberGuessingGame {
    private final Scanner in = new Scanner(System.in);
    private int maxAttempts = 10;
    private int score = 0;
    private int rounds = 0;

    int getNumber() {
        return (int) (Math.random() * 99) + 1;
    }

    void startGame() {
        System.out.println("please enter the number of rounds : ");
        this.rounds = in.nextInt();
        game();
    }

    void game() {
        int x = getNumber();
        while(maxAttempts > 0 && rounds > 0) {
            System.out.println("guess the number please enter it: ");
            int num = in.nextInt();
            if(x > num) {
                System.out.println("too low");
                maxAttempts--;
            }
            else if(x < num) {
                System.out.println("too high");
                maxAttempts--;
            }
            else {
                System.out.println("good guessing");
                score += maxAttempts;
                rounds--;
                maxAttempts = 10;
                System.out.println("your score now : " + score);
            }
        }

        if(rounds == 0 && maxAttempts != 0) {
            System.out.println("you have finished your rounds");
            System.out.println("your score now : " + score);
        }
        if(maxAttempts == 0) {
            System.out.println("you have finished your trials");
            System.out.println("your score now : " + score);
        }
    }
}
