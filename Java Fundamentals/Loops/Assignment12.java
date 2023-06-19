import java.util.*;


public class Assignment12 {
    

    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       int n=sc.nextInt();
       int count=0;
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count++;
        }
       }
       if(count>=1){
        System.out.println("Number is not prime");
       }else{
        System.out.println("Number is prime");
       }

    }
}

