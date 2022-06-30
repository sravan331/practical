package assignments;

//@author sravan kumar
// prog for amstrong numbers

public class Amstrong {  // main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize variables
int n = 370;  
int t;
int am = 0;
int or = n;
while(n>0) {  // loop execution
	 t = n%10;
	 t = t*t*t;
	 am = am+t;
	 n=n/10;
	 }
	if(am==or) {  // checking the condition
		System.out.println("number is amstrong  "+am);
	}
	else {
		System.out.println("number os not amstrong  "+am);
	}
	}
	

}
