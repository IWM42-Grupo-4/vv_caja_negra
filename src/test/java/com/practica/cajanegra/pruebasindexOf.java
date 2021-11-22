package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasindexOf {
    @DisplayName("Test indexOf valor igual al mínimo")
    @Test
    public void PruebaindexOf(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(1, list.indexOf("A"));

    }

    @DisplayName("Test indexOf valor inmediatamente superior al mínimo")
    @Test
    public void PruebaindesOf1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "B", "D", "E");
        assertEquals(2, list.indexOf("B"));

    }

    @DisplayName("Test indexOf elemento inexistente")
    @Test
    public void PruebaindesOf2(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(NoSuchElementException.class, () ->list.indexOf("P"));

    }

    @DisplayName("Test indexOf valor inmediatamente inferior al máximo")
    @Test
    public void PruebaindesOf3(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "Y", "B", "Y", "E");
        assertEquals(3, list.indexOf("Y"));

    }

    @DisplayName("Test indexOf valor igual al máximo")
    @Test
    public void PruebaindesOf4(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("Z", "B", "Z", "B", "D", "E");
        assertEquals(1, list.indexOf("Z"));

    }

    @DisplayName("Test indexOf valor inferior al mínimo")
    @Test
    public void PruebaindesOf5(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("@", "B", "C", "B", "D", "E");
        assertThrows(Exception.class, () -> list.indexOf("@"));
    }

    @DisplayName("Test indexOf valor superior al máximo")
    @Test
    public void PruebaindesOf6(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("[", "B", "C", "B", "D", "E");
        assertThrows(Exception.class, () -> list.indexOf("["));
    }
}
