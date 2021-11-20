package com.practica.cajanegra;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class pruebastoString {
    @DisplayName("Test toString con lista correcta")
    @Test
    public void PruebatoString() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("[A, B, C, D, E]", list.toString());
    }

    @DisplayName("Test toString con lista correcta")
    @Test
    public void PruebatoString1() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        assertEquals("[]", list.toString());

    }
}
