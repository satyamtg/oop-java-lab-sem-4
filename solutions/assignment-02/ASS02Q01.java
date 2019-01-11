class Currency {
	private String currencyCode;
	private String currencyName;
	private double exchangeRate;
	
	public Currency(){
		currencyCode = "INR";
		currencyName = "Indian Rupee";
		exchangeRate = 1;
	}
	
	public Currency(String cCode, String cName, double eRate){
		currencyCode = cCode;
		currencyName = cName;
		exchangeRate = eRate;
	}
	
	public void calc(double value){
		double ans;
		ans = exchangeRate * value;
		System.out.println("Equivalent INR value of "+value+" "+currencyCode+" = "+ans);
	}
	
	public static void main(String args[]){
		Currency USD = new Currency("USD", "US Dollars", 70.52);
		USD.calc(30);
		Currency EUR = new Currency("EUR", "Euros", 81.29);
		EUR.calc(50);
		Currency UKP = new Currency("UKP", "Pound sterlig", 89.67);
		UKP.calc(20);
	}
}
