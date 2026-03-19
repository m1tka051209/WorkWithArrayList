import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в Генератор Случайных Чисел!");
        System.out.println("Сколько чисел добавить?");
        int num = 0;
        try {
            num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                arrayList.add(random.nextInt(num));
            }
            sc.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Число, а не строку!");
            System.out.println("Попробуйте ещё раз");
        }

        if (num <= 0) {
            System.out.println("Прикольнутся решили?) Не, давайте натуральное число?");
        } else {
            System.out.println("Размер arrayList: " + arrayList.size());
            System.out.println(arrayList);
            System.out.println("Вот небольшой подарок от нас: мы не просто сгенерировали вам нужное кол-во случайных чисел, мы ещё и подадим их красиво!");
            System.out.println("Погнали!");
            arrayList.sort(Comparator.naturalOrder());
            System.out.println("По возрастанию: " + "\n" + arrayList);
            arrayList.sort(Comparator.reverseOrder());
            System.out.println("По убыванию: " + "\n" + arrayList);
            System.out.println("Минимальное значение: " + "\n" + arrayList.get(num - 1));
            System.out.println("Максимальное значение: " + "\n" + arrayList.get(0));
        }
    }
}