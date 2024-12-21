package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {

        Set<String> set = new HashSet<>();

        set.add("ELEMENT KPRBC");
        set.add("ELEMENT KPRBC");
        set.add("ELEMENT AADXU");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT WFGEJ");
        set.add("ELEMENT TYGBS");
        set.add("ELEMENT MAPTK");
        set.add("ELEMENT GJXVE");
        set.add("ELEMENT BAFGL");
        set.add("ELEMENT YPBTM");
        set.add("ELEMENT WYMVD");

        return set;
    }

    public static Set<String> createTreeSet() {

        Set<String> set = new TreeSet<>();

        set.add("ELEMENT KPRBC");
        set.add("ELEMENT KPRBC");
        set.add("ELEMENT AADXU");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT WFGEJ");
        set.add("ELEMENT TYGBS");
        set.add("ELEMENT MAPTK");
        set.add("ELEMENT GJXVE");
        set.add("ELEMENT BAFGL");
        set.add("ELEMENT YPBTM");
        set.add("ELEMENT WYMVD");

        return set;
    }

    private static void printSet(Set<String> customSet) {
        //recorremos el conjunto recibido
        for (String s : customSet) {
            System.out.println(s);
        }
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {

        //hacemos una comprobacion para los elementos duplicadosd
        //con un mensaje que deje claro lo que esta pasando
        if (set.add(elementToAdd)) {
            System.out.println("El elemento: " + elementToAdd + " fue agregado con exito");
            return true;
        } else {
            System.out.println("El elemento " + elementToAdd + " esta duplicado. Operacion no valida");
            return false;
        }
    }

    public static void main(String[] args) {

        //asignamos los conjuntos creados en las variables correspondientes
        Set<String> setA = createHashSet();
        Set<String> setB = createTreeSet();

        //mostramos por pantalla los conjuntos y los identificamos
        System.out.println("Elementos del conjunto HashSet:");
        printSet(setA);
        System.out.println("Elementos del conjunto TreeSet: ");
        printSet(setB);

        //agregamos nuevos elementos a cada conjunto
        addElementToSet(setA, "ELEMENT AAA");
        printSet(setA); //mostramos el conjunto actualizado

        addElementToSet(setB, "ELEMENT AAA");
        printSet(setB);
    }

}
