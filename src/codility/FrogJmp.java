package codility;

public class FrogJmp {

	public static void main(String[] args) {
		System.out.println("FrogJmp=" + FrogJmp.solution(0,10,3));
	}

	public static int solution(int X, int Y, int D) {
		if (X == Y) {
			return(0);
		}
		int diff = (Y-X);
		int steps = (int)(diff/D);
		if ((X + steps*D) < Y) {
			steps++;
		}
		return(steps);
	}
}
