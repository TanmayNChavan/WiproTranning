import java.util.*;

class Assignment7 {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       char a=sc.next().charAt(0);
       if(a>=65 && a<=90){
        System.out.println(Character.toLowerCase(a));
       }else{
        System.out.println(Character.toUpperCase(a));
       }

    }
}