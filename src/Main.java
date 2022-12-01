public class Main {
    public static void main(String[] args) {
        int sum1 = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum1 += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum1);

        int [] array = generateRandomArray();
        int min = array[0];
        int max = array[0];
        for (int element: array){
            if (element<min){
            } else if (element>max) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты составили "+ min);
        System.out.println("Максимальные затраты составили "+ max);

        int [] arr3  = generateRandomArray();
        int sum3 = 0;
        for(int i:arr3){
            sum3 += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum3/(float)arr3.length);
        char [] reverseFullName  = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        return arr;
    }
}