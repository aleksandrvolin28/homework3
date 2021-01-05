package Task4;

class ChangeFor0 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                array[k] = 0;
            }
            System.out.println(array[k]);

        }
    }
}
