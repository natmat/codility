package Codility;

public class BinaryGap {
	public static void main (String[] args) {
		System.out.println("Solution=" + solution(10));
	}
	
    public static int solution(int N) {
        int gap = 0;
        int bg = 0;
        boolean start = false;
        while (N > 0) {
            if ((N & 0x1) == 0) {
                if (start) gap++;
            }
            else {
                if (!start) {
                    start = true;
                }
                else {
                    bg = (gap > bg) ? gap : bg;
                    gap = 0;
                }
            }
            N >>= 1;
        }
        return(bg);
    }
}