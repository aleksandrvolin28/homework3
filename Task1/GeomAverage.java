package Task1;

public class GeomAverage {

    public static void main(String[] args) {
        int[] numbers = new int[400];

        for (int i = 0; i < 400; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1); //+1 for 0 array values
        }

        double geom = 1;
        double rate = 0.0025;
        for (int i = 0; i < 400; i++) {
            geom = geom * numbers[i];
        }
        double geomAverage = Math.pow(geom, rate);
        System.out.println(geomAverage);
    }
}
