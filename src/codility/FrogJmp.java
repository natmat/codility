package codility;

public class FrogJmp {

	public static void main(String[] args) {
		FrogJmp.solution(1,2,3);
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
