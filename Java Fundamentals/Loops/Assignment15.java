import java.util.*;


public class Assignment15{
    

    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=Integer.parseInt(args[0]);
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       

    }
   
}