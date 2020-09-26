import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int a = 1, b=0, c=0, suma=0;
		for (int i = 0; i < n; i++) {
			suma=suma+c;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(suma);

	}

}
