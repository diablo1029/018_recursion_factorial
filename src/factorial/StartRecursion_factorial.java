package factorial;
public class StartRecursion_factorial {
	public static void main(String[] args) {
		int n = 7;
		int num = 7;
		recurse(n, num);
	}
	private static void recurse(int n, int num) {
		System.out.println("recurse value is " + num + " on this recursion pass");
		n--;
		num = num*n;
		if (n>=2) {
			recurse(n, num);
		}
	}
}
