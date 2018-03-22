package pack1;

public class Main {

	int triangle(int a,int b,int c) {
		if(  a < ( b + c ) && c < ( a + b ) && b < ( a + c ) && a > 0 && b > 0 && c > 0) {
			if( a == b && b == c) {
				return 1;
			}
			else if(a == b || b == c || a == c) {
				return 2;
			}
			else {
				return 3;
			}
		}else {
			return 0;
		}
	}
}
