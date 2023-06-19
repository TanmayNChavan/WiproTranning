public class Assignment9 {
    public static void main(String[] args) {
        int[] arr = { 1, 99, 10, 2 };
        int[] temp = new int[arr.length];
        int k = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                count++;
            } else {
                temp[k++] = arr[i];
            }
        }
        if (count > 0) {
            for (int i = k; i < k + count; i++) {
                temp[i] = 0;
            }
        }
        System.out.println("After removing 10");
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
