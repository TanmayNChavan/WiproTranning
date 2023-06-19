public class Assignment14 {
    public static void main(String[] args) {
        int len = args.length;
        if (len < 9) {
            System.out.println("plese enter 9 integer numbers");
        } else {
            int [][]arr=new int[3][3];
            int i=0;int k=0;
            while (i<3 ) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j]=Integer.parseInt(args[k++]);
                }
                i++;
            }
            
            int max = 0;
            for ( i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    max = Math.max(max, arr[i][j]);
                }
            }
            System.out.println("Max number " + max);
        }
    }
}
