import java.util.*;
class Box{
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void printArea(){
		int area;
		area=2*length*width+2*length*height+2*width*height;	
		System.out.println("Area   of the box : "+area);	
	}
}

class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input length(cm) : ");
		int length=input.nextInt();
		System.out.print("Input width(cm)  : ");
		int width=input.nextInt();
		System.out.print("Input height(cm) : ");
		int height=input.nextInt();
		System.out.println();
		Box b1=new Box();
		b1.setSize(length,width,height);
		b1.printVolume();
		b1.printArea();
	}
}
