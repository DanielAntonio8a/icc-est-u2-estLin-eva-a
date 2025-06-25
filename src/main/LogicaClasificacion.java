package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {        
        Stack<String> pila = new Stack<>();
        // Hacemos una copia para no modificar la original
        Queue<String> copia = new LinkedList<>(cola);
        while (!copia.isEmpty()) {
            pila.push(copia.poll());
        }
        Queue<String> invertida = new LinkedList<>();
        while (!pila.isEmpty()) {
            invertida.add(pila.pop());
        }
        return invertida;
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        List<String> lista = new ArrayList<>(cola); // Copiamos para no modificar la cola
        int i = 0, j = lista.size() - 1;
        while (i < j) {
            if (!lista.get(i).equals(lista.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
