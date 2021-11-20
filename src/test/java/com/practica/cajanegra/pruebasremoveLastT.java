package com.practica.cajanegra;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class pruebasremoveLastT {
    @DisplayName("Test removeLast(T) valor igual al mínimo presente una vez en la lista en primera posición")
    @Test
    public void PruebaremoveLast0() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("B", "C", "D", "E");
        list.removeLast("A");
        //assertEquals("A", list.removeLast("A"));
        for (int i = 1; i < list2.size() ; i++) {
            assertEquals(list.getAtPos(i), list2.getAtPos(i));

        }
    }

    @DisplayName("Test removeLast(T) valor inmediatamente superior al mínimmo presente varias veces en la lista")
    @Test
    public void PruebaremoveLast1() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "B", "C", "D", "B", "C");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "C", "C", "D", "B", "C");
        list.removeLast("B");
        //assertEquals("B", list.removeLast("B"));
        for (int i = 1; i < list2.size()+1 ; i++) {
            assertEquals(list.getAtPos(i), list2.getAtPos(i));


        }
    }
    @DisplayName("Test removeLast(T) con valor entre mínimo y máximo no presente en la lista")
    @Test
    public void PruebaremoveLast2() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "B", "C", "D", "C");
        assertThrows(NoSuchElementException.class, () ->list.removeLast("J"));

    }

    @DisplayName("Test removeLast(T) con lista vacía")
    @Test
    public void PruebaremoveLast3() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, () ->list.removeLast("Y"));
    }

    @DisplayName("Test removeLast(T) con valor igual al máximo")
    @Test
    public void PruebaremoveLast4() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "B", "C", "D", "Z");
        list.removeLast("Z");
        for (int i = 1; i < list.size()+1; i++) {
            System.out.println(list.getAtPos(i));

        }

    }

    @DisplayName("Test removeLast(T) valor inferior al mínimo")
    @Test
    public void PruebaremoveLast5() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "B", "C", "D", "C");
        assertThrows(Exception.class, ()->list.removeLast("@"), "Test fallido debido a la no aparición de una excepción por el uso de un elemento fuera de rango");
    }

    @DisplayName("Test removeLast(T) valor superior al máximo")
    @Test
    public void PruebaremoveLast6() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "B", "C", "D", "C");
        assertThrows(Exception.class, ()->list.removeLast("["), "Test fallido debido a la no aparición de una excepción por el uso de un elemento fuera de rango");
    }


}
