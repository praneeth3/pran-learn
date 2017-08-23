package pranlearn.simplilearnwk1;

import java.util.Scanner;

public class Assignment04_NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A:");
		int A = sc.nextInt();
		System.out.println("The number entered is "+A);
		// int cnt=0;
		 
		 for(int i=A; ;i++){
				int c=0;
				System.out.println(c);
				for(int j=1;j>i;j++){
					//syso
					if(i%j==0){
						c++;
					}
				}
				if(c==2){
					System.out.print(i+ "  ");
				}
			}

	}

}
