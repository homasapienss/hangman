import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        char newGame = 'n';
        char exitGame = 'e';
        while (true) {
            System.out.println("[" + newGame + "]ew game or [" + exitGame + "]xit");
            String userResponse = userInput.nextLine();
            if (userResponse.equals("n")) {
                new Game().start();
            } else if (userResponse.equals("e")) {
                userInput.close();
                break;

            } else {
                System.out.println("Введите корректный символ");
            }
        }
    }
}