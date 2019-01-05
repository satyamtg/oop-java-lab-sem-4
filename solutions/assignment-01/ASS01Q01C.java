class ASS01Q01C {
	private static int numx;
	public static void display(int n) {
			System.out.println(n);
	}

	public static void setVal(int n){
		numx = n;
	}

	public static void main(String args[]){
		setVal(5);
		display(numx);
	}
}
