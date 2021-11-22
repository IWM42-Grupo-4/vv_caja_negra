package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasaddFirst {
    @DisplayName("Test addFirst con valor igual al mínimo ")
    @Test
    public void PruebaaddFirst(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "A", "B", "C", "D", "E");
        list.addFirst("A");
        for (int i = 1; i <= list2.size(); i++) {
           assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addFirst con valor inmediatamente superior al mínimo")
    @Test
    public void PruebaaddFirst1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("B");
        list.addFirst("B");
        for (int i = 1; i <= list2.size(); i++) {
           assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addFirst con valor entre el mínimo y el máximo")
    @Test
    public void PruebaaddFirst2(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("P", "A", "B", "C");
        list.addFirst("P");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));


        }

    }

    @DisplayName("Test addFirst con valor inmediatamente inferior al máximo")
    @Test
    public void PruebaaddFirst3(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("Y", "A", "B", "C");
        list.addFirst("Y");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));


        }

    }

    @DisplayName("Test addFirst con valor igual al máximo")
    @Test
    public void PruebaaddFirst4(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("Z", "A", "B", "C");
        list.addFirst("Z");
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));


        }

    }

    @DisplayName("Test addFirst con elemento inferior al mínimo")
    @Test
    public void PruebaaddFirst5(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("P");
        assertThrows(Exception.class, ()->list.addFirst("@"), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");

    }

    @DisplayName("Test addFirst con elemento superior al máximo")
    @Test
    public void PruebaaddFirst6(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("P");
        assertThrows(Exception.class, ()->list.addFirst("["), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");

    }
}
