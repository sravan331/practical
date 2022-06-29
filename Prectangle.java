package methods;

// perimeter of rectangle program

public class Prectangle {

	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	void calculatePerimeter() {
		System.out.println(2*(length+width));
	}
	class Rectperimeter {
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prectangle b1 = new Prectangle();
		b1.insert(12, 40);
		b1.calculatePerimeter();
	}

}
