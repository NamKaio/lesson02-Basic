package nam.dev;

public class BasicIfConditional {

	public static void main(String[] args) {
		
		float a = 1;
		float b = 2;
		float c = 3;
		float x1;
		float x2;
		float d = b*b - 4*a*c;
		
		if (d>0) {
			x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
			System.out.println("Phuong trinh co 2 nghiem la: " + "x1= " + x1 + "x2= " + x2);
	}
		else if (d==0) {
			x1 = (float) (-b / a);
			System.out.println("Phuong nghiem co nghiem kep la: " + "x1= " + x1);
		}
		else {
			System.out.println("phuong trinh vo nghiem");
		}
	}
}
