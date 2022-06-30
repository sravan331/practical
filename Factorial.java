package assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println("enter the value for factorial ");
Scanner fac = new Scanner(System.in);
int n = fac.nextInt();
int fact = 1;
for(int i=1;i<=n;i++) {
	fact = fact*i;
	}
System.out.println("the factorial no for "+n+" is "+fact);
}
}
