package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasaddNTimes {
    @DisplayName("Test addNtimes T correcto y n menor que 0")
    @Test
    public void PruebaaddNTimes() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(IllegalArgumentException.class, () ->list.addNTimes("P", -1));

    }

    @DisplayName("Test addNTimes T igual al mínimo y n igual que 0")
    @Test
    public void PruebaaddNTimes0() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        list2.addNTimes("A", 0);
        for (int i = 1; i <= list.size(); i++) {
            assertEquals(list.getAtPos(i), list2.getAtPos(i));
        }

    }


    @DisplayName("Test addNtimes T inmediatamente superior al mínnimo y n inmediatamente superior al mínimo")
    @Test
    public void PruebaaddNTimes1() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "B");
        list.addNTimes("B", 1);
        for (int i = 1; i <= list2.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addNTimes con T entre mínimo y máximo y n mayor que 1")
    @Test
    public void PruebaaddNTimes2() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "P", "P", "P");
        list.addNTimes("P", 3);
        for (int i = 1; i <= list.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addNTimes con T inmediatamente inferior al máximo y n mayor que 1")
    @Test
    public void PruebaaddNTimes3() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "Y", "Y", "Y");
        list.addNTimes("Y", 3);
        for (int i = 1; i <= list.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addNTimes con T igual al máximo y n mayor que 1")
    @Test
    public void PruebaaddNTimes4() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "Z", "Z", "Z");
        list.addNTimes("Z", 3);
        for (int i = 1; i <= list.size(); i++) {
            assertEquals(list2.getAtPos(i), list.getAtPos(i));

        }

    }

    @DisplayName("Test addNTimes T inferior al mínimo y n valor mayor que 1")
    @Test
    public void PruebaaddNTimes5() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(Exception.class, ()->list.addNTimes("@", 3), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");
    }

    @DisplayName("Test addNTimes T superior al máximo y n valor mayor que 1")
    @Test
    public void PruebaaddNTimes6() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(Exception.class, ()->list.addNTimes("[", 3), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");
    }


}

