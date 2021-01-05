package Task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            if (array[i] == 1) { // если i равняется 1б то оно является простым и сразу вносится в number.
                number = number + 1;
//                System.out.println("A simple number: " + array[i]); // выводит все простые значения подходящие под выше стоящие условия
            } else {
                int k = array[i] - 1; // введена переменная k для проверки всех значений до i
                while (((array[i] % k) != 0) && (k != 1)) { // проверяет, что i не делится на k. k не равняется еденице.
                    k = k - 1;
                }
                if ((array[i] == 2) || (k == 1)) {
                    number = number + 1;
//                    System.out.println("A simple number: " + array[i]);
                }
            }
        }
        System.out.print("Simple numbers are = " + number);
    }
}