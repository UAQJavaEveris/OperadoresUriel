package mx.com.everis.tallerjava.operadores;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*Operadores de asignacion*/
		int numero = 4;
		int numero2 = 5;
		
		
		numero+=numero2;
		System.out.println("Numero ahora es igual a: "+numero);
		
		numero-=numero2;
		System.out.println("Numero ahora es igual a: "+numero);
		
		numero=numero2;
		System.out.println("Numero ahora es igual a: "+numero);
		
		numero*=numero2;
		System.out.println("Numero ahora es igual a: "+numero);
			
		
						
		/*Aritmeticos*/
		int numero3 = 16;
		int numero4 = 8;
		
		System.out.println("La suma de "+numero3+" y "+numero4+ " es: "+(numero3+numero4));
		System.out.println("La resta de "+numero3+" y "+numero4+ " es: "+(numero3-numero4));
		System.out.println("El producto de "+numero3+" y "+numero4+ " es: "+(numero3*numero4));
		System.out.println("La división de "+numero3+" y "+numero4+ " es: "+(numero3/numero4));
		System.out.println("El residuo de "+numero3+" y "+numero4+ " es: "+(numero3%numero4));
		System.out.println("Incremento de "+numero3+" es "+(++numero3));
		System.out.println("Decremento de "+numero4+" es "+(--numero4));
		
		/*Relacionales*/
		int numero5 = 15;
		int numero6 = 10;
		int numero7 = 20;
		
		if(numero5 == numero6)
		{
			System.out.println(numero5+" y "+numero6+" son iguales");
		}
		else
		{
			System.out.println(numero5+" y "+numero6+" no son iguales");
		}
		if(numero5 != numero6)
		{
			System.out.println(numero5+" y "+numero6+" son diferentes");
		}
		if(numero5 < numero6)
		{
			System.out.println(numero5+" es menor que "+numero6);
		}
		if(numero7 > numero6)
		{
			System.out.println(numero7+" es mayor que "+numero6);
		}
		
		/*Operadores lógicos*/
		int numero8 = 9;
		int numero9 = 17;
		int numero10 = 12;
		
		if((numero10<numero9)&&(numero9>numero8))
		{
			System.out.println(numero10+" es el numero más grande ");
		}
		if((numero8<numero9)||(numero8<numero10))
		{
			System.out.println(numero8+" es el numero más chico");
		}
		
		
		boolean bool = true;
		boolean bool2 = !bool;
		System.out.println("Variable bool2 tiene valor de "+bool2);
		

	}

}
