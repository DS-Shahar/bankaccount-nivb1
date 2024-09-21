package nm;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	public void draw() {
		for(int i=0;i<width+1;i++) {
			if(i!=0)
			System.out.print('|');
			else
				System.out.print(' ');
			for(int j=0;j<length;j++) {
				if(i==0 || i==width)
					System.out.print('_');
				else
					System.out.print(' ');
			}
			if(i!=0)
			System.out.println('|');
			else
				System.out.println(' ');
		}
		}	
	
	public int calcArea() {
		return length*width;
	}
	public int calcPerimeter() {
		return length*2+width*2;
	}
	public void scale(int factor) {
		length=length*factor;
		width=width*factor;
	}
	public String toString() {
		return "length is: "+ length+ " width is: "+ width;
	}

	}
	

