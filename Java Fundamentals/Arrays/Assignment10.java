public class Assignment10 {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,2,1,1};
        int temp[]=new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                temp[k++]=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                temp[k++]=arr[i];
            }
        }
        for (int i : temp) {
            System.out.print(i+" ");
        }
    }
}
