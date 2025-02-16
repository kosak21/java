import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab_2 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //исп-ся для ввода данных с консоли
        System.out.println("Введите количество чисел: ");
        int n =scanner.nextInt();
        String[] numbers = new String[n]; //массив для хранения чисел
        System.out.println("Введите "+n+" чисел(ла):");
        for (int i=0; i<n; i++){
            numbers[i]= scanner.next();
        }
        Arrays.sort(numbers, Comparator.comparing(String::length));//упорядочиваем массив по длине чисел в порядке возрастания длины
        System.out.println("Чичла в порядке возрастания длины: ");
        for (String number:numbers){
            System.out.println(number);
        }
        Arrays.sort(numbers, Comparator.comparingInt(String::length).reversed());// Упорядочиваем массив по длине чисел в порядке убывания
        System.out.println("Числа в порядке убывания длины: ");
        for (String number:numbers){
            System.out.println(number);
        }
        scanner.close();
        System.out.println("\nРазработчик: Перевозникова Мария ЗБ762 (Б752)");
    }
}
