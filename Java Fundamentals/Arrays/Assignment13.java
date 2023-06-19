public class Assignment13 {
    public static void main(String[] args) {
        int len = args.length;
        if (len < 4) {
            System.out.println("plese enter 4 integer numbers");
        } else{
            int arr[][]=new int[2][2];
            int i=0;int k=0;
            while (i<2 ) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j]=Integer.parseInt(args[k++]);
                }
                i++;
            }
            for ( i = arr.length-1; i >=0; i--) {
                for (int j = arr.length-1; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
