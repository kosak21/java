import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab_3_Customer {
    private Lab_3_Customers[] customers;

    public Lab_3_Customer(Lab_3_Customers[] customers){
        this.customers=customers;
    }

    public void sortCustomerByName(){
        Arrays.sort(customers, Comparator.comparing(Lab_3_Customers::getFullName));
    }

    //метод для вывода покупателей с номером крелитной карточки в заданном интервале
    public void printCustomersByCreditCardRange(String startRange, String endRange){
        System.out.println("Покупатели с номерами кредитных карточек в заданном интервале:");
        for (Lab_3_Customers customer : customers) {
            String CardNumber = customer.getCardNumber();
            if (CardNumber.compareTo(startRange) >= 0 && CardNumber.compareTo(endRange) <= 0){
                System.out.println(customer);
            }
        }
    }

    public static void main(String[] args){
        Lab_3_Customers[] customers = {
                new Lab_3_Customers(1, "Иванов", "Иван", "Иванович", "Улан-удэ, ул Пушкина,д.3", "1234567890123456", "1234567890"),
                new Lab_3_Customers(2, "Петров", "Петр", "Петрович", "Улан-удэ, ул. Лермонтова, д. 2", "2345678901234567", "2345678901"),
                new Lab_3_Customers(3, "Сидоров", "Сидор", "Сидорович", "Улан-удэ, ул. Чехова, д. 3", "3456789012345678", "3456789012")
        };

        Lab_3_Customer manager = new Lab_3_Customer(customers);//создаем менеджер покупателей
        manager.sortCustomerByName();//сортируем и выводим покупателей в алфавитном порядке
        System.out.println("Список покупателей в алфавитном порядке: ");
        for (Lab_3_Customers customer:customers){
            System.out.println(customer);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный номер кредитной карточки: ");
        String startRange = scanner.nextLine();
        System.out.print("Введите конечный номер кредитной карточки: ");
        String endRange = scanner.nextLine();

        manager.printCustomersByCreditCardRange(startRange, endRange);
        scanner.close();
    }
}
