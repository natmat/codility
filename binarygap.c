// you can write to stdout for debugging purposes, e.g.
// printf("this is a debug message\n");

int main() {int solution(int N) {
	solution(10);
}

int solution(int N) {
    int gap = 0;
    int max = 0;
    int start = 0;
    while (N > 0) {
        if (N & 0x1) {
            if (start) {
                max = (max > gap) ? max : gap;
            }
            else {
                start = 1;
            }
            gap = 0;
        }
        else {
            gap++;
        }

        N >>= 1;
    }
    return(max);
}