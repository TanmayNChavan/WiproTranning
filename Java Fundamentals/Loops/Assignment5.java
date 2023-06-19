import java.util.*;

class Assignment5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if((a>=65 && a<=90)||(a<=122 && a>=97)){
            System.out.println("Alphabets");
        }else if(a<=57 && a>=47){
            System.out.println("Digits");
        }else{
            System.out.println("Special Characters");
        }
		
	}
}