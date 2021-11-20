package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DisplayName;

public class pruebasisEmpty {
    @DisplayName("Test isEmpty con lista vacía")
    @Test
    public void PruebaisEmpty(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        assertTrue(list.isEmpty());
    }

    @DisplayName("Test isEmpty con lista no vacía")
    @Test
    public void PruebaisEmpty1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C");
        assertFalse(list.isEmpty());

    }

}
