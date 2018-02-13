package com.incyde;

import java.sql.Date;
import java.util.Scanner;

public class meHeEquibocado
{
	static float capital;
	static float precio = 7.5f;
	static int horaIda;
	static int haraIda_1 = 7;
	static int horaPase_2 = 9;
	static int horaRecomendada;
	static Scanner teclado;
	
	public static void main(String[] args) 
	{
		System.out.println ("hola la fecha de hoy es:");
		System.out.println ("09/02/2018");
		boolean resultadoCine;
	    System.out.println("programa cine V4");
	    teclado = new Scanner(System.in); 
	    String siSalir;
		do {
	         pedirDatosDinero();
	         pedirDatosHora();
	         resultadoCine = comprobarSiVamosAlCine();
	         mostrarResultado(resultadoCine);
	         System.out.println("Desea continuar (Si/No)");
	         teclado.nextLine();
	         siSalir = teclado.nextLine();
	     } while (siSalir.equals("Si") || siSalir.equals("si"));
         teclado.close();
         System.out.println("Fin del programa");
	}
   
	public static void pedirDatos() {
    	
    	Scanner teclado;
    	teclado = new Scanner(System.in);
	  System.out.println("introduzca su dinero"); 
	  capital = teclado.nextFloat();
	  System.out.println("INTRODUZCA la hora de ida");
	  haraIda_1 = teclado.nextInt();
	  teclado.close();
	 
    }
	public static void pedirDatosDinero ()
	{
		System.out.println("Introduzca su dinero");
		capital = teclado.nextFloat();
	}
	public static void pedirDatosHora()
	{
		System.out.println("Introduzca la hora de ida");
		capital = teclado.nextInt();
	}
    public static boolean comprobarSiVamosAlCine () {
		
		
		if (capital >= precio)
    		if (horaIda >=  horaPase_2 - 1 && haraIda_1 <= horaPase_2 ) {  
    			horaRecomendada = horaPase_2; 
    	    return true; 
       }    
    	else
    		if (horaIda >= horaPase_2- 1 && haraIda_1 <= horaPase_2) {
    			horaRecomendada = horaPase_2; 
    			return true; 
    	}                             
		{
      	
		} return false; 
    	 
    }
    public static void mostrarResultado(boolean resultado) 

    {
	    if (resultado == true)
	    {
	    	System.out.println("Si que podemos ir al cine"); 
	    }else {
	    	System.out.println("No podemos ir alcine"); 
	    }
    }
    { 
    	System.out.println("la hora recomendada es " + horaRecomendada);
    }

}
