package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pruebassize {


    @DisplayName("Test size")
    @Test
    public void Pruebasize() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(5,list.size());
    }

    @DisplayName("Test size lista vacía")
    @Test
    public void Pruebasize1() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        assertEquals(0, list.size());
    }


}
