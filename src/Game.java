import java.util.*;

public class Game {
    static final int errorMax = 6;

    public static void start() {
        List<HangMan> hangManList = Arrays.asList(HangMan.values());
        String wordChoice = WordChoice.chooseTheWord("src/words.txt").toUpperCase();
        char mask = '*';
        String maskOfWordChoice = maskOfWordChoice(wordChoice, mask);
        byte errorCount = 0;
        List<Character> errorCharacter = new ArrayList<>();
        boolean gameIsOver = false;
        while (!gameIsOver) {
            System.out.println(hangManList.get(errorCount) +
                                       "\nОтгадайте загаданное слово " + maskOfWordChoice +
                                       "\nОшибки (" + errorCount + "): " + Arrays.toString(errorCharacter.toArray()) +
                                       "\nВведите букву: ");
            Character inputCharacter = Main.userInput.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (wordChoice.contains(String.valueOf(inputCharacter))) {
                maskOfWordChoice = testOfInputChar(wordChoice, maskOfWordChoice, inputCharacter);
                if (!maskOfWordChoice.contains(String.valueOf(mask))) {
                    gameIsOver = true;
                    System.out.println("Это было слово: "+ maskOfWordChoice +"\nПАБЕДА");
                }
            } else {
                if (errorCharacter.contains(inputCharacter)) {
                    System.out.println("Вы уже вводили данную буквую. Неверно");
                } else {
                    errorCharacter.add(inputCharacter);
                    errorCount++;
                }
                if (errorCount == errorMax) {
                    gameIsOver = true;
                    System.out.println(hangManList.get(errorCount));
                    System.out.println("Это было слово: "+ wordChoice +"\nПРОИГРАЛИ");
                }

            }
        }
    }

    public static String testOfInputChar(String wordChoice, String maskOfWordChoice, Character inputCharacter) {
        char[] tempWordChoice = wordChoice.toCharArray();
        char[] tempMaskOfWordChoice = maskOfWordChoice.toCharArray();
        for (int i = 0; i < wordChoice.length(); i++) {
            if (tempWordChoice[i] == inputCharacter) {
                tempMaskOfWordChoice[i] = inputCharacter;
            }
        }
        return new String(tempMaskOfWordChoice);
    }

    public static String maskOfWordChoice(String wordChoice, char mask) {
        StringBuilder maskOfWordChoice = new StringBuilder();
        for (int i = 0; i < wordChoice.length(); i++) {
            maskOfWordChoice.append(mask);
        }
        return maskOfWordChoice.toString();
    }
}
