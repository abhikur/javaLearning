class Operations {
	public double areaOfCircle(int radius) {
		return Math.PI*Math.pow(radius,2);
	}

	public int hcf(int num1, int num2) {
		if(num2%num1 == 0)
			return num1;
		return hcf(num2%num1,num1);
	}

	public int lcm(int num1, int num2) {
		return (num1*num2)/hcf(num1, num2);
	}
}