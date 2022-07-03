package basics;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your choice ");
		Scanner v = new Scanner(System.in);
		int r=v.nextInt();
		String name[] = {"ravi","sayan","sravan","kavya","chitti"};
		switch(r) {
		case 1: 
		if(name[0] == "sravan") {
			System.out.println("switch case is very easyfor sayan");
		}
			
		break;
		case 2: if(name[1]=="sravan") {
			System.out.println("switch case is very easyfor sayan");
			
		}
		break;
		case 3: if(name[2]=="sravan") {
			System.out.println("switch case is very easyfor sayan");
		}
		break;
		default: 
			System.out.println("chitti is a nice girl");
		}
		}
	}