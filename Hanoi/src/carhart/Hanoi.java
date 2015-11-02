package carhart;
import java.util.Scanner;

public class Hanoi {

	public Hanoi() {
		
	}
	
	   public static void Solve(int n, String beg, String aux, String end) {
	       if (n == 1) {
	           System.out.println("Move from " + beg + " to " + end);
	       } else {
	           Solve(n - 1, beg, end, aux);
	           System.out.println("Move from " + beg + " to " + end);
	           Solve(n - 1, aux, beg, end);
	       }
	   }

	   public static void main(String[] args) {
	       Hanoi towersOfHanoi = new Hanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.Solve(discs, "A", "B", "C");
	   }
}