import java.util.*;
class Assignment1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("No is positive");
        }else if(n<0){
            System.out.println("No is negative");
        }else{
            System.out.println("No is zero");
        }
    }
}