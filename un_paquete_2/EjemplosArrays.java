package com.un_paquete;

public class EjemplosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           int[] arrayEnteros; 
           
           arrayEnteros = new int[10];
          
           // Bucle for( inicializacion; condicion; iteracion)
          for (int i = 0; i < arrayEnteros.length; i++) {
          System.out.println("array(" + i + ")" + arrayEnteros[i]);
         
	}
    float[] decimales = new float[10];
    for (int j= 0; j < decimales.length; j++) {
    	decimales[j] = (float) j / 35;
    	System.out.println(" El tercio de" + j + decimales[j]);
    }
    int otroArray[] = {5, 10, 15, 20, 25};
    for (int elemento : otroArray) {
    	System.out.println("Elemento =" + elemento);
    }
    String[] dias = {"Lunes; Martes; Miercoles; Jueves; Viernes; Sabado; Domingo"};
    for(String dia: dias) {
    	System.out.println(dia);
    }
    
    for (int d = 0; d < dias.length; d++) {
    	String dia = dias[d];
    	System.out.println(dia);
    }
    int numDia = 2;
    while (numDia < dias.length) {
    	System.out.println(dias[ numDia ]);
    	numDia = numDia + 1;
    }
	}
}
