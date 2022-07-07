package overloadingprogs;
  // method overloading---change in the data types of arguments
public class Datatypes {
static int add(int a,int b) { //arguments are int data type
	return(a+b);
}
static double add(double a,double b) {  //arguments we are taking different data types
	return(a+b);
}
class overloading {
	
}
	public static void main(String[] args) {  //main class
		// TODO Auto-generated method stub
System.out.println(Datatypes.add(34, 50));
System.out.println(Datatypes.add(12.3, 20.8));
	}

}
