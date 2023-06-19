import java.util.Scanner;

public class Assignment3 {
    public static int bSearch(int key,int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,40,7,80};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key value:");
        int key=sc.nextInt();
        int idx=bSearch(key, arr);
        System.out.println(idx);
        sc.close();
    }
}
