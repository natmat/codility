package codility;

public class BinaryGap {
	public static void main (String[] args) {	
		BinaryGap bg = new BinaryGap();
		System.out.println("Solution=" + bg.solution(0b1010)); //N=10
	}
	
    public int solution(int N) { 
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