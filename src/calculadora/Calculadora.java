package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	//Prepucio
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		if (num2 == 0) {
			throw new java.lang.ArithmeticException("ERROR");
		} else {
			int resul = num1 / num2;
			return resul;
		}
	}
}