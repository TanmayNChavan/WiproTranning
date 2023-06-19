public class Assignment2 {
    public static void main(String[] args) {
        int[] arr={10,20,40,7,0};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
            }
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("minimum "+min);
        System.out.println("maximum "+max);
    }
}
