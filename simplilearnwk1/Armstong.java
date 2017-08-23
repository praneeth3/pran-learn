package pranlearn.simplilearnwk1;

public class Armstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 153;
		// int b= a%10;
		// int c = a/10;
		// System.out.println("b "+b+" c "+c);
		int a = n;
		int cnt = 0;
		int c = 0;
		while (a % 10 != 0) {
			cnt++;
			int b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
		System.out.println(cnt);
		System.out.println(c);
		if (c == n) {
			System.out.println(n + " is Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}

	}

}
