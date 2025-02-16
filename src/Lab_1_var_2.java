import java.util.Scanner;

public class Lab_1_var_2 {
    public static void main(String[] args){
        //для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите аргументы через пробел: ");
        String input = scanner.nextLine(); //считываем строку с аргументами
        String[] arguments = input.split("");//разделяем строку на аргументы

        //Выводим аргументы в обратном порядке
        for (int i = arguments.length-1; i>=0; i--){
            System.out.println(arguments[i]);
        }
        System.out.println("\nРазработчик: Перевозникова Мария ЗБ762 (Б752)");
    }
}
