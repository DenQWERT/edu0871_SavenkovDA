// Программа для размена монет с помощью циклов
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите на какую сумму вам насыпать монеток?  ");
        int summa = scanner.nextInt();
        System.out.println("Насыпаем монеток на сумму равную " + summa + " рублей");
        razmen(summa);

    }
    static void razmen(int summa){  // Метод рассчитывающий сколько монет насыпать

            int d10 = 0, d5 = 0, d2 = 0, d1 = 0;
            while (summa >= 10) {
                System.out.println("Примите десяточку - 10 рублей");
                summa -= 10; // Вычитаем десятку из оставшейся суммы
                d10++;
            }
            while (summa >= 5) {
                System.out.println("Примите пятачок -  5 рублей");
                summa -= 5; // Вычитаем пятерку из оставшейся суммы
                d5++;
            }

            while (summa >= 2) {
                System.out.println("Примите двушечку -  2 рублей");
                summa -= 2; // Вычитаем два рубля из оставшейся суммы
                d2++;
            }

            while (summa >= 1) {
                System.out.println("Примите рублик -  1 рубль");
                summa -= 1; // Вычитаем десятку из оставшейся суммы
                d1++;
            }

            System.out.println("Итого выполнен размен: Десяток = " + d10 + " / Пятачков = " + d5 + " / Двушек = " + d2 + " / Рубликов = " + d1 + "  на сумму, равную " + (10 * d10 + 5 * d5 + 2 * d2 + d1) + " рублей.");
            System.out.println("==========================================================================");
        }
}
