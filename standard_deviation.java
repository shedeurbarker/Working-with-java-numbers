public class standard_deviation {
    static double sum_of_deviation = 0;
    static double standard_deviation = 0;
    static double mean_value = 0;
    static double sum = 0;

    public static void main(String[] arg) {
        int[] arr = {2, 6, 4, 5, 10, 5, 10, 8, 6, 2};       // sample data
// sample data


        for (int j : arr) {
            sum += j;
        }
        mean_value = sum/arr.length;

        for (int j : arr) {
            double each_deviation = j - mean_value;
            sum_of_deviation += (each_deviation * each_deviation);
        }
        double summation = sum_of_deviation/arr.length;
        standard_deviation = Math.sqrt(summation);
        System.out.println("Standard Deviation: " + (float)standard_deviation);
    }
}
