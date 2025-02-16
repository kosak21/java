public class Lab_3_Customers {
    private int id;
    private String surname;
    private String name;
    private String otchectvo;
    private String address;
    private String cardNumber;
    private String bankNumber;

    public Lab_3_Customers(int id, String surname, String name, String otchectvo,String address,String cardNumber, String bankNumber){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.otchectvo=otchectvo;
        this.address=address;
        this.cardNumber=cardNumber;
        this.bankNumber=bankNumber;
    }

    public String getFullName(){
        return surname + " " + name + " " + otchectvo;
    }
    //метод для выводы информации о покупателе
    @Override
    public String toString(){
        return "Customer{" + "id=" + id + ", Фамилия='" + surname + '\'' + ", Имя='" + name + '\'' + ", Отчество='" + otchectvo + '\'' + ", Адрес='" + address + '\'' + ", Номер кредитной карточки='" + cardNumber + '\'' + ", Номер банковского счета='" + bankNumber + '\'' + '}';
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
