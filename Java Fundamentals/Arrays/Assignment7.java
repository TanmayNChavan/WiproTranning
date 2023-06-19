import java.util.LinkedHashSet;

public class Assignment7 {
    public static void removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        System.out.print(set);
    }

    public static void main(String[] args) {
        int[] arr={65,66,97,88,98,100,55,58,2,1,10,10,65,97};
        removeDuplicates(arr);
    }
}
