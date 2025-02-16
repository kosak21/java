import java.util.List;

//Базовый интерфейс для обонента
interface Subscriber{
    void signContract();
    void openAccount();
    void editProfile();
    String getAccountInfo();
    double checkBalance();
    double cheekTraffic();

    double checkTrafic();

    List<String> getPaymentDetails();
    void changePlan(String newPlan);
    void changeOperator(String newOperator);
    void rechargeAccount(double amount);
    void closeAccount();
}

//Специализированный интерфейс для интернет-абонента
interface InternetSubsriber extends Subscriber{
    void setInternetPackage(String packageName);
    double checkDataUsage();
}

// Специализированный интерфейс для корпоративного абонента
interface CorporateSubscriber extends Subscriber {
    void addEmployeeNumber(String employeeNumber);
    void removeEmployeeNumber(String employeeNumber);
    List<String> getEmployeeNumbers();
}

// Реализация стандартного абонента
class MobileSubscriber implements Subscriber {
    private String name;
    private String phoneNumber;
    private double balance;
    private String tariffPlan;

    public MobileSubscriber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = 0.0;
        this.tariffPlan = "Мой тариф";
    }

    @Override
    public void signContract() {
        System.out.println("Контакт подписан на: " + name);
    }

    @Override
    public void openAccount() {
        System.out.println("Счёт открытый на: " + name);
    }

    @Override
    public void editProfile() {
        System.out.println("Профиль отредактированный для: " + name);
    }

    @Override
    public String getAccountInfo() {
        return "Подписчик: " + name + ", Телефон: " + phoneNumber + ", Тариф: " + tariffPlan;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double cheekTraffic() {
        return 0;
    }

    @Override
    public double checkTrafic() {
        return 5.0; // Заглушка для трафика
    }

    @Override
    public List<String> getPaymentDetails() {
        return List.of("Платёж 1: 300 р.", "Платёж 2: 450 р.");
    }

    @Override
    public void changePlan(String newPlan) {
        this.tariffPlan = newPlan;
        System.out.println("План изменен на: " + newPlan);
    }

    @Override
    public void changeOperator(String newOperator) {
        System.out.println("Оператор сменился на: " + newOperator);
    }

    @Override
    public void rechargeAccount(double amount) {
        this.balance += amount;
        System.out.println("Счёт пополнен на " + amount + " р.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Счет закрыт для: " + name);
    }
}
// Реализация корпоративного абонента
class CorporateMobileSubscriber extends MobileSubscriber implements CorporateSubscriber {
    private List<String> employeeNumbers;

    public CorporateMobileSubscriber(String name, String phoneNumber) {
        super(name, phoneNumber);
        this.employeeNumbers=new  java.util.ArrayList<>();
    }

    @Override
    public void addEmployeeNumber(String employeeNumber) {
        employeeNumbers.add(employeeNumber);
        System.out.println("Добавлен номер сотрудника: " + employeeNumber);
    }

    @Override
    public void removeEmployeeNumber(String employeeNumber) {
        employeeNumbers.remove(employeeNumber);
        System.out.println("Удален номер сотрудника: " + employeeNumber);
    }

    @Override
    public List<String> getEmployeeNumbers() {
        return employeeNumbers;
    }
}


public class Abonent_6 {
    public static void abonent_6(String[] args){
        Subscriber subscriber = new MobileSubscriber("Перевозникова Мария", "89503989256");
        subscriber.signContract();
        subscriber.openAccount();
        subscriber.rechargeAccount(100);
        System.out.println(subscriber.getAccountInfo());

        CorporateSubscriber corpSub = new CorporateMobileSubscriber("Теле 2", "88002503678");
        corpSub.addEmployeeNumber("847893966");
        corpSub.addEmployeeNumber("846582302");
        System.out.println("Номер сотрудника: " + corpSub.getEmployeeNumbers());
    }
}
