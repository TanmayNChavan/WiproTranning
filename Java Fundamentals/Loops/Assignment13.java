import java.util.*;


public class Assignment13{
    

    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int count=0;
       for(int i=10;i<=99;i++){
        if(isPrime(i)==1){
           System.out.println(i);
        }
       }
       

    }
    public static int isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count++;
        }
       }
       if(count>=1){
        return 0;
       }else{
        return 1;
       }
    }
}

