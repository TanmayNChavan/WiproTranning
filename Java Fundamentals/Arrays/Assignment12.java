public class Assignment12 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int temp[]=new int[2];
        int k=0;
        if (arr1[1]<arr2[1]) {
            temp[k++]=arr1[1];
            temp[k]=arr2[1];
        }else  {
            temp[k++]=arr1[2];
            temp[k]=arr2[1];
            
        }
        for (int i : temp) {
            System.out.println(i);
        }
    }
}
