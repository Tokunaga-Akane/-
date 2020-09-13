public class Change{
	public static void main(String[]args){
		int x = 1;
		int y = 2;
		
		System.out.println("This orange is "+x+" dollar, that apple is "+y+" dollars.");
		int m = x;
		x= y;
		y= m;
		
		System.out.println("This orange is "+x+" dollars, that apple is "+y+" dollar.");
		
	}
}
