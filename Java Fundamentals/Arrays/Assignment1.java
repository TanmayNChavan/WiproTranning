class Assignment1 {
        public static void main(String[] args) {
            int[] arr={10,20,40,7,0};
            int sum=0;
            for (int i : arr) {
                sum+=i;
            }
            System.out.println(sum);
            System.out.println(sum/arr.length);
        }
    
}