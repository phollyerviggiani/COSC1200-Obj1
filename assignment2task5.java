// Write code to find average of all elements of each row in the Multi dimensional 
// Array a= {{45,20, 40}, {30,40,60}, {34,67,78} } Find the row with the largest avg and print its index and value.

public class assignment2task5 {
    public static void main(String[] args) {
        
        int[][] a = {
                        {45, 20, 40},
                        {30, 40, 60},
                        {34 ,67, 78}
                    };   
        

        int maxIndex = 0;
        double maxAvg = 0;
        int maxValue = 0;


        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            // find
            double avg = (double) sum / a[i].length;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIndex = i;
                // find the largest value
                for (int l = 0; l < a[i].length; l++){
                    if (a[i][l] > maxValue) {
                        maxValue = a[i][l];
                    }
                }
            }
        }

        System.out.println("Row with the largest average:");
        System.out.println("Index: " + maxIndex);
        System.out.println("Value: " + maxValue);
        System.out.println("Max Average: " + String.format("%.2f", maxAvg)); // formatting to 2 decimal places.
    }
}
