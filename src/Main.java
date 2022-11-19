import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1 and 2
        int [] zp = new int[30];
        int sum = 0;
        int min = 10_000;
        int max = -1;

        for (int i = 0; i < zp.length; i++) {
            zp[i] = (int) (Math.random() * 500) + 200;
            sum += zp[i];
            if (zp[i] < min) {
                min = zp[i];
            }
            if (zp[i] > max) {
                max = zp[i];
            }
        }
        double sredniyRaschod = sum / 30;
            System.out.println(Arrays.toString(zp));
            System.out.println("Итого " + sum);
            System.out.println("Минимальная зарплата " + min);
            System.out.println("Максимальная зарплата " + max);
             System.out.println("Средняя сумма трат за месяц составила  " + sredniyRaschod + " руб");
    }
}