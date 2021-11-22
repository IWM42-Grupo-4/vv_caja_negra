package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasaddLast {
    @DisplayName("Test addLast con valor igual al mínimo")
    @Test
    public void PruebaaddLast(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "A");
        list.addLast("A");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addLast con valor inmediatamente superior al mínimo")
    @Test
    public void PruebaaddLast1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("B");
        list.addLast("B");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));
        }

    }

    @DisplayName("Test addLast con valor entre el mínimo y el máximo")
    @Test
    public void PruebaaddLast2(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "P");
        list.addLast("P");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));
        }

    }

    @DisplayName("Test addLast con valor inmediatamente inferior al máximo")
    @Test
    public void PruebaaddLast3(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "Y");
        list.addLast("Y");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));
        }

    }

    @DisplayName("Test addLast con valor igual al máximo")
    @Test
    public void PruebaaddLast4(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "Z");
        list.addLast("Z");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));
        }

    }

    @DisplayName("Test addLast con valor inferior al mínimo")
    @Test
    public void PruebaaddLast5(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(Exception.class, ()->list.addLast("@"), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");
    }

    @DisplayName("Test addLast con valor superior al máximo")
    @Test
    public void PruebaaddLast6(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(Exception.class, ()->list.addLast("["), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");
    }
}