package com.practica.cajanegra;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasremoveLast {
    @DisplayName("Test removeLast")
    @Test
    public void PruebaremoveLast() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> list2 = new SingleLinkedListImpl<String>("A", "B", "C", "D");
        assertEquals("E", list.removeLast());
        for (int i = 1; i < list.size(); i++) {
            assertEquals(list.getAtPos(i), list2.getAtPos(i));
        }
    }


    @DisplayName("Test removeLast con lista vacía")
    @Test
    public void PruebaremoveLast1() throws EmptyCollectionException {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, ()->list.removeLast());
        }


}
