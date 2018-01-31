import java.util.Scanner;

public class Ut7 {
	
	public static void imprimirMayor(int num[]) {
		int max = 0;
		for(int i = 0; i < num.length;i++) {
			if (num[i] > max) {
				max = num [i];
			}
		}
		System.out.println("El valor máximo es: " + max);
	}
	
	public static void imprimirMenor(int num[]) {
		int min = 10;
		for(int i = 0; i < num.length;i++) {
			if (num[i] <= min) {
				min = num [i];
			}
			}
		System.out.println("El valor mínimo es: " + min);
	}
	
	public static void media(int num[]) {
		int suma = 0;
		for(int i = 0; i < num.length;i++) {
			suma = suma + num[i];
		}
		double media = (double)suma / (double)num.length;
		System.out.println("La media de los valores es: " + media);
	}
	
	public static void imprimirArray(int num[]) {
		for(int i = 0; i < num.length;i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public static void busquedaNum(int num[],int busca) {
		int veces = 0;
		for(int i = 0; i < num.length;i++) {
			if (num[i] == busca) {
				veces += 1;
			}
		}
		System.out.println("El valor " + busca + " se encuentra " + veces + " veces");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se crea el array de 20 nÃºmeros aleatorios entre 1 y 10
		int[] numeros = new int[20];
		for(int i=0 ;i < 20; i++) {
			
			numeros[i] = (int) (Math.random()*10) + 1;
		}
		
		//Se crea el Scanner
		Scanner sc = new Scanner(System.in);
		int menu = 0;
				
		do{
					
		//Menu
		System.out.println("\nMenú:");
		System.out.println("1. Imprimir el mayor valor del array.");
		System.out.println("2. Imprimir el menor valor del array.");
		System.out.println("3. Calcular la media de todos los valores del array.");
		System.out.println("4. Imprimir todos los valores del array.");
		System.out.println("5. Número de veces que se repite un valor en el array.");
		System.out.println("0. Salir.");
		System.out.println("Introduzca la opción deseada: ");
		//Se pide la opción al usuario
		menu = sc.nextInt();
					
		switch(menu){
			case 1: imprimirMayor(numeros); break;
			case 2: imprimirMenor(numeros); break;
			case 3: media(numeros); break;
			case 4: imprimirArray(numeros); break;
			case 5:
				System.out.println("Introduzca el valor a buscar: ");
				int val1 = sc.nextInt();
				busquedaNum(numeros,val1);
				break;
			case 0: 
				System.out.println("Gracias por usar el programa");
				break;
			default: 
				System.out.println("Por favor, introduzca una opción correcta.");
				break;
			}
					
		}while(menu != 0);
		sc.close();
	}

}
