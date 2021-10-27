class Cube extends Shape{
	void draw() {
		System.out.println("Drawing Cube...");
	}
}

class Line extends Shape{
	void draw() {
		System.out.println("Drawing Line...");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle...");
	}
}

public abstract class Shape {
	abstract void draw();
	
	public static void main(String[] args) {
		Cube c = new Cube();
		c.draw();
		
		Line l = new Line();
		l.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
	}
}


/*
Output:
Drawing Cube...
Drawing Line...
Drawing Rectangle...
*/
