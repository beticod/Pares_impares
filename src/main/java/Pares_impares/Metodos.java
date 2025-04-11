package Pares_impares;

import java.util.List;

public class Metodos {
		/**
	     * Cuenta el total de números de la lista.
	     * Se recorre la lista usando un bucle indexado.
	     */
	    public int contarNumeros(List<Integer> lista) {
	        int contador = 0;
	        for (int i = 0; i < lista.size(); i++) {
	            contador++;
	        }
	        return contador;
	    }
	    
	    /**
	     * Calcula la media de los números impares.
	     * Si no hay impares, la función devuelve 0.
	     */
	    public double calcularMediaImpares(List<Integer> lista) {
	        int sumaImpares = 0;
	        int contadorImpares = 0;
	        for (int i = 0; i < lista.size(); i++) {
	            int num = lista.get(i);
	            if (num % 2 != 0) {
	                sumaImpares = sumaImpares + num;
	                contadorImpares++;
	            }
	        }
	        double media;
	        if (contadorImpares > 0) {
	            media = (double) sumaImpares / contadorImpares;
	        } else {
	            media = 0;
	        }
	        return media;
	    }
	    
	    /**
	     * Devuelve el mayor de los números pares.
	     * Si no hay ningún número par, la función devuelve 0.
	     */
	    public int mayorDePares(List<Integer> lista) {
	        int mayor = Integer.MIN_VALUE;
	        boolean hayPar = false;
	        for (int i = 0; i < lista.size(); i++) {
	            int num = lista.get(i);
	            if (num % 2 == 0) {
	                if (!hayPar) {
	                    mayor = num;
	                    hayPar = true;
	                } else {
	                    if (num > mayor) {
	                        mayor = num;
	                    }
	                }
	            }
	        }
	        if (hayPar) {
	            return mayor;
	        } else {
	            return 0;
	        }
	    }
	}