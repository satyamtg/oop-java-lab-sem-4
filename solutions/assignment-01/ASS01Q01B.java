class ASS01Q01B {
	public static int gcd(int n1, int n2) {
		n1 = ( n1 > 0) ? n1 : -n1;
			n2 = ( n2 > 0) ? n2 : -n2;
			while(n1 != n2)
			{
					if(n1 > n2){
							n1 -= n2;
						}
					else{
							n2 -= n1;
						}
			}
			return n1;
	}

	public static long factorial(int num) {
		int i = 1;
			long factorial = 1;
			while(i <= num)
			{
					factorial *= i;
					i++;
			}
			return factorial;
	}

	public static void main(String args[]){
		int m = 4, n = 5, p = 6;
		int a = gcd(m, n);
		long b = factorial(p);
		System.out.println("GCD of "+m+" and "+n+" is "+a);
		System.out.println("Factorial of "+p+" is "+b);
	}
}
