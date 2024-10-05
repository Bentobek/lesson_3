public class HW3 {
    public static void main(String[] args) {

        double[] numbers = {8.0, 1.2, -2.5, -4.3, 2.4, 3.1, 6.0, -7.9, 5.5, 9.2, -1.1, 4.3, -3.5, 7.0, -8.6};

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
                continue;
            }

            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("( 8.0, 1.2, -2.5, -4.3, 2.4, 3.1, 6.0, -7.9, 5.5, 9.2, -1.1, 4.3, -3.5, 7.0, -8.6) = 37,5/7 =  " + average);
        } else {
            System.out.println("что то пошло не так");
        }
    }
}
