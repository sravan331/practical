package assignments;
import java.util.Scanner;

public class Leapyears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a leap year ");
Scanner year = new Scanner(System.in);
int leap = year.nextInt();
year.close();
if(leap%400==0||leap%4==0) {
	System.out.println("the year is leap year "+leap);
}
else {
	System.out.println("the year is non leap year "+leap);
}
	}

}
