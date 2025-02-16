import java.util.ArrayList;
import java.util.List;

public class Payment_5 {
    private List<Item> items;

    public Payment_5(){
        this.items= new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public double getTotalAmount(){
        double total=0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Общая сумма: " + getTotalAmount());
    }

    // Внутренний класс Item
    private class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price* quantity;
        }

        @Override
        public String toString(){
            return  name + "-" + quantity + "x" + price + "=" + getTotalPrice();
        }
    }

    public static void main(String[] args){
        Payment_5 payment = new Payment_5();
        payment.addItem("Компьютер", 95000, 2);
        payment.addItem("Мышь", 3500, 4);
        payment.addItem("Клавиатура", 5200, 4);
        payment.showItems();
    }
}
