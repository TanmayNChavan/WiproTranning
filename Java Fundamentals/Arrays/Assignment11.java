public class Assignment11 {
    public static void main(String[] args) {
        int arr[]={1,4,1,4};
        int flag=1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]!=1 && arr[i]!=4)) {
                System.out.println(false);
                flag=0;
                break;
            }
        }
        if (flag==1) {
            System.out.println(true);
        }
    }
}
