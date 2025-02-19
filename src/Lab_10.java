import java.util.Scanner;

public class Lab_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подстроку для замены:");
        String oldSubstring = scanner.nextLine();
        System.out.println("Введите новую подстроку:");
        String newSubstring = scanner.nextLine();
        System.out.println("Введите строки (для завершения введите пустую строку):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;; // Завершение ввода при пустой строке

            String modifiedLine = line.replace(oldSubstring, newSubstring);
            System.out.println(modifiedLine);
        }

        scanner.close();
    }
}
