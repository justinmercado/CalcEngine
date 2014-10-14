// Justin Mercado
// PS4
package MainPackage;

public class Calculate {
	
	private double IA;
	private double years;
	private double AIR;
	
	public Calculate(){
		
	}
	
	public Calculate(double IA, double years, double AIR) {
		this.IA = IA;
		this.years = years;
		this.AIR = AIR;
	}


	public double getIA() {
		return IA;
	}

	public void setIA(double iA) {
		IA = iA;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	public double getAIR() {
		return AIR;
	}

	public void setAIR(double aIA) {
		AIR = aIA;
	}
	
	public double FutureValue() {
		double FV= 0;
		double annual= AIR * .01;
		FV = IA * Math.pow((1+annual), years);
		return FV;
	}
	
	

}
