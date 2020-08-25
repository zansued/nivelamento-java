import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Double pi = 3.14159;
		
		System.out.println("Digite o tamanho do raio do círculo: ");
		Double raio = entrada.nextDouble();
		
		Double areaDeUmCirculo = Math.pow(raio, 2) * pi;
    
	    	System.out.printf("O círculo com o raio %.4f possui uma área A=%.6f %n", raio, areaDeUmCirculo);

		sc.close();
	}
}
