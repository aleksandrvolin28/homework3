package Task1;

public class MathAverage {
    public static void main(String[] args) {
        int[] numbers = new int[400];
        for (int i = 0; i < 400; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        double average = 0;
        for (int i = 0; i < 400; i++) {
            average += numbers[i];
        }
        System.out.println("Summ of all array elements is: " + average);

        double mathAverage = average/400;
        System.out.print("Math average of array is: " + mathAverage);
    }
}
