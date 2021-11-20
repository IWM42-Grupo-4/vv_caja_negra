package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class pruebasisSublist {
    @DisplayName("Test isSublist con sublista presente y valor de T igual al mínimo")
    @Test
    public void PruebaisSublist(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("A");
        assertEquals(1, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista no presente y valor de T inmediatamente superior al mínimo")
    @Test
    public void PruebaisSublist1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "E");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("B");
        assertEquals(-1, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista vacía")
    @Test
    public void PruebaisSublist2(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>();
        assertEquals(0, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista presente y valor de T entre mínimo y máximo")
    @Test
    public void PruebaisSublist3(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "E");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("C");
        assertEquals(2, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista presente y valor inmediatamente inferior al máximo")
    @Test
    public void PruebaisSublist4(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "Y");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("Y");
        assertEquals(4, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista presente y valor igual al máximo")
    @Test
    public void PruebaisSublist5(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "Z");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("Z");
        assertEquals(4, list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista presente y valor inferior al mínimo")
    @Test
    public void PruebaisSublist6(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "Z");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("@");
        assertThrows(Exception.class, () -> list.isSubList(sublist));
    }

    @DisplayName("Test isSublist con sublista presente y valor superior al máximo")
    @Test
    public void PruebaisSublist7(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "C", "D", "Z");
        SingleLinkedListImpl<String> sublist = new SingleLinkedListImpl<String>("[");
        assertThrows(Exception.class, () -> list.isSubList(sublist));
    }








}
