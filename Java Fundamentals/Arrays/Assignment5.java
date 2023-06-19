public class Assignment5 {
    public static void main(String[] args) {
        int[] arr={65,66,97,88,98,100};
        int min2=arr[1];
        int min1 =arr[0];
        int max2=0;
        int max1=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max1 ) {
                max2=max1;
                max1=arr[i];
            }
            if (arr[i] < min1 ) {
                min2=min1;
                min1=arr[i];
            }
        }
        System.out.println("max: "+max1+" "+max2);
        System.out.println("min: "+min1+" "+min2);
        
    }
}
