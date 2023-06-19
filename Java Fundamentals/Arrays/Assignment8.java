public class Assignment8 {
    public static void main(String[] args) {
        int []arr={10,3,6,1,2,7,9};
        int sum=0;
        int idx1=0;
        int idx2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==6) {
                idx1=i;
            }else if (arr[i]==7) {
                idx2=i;
            }
        }
        if (idx2>idx1) {
            for (int i = 0; i < idx1; i++) {
                sum+=arr[i];
            }
            for (int i = idx2+1; i < arr.length; i++) {
                sum+=arr[i];
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
