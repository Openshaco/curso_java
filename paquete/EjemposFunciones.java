package com.paquete;

public class EjemposFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("V3 - ProgramaCine");
          // Empezando
          int x;
          int y;
          x = 6;
          y = 15; 
          int resultadoSuma = sumarNumeros(x, y);
          int resultadoResta = restarNumeros(x, y);
        
          System.out.println("resultado suma = " + resultadoSuma);
          System.out.println("resultado resta = " + resultadoResta);
          System.out.println("resultado alcuadrado = " + AlcuadradoNumeros(y));
          System.out.println("resultado alcubo = " + AlcuboNumeros(3));
	}
    public static int sumarNumeros(int valor_1, int valor_2) {
    	return valor_1 + valor_2; 
    }
    public static int restarNumeros(int valor_1, int valor_2) {
    	return valor_1 - valor_2; 
    }
    public static int AlcuadradoNumeros(int v) {
    	int resultado = v * v;
    	return resultado; 
    }
    public static double AlcuboNumeros(int parametro) {
    	double result = Math.pow(parametro, 3);
    	 return result; 
    }
}
