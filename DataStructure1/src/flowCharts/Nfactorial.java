package flowCharts;

import java.util.Scanner;
public class Nfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of the " + n + " is " + fact);
	}

}
