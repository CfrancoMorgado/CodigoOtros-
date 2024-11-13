package codigoOtros;

import java.util.Scanner;

public class Codigo6 {
	
	/*
	 * El programa genera un array de 20 numeros enteros. aleatoriamente. despues ofrece al usuario dos opciones, resaltar 
	 * los numeros multiplos de 5 o de 7. aunque realmente el programa interpreta como la opcion 2 cualquier numero ingresado distinto a 1
	 */

	public  static void main(String[] args) {// encapsulamos el programa en un metodo main
		  Scanner scanner = new Scanner(System.in);
	    int[] n = new int[20]; // corregimos la declaracion del array

	    for (int i = 0; i < 20; i++) {  //agregamos un simbolo + para declarar el incremento de i en 1 por cada ciclo
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //se agrego .out al metodo de salida
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");// faltaba una n en el println para el salto de linea
	    System.out.print("(presioné 1 para resaltar los múltiplos de 5,Ó presione 2 para resaltar los múltiplos de 7): ");// se modificó el mensaje para una mayor claridad al usuario
	    int opcion = scanner.nextInt(); // modificamos el readline por un scanner, debido a que el metodo anterior arrojaba un null

	    int multiplo = (opcion == 1) ? 5:  7; // se corrigió la sintaxis del operador ternario

	    for  (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {  								// se cerr+o el bloque if
	        System.out.print(e + " ");				//se cambió System.in por system.out
	      }
	    }scanner.close();
	    }
	  

	}

/*
 * https://teams.microsoft.com/l/meetup-join/19%3ameeting_MjFhMjYxYjItNzM1MS00YTAzLThhNWQtMjc3ZTVlNTQ3OWEw%40thread.v2/0?context=%7b%22Tid%22%3a%22bd697c1b-c481-479c-841e-c618542675c3%22%2c%22Oid%22%3a%22eb859336-c9d6-4961-aa8b-62f4d3cb5ff8%22%7d
Id. de reunión: 248 517 140 318
Código de acceso: HvnwiV
 */

//
