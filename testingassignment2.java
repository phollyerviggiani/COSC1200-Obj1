public class testingassignment2 {

    public static void main(String[] args) {
/* 
        int[] data = new int[8];
        data[0] = 3;
        data[7] = -18;
        data[4] = 5;
        data[1] = data[0];

        int x = data[4];
        data[4] = 6;
        data[x] = data[0] * data[1];

        for (int element: data)
            System.out.println(element);


        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
            System.out.println(list[i]);
*/
        int[] list1 = {2, 18, 6, -4, 5, 1};

        // Perform the operation
        for (int j = 0; j < list1.length; j++) {
            list1[j] = list1[j] + (list1[j] / list1[0]);
        }

        // Print out each element in the array
        for (int x = 0; x < list1.length; x++) {
            System.out.println(list1[x]);
        
}

    }
}
