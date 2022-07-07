package overloadingprogs;
  // prog for method overloading with change in the no of arguments
public class Arguments {  // class
static int add(int a, int b) {  // no of arguments
	return(a+b);
}
static int add(int a, int b, int c) {   // change in no of arguments
	return(a+b+c);
}
class overloading {
	
}
	public static void main(String[] args) {  // main class
		// TODO Auto-generated method stub
System.out.println(Arguments.add(12, 10));
System.out.println(Arguments.add(13, 20, 30));

	}

}
