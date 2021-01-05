package Task3;

public class CompositeNumbers {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int composite = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // for zero value

            if ((array[i] != 1) && (array[i] != 2)) {
                int k = array[i] - 1;
                while (((array[i] % k) != 0) && (k != 1)) {
                    k = k - 1;
                }
                if (k >= 2) {
                    composite = composite + 1;
                }
            }
        }
//        System.out.println("My array" + Arrays.toString(array));
        System.out.print("Composite numbers are = " + composite);
    }
}

