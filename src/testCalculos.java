
public class testCalculos {
	public static void main(String[] args) {
			Triangulo t1 = new Triangulo("triángulo", 10, 20, 10, 10, 10);
			Triangulo t2 = new Triangulo("triángulo", 15, 25, 15, 15, 15);
			Cuadrado c1 = new Cuadrado("cuadrado 1", 25);
			Rectangulo r1 = new Rectangulo("rectángulo 1",25, 15);
			
			Calculos.calc(t1);
			Calculos.calc(t2);
			
			Calculos.calc(c1);
			
			Calculos.calc(r1);

	}//main
} // class testCalculos
