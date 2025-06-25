package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        LogicaClasificacion logica = new LogicaClasificacion();
        Queue <String> cola1 = new LinkedList<>();

        cola1.add("Ana");
        cola1.add("Luis");
        cola1.add("Pedro");
        System.out.println("\nPrimer Ejercicio Ordenada: \n\tAna \n\tLuis \n\tPedro\n");
        System.out.println("Desordenada:");
        Queue<String> invertida = logica.invertirColaNombres(cola1);

        for (String nombre : invertida) {
            System.out.println("\t"+nombre);
        }

        // -----------------------------------------------------------------      EJERCICIO 2      -----------------------------------------------------------------

        Queue<String> cola2 = new LinkedList<>();
        cola2.add("r");
        cola2.add("a");
        cola2.add("d");
        cola2.add("a");
        cola2.add("r");
        System.out.println("\nSegundo ejercicio con radar: ");
        System.out.println("\t"+logica.verificarPalindromoCola(cola2));
   
        cola2.add("c");
        cola2.add("a");
        cola2.add("s");
        cola2.add("a");
        System.out.println("Segundo ejercicio con casa: ");
        System.out.println("\t"+logica.verificarPalindromoCola(cola2));
        
    }
}
