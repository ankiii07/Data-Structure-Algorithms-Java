package pattern;
import java.util.Scanner;
public class Pattern2 {
	   public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        // write your code here
	        int n = scn.nextInt();
	        for(int i =n;i>0;i--)
	        {
	            for(int j = 1;j<=i;j++)
	            {
	                System.out.print("*"+"\t");
	            }
	            System.out.println("");
	        }
	    }
}
