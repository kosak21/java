import java.util.Scanner;

public class Lab_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine().toLowerCase();
        scanner.close();

        StringBuffer lettersOutput = new StringBuffer();
        StringBuffer numbersOutput = new StringBuffer();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                int number = ch - 'a' + 1;
                lettersOutput.append(ch).append("  ");
                numbersOutput.append(number).append("  ");
            }else {
                lettersOutput.append(ch).append("  ");
                numbersOutput.append("   ");
            }
        }

        System.out.println(lettersOutput.toString().trim());
        System.out.println(numbersOutput.toString().trim());
    }
}
