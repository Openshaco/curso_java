package com.paquete;

public class EjemplosRaros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("EjemplosRaros");
        
        int a = 1;
        int b = 2;
     operadoresComparacion(a, b);
	}
    public static void operadoresComparacion(int a, int b)  {
    	   if (a == b);
            System.out.println("Son iguales"); 
            
        if (a < b);
            System.out.println(a + "menor que" + b);
        if (a > b);
            System.out.println(a + "mayor que" + b);
        if (a != b);
            System.out.println(a + " es disinto de" + b);
        if (a >= b);
            System.out.println(a + "mayor o igual  que" + b);  
        if (a <= b);
            System.out.println(a + "menor o igual que" + b);
		
	}
}
