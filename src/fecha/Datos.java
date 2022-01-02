package fecha;

public class Datos extends Main {
	private String d = " dia";
	private String m = " mes";
	private String a = " anio";

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Datos [d=" + d + ", m=" + m + ", a=" + a + "]";
	}
	
	

}
