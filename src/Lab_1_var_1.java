
public class Lab_1_var_1 {
    public static void main(String[] args) {
        //Выводим аргументы в обратном порядке
        for (int i=args.length-1; i>=0; i--){
            System.out.println(args[i]);
        }

        //проверяем, есть ли аргументы
        if (args.length==0){
            System.out.println("Нет агрументов командной строки");
            return;
        }
    }
}