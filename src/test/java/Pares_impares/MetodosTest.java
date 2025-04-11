package Pares_impares;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MetodosTest {

    @Test
    public void testContarNumeros() {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        Metodos metodos = new Metodos();
        int resultado = metodos.contarNumeros(lista);
        Assert.assertEquals("El conteo debe ser 3", 3, resultado);
    }
    
    @Test
    public void testCalcularMediaImpares() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        Metodos metodos = new Metodos();
        double resultado = metodos.calcularMediaImpares(lista);
        Assert.assertEquals("La media de los impares debe ser 3.0", 3.0, resultado, 0.00001);
    }
    
    @Test
    public void testMayorDePares() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        Metodos metodos = new Metodos();
        int resultado = metodos.mayorDePares(lista);
        Assert.assertEquals("El mayor par debe ser 4", 4, resultado);
    }
    
    @Test
    public void testCalcularMediaImparesSinImpares() {
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        Metodos metodos = new Metodos();
        double resultado = metodos.calcularMediaImpares(lista);
        Assert.assertEquals("Si no hay impares, debe devolver 0", 0.0, resultado, 0.00001);
    }
    
    @Test
    public void testMayorDeParesSinPares() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(5);
        Metodos metodos = new Metodos();
        int resultado = metodos.mayorDePares(lista);
        Assert.assertEquals("Si no hay pares, debe devolver 0", 0, resultado);
    }
    
    @Test
    public void testListaVacia() {
        List<Integer> lista = new ArrayList<>();
        Metodos metodos = new Metodos();
        
        int conteo = metodos.contarNumeros(lista);
        double mediaImpares = metodos.calcularMediaImpares(lista);
        int mayorPares = metodos.mayorDePares(lista);
        
        Assert.assertEquals("Lista vacía: conteo debe ser 0", 0, conteo);
        Assert.assertEquals("Lista vacía: media de impares debe ser 0", 0.0, mediaImpares, 0.00001);
        Assert.assertEquals("Lista vacía: mayor de pares debe ser 0", 0, mayorPares);
    }
}
