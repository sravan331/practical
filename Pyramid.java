package assignments;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the pyramid hight  ");
Scanner p = new Scanner(System.in);
int n = p.nextInt();
p.close();
for(int i=0;i<n;i++) {
	for(int j=n-i;j>1;j--) {
		System.out.print(" ");
		}
for(int j=0;j<=i;j++) {
	System.out.print("* ");
}
System.out.println();
}

	}

}
