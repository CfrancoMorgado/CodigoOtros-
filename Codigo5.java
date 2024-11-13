package codigoOtros;

import java.util.Scanner;

public class Codigo5 {
   //El programa pide al usuario que introduzca un numero, posteriormente, divide el numero ingresado entre 10, y el modulo o resto de eso, lo compara
	//o evalua contra ciertas condiciones, si el modulo es igual a 3,7,8, o 9, el valor de una valiable "afo" cambia de cero a uno, en caso de que no
	/*
	 * se cumpla esa condicion, la variable afo permanece en cero y la variable noAfo cambia de cero a uno, 
	 * despues, el programa compara cual de las variables"afo" o noAfo" es mayor y con base en eso emite
	 * un mensaje e si el numero ingresado es afortunado o no.
	 */
	public static void main(String [ ] args ) {  //encapsulamos todo en el metodo main
	    Scanner s = new Scanner(System.in); // se importó el objeto Scanner y se agregó la variable de entrada System.in
	    System.out.println("Introduzca un número: ");// al final habia una comilla simple, cuando iniciaba con comillas dobles. y se agregó el salto de linea en system.out.print
	    int ni = s.nextInt();// ya que en el loop while se utiliza la variable ni como un numero, se guarda en una variable de tipo int
	    int c = ni; 
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (ni % 10); // eliminamos (int) por que el intento de castearlo ya no es necesario, arriba corregimos el tipo de dato para ni
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
	  		noAfo++;
	        } //cerramos el else
	        
	  	  ni /= 10;
	    }
	      if (afo > noAfo) {
	        System.out.println("El " + c + " es un número afortunado.");
	      } else {
	        System.out.println("El " + c + " no es un número afortunado.");
	      }
	      
	      s.close();
	    }

}	
	
	
	

