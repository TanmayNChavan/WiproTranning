public class Assignment6 {
    public static void main(String[] args) {
        int[] arr={65,66,97,88,98,100,55,58,2,1,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
