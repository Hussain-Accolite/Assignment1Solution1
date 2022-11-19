package Assignment;
import java.util.Scanner;
class check{
	int findLoc(int x,int y) {
		for(int i=0;i>=00;i++) {
			if(x==y) {
				return x;
			}
			else {
				x = (x+2)%12;
				y = (y+1)%12;
			}
		}
		return 0;
	}
}
public class solution1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("eneter x location:");
		int x1 = sn.nextInt();
		System.out.println("eneter y location:");
		int y1 = sn.nextInt();
		check ch = new check();
		System.out.println(x1+" and "+ y1 +" meet at location :"+ch.findLoc(x1, y1));
		sn.close();
	}

}
