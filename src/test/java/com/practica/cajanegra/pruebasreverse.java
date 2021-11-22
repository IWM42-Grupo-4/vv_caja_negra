package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pruebasreverse {
    @DisplayName("Test reverse lista no vacía")
    @Test
    public void Pruebareverse() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        SingleLinkedListImpl<String> listr = new SingleLinkedListImpl<String>();
        listr= (SingleLinkedListImpl<String>) list.reverse();
        for (int i = 1; i <= list.size(); i++) {
            assertEquals(list.getAtPos(list.size()+1-i), listr.getAtPos(i));

        }

    }

    @DisplayName("Test reverse lista vacía")
    @Test
    public void Pruebareverse1() {
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> listr = new SingleLinkedListImpl<String>();
        listr= (SingleLinkedListImpl<String>) list.reverse();
        for (int i = 1; i <= listr.size(); i++) {
            assertEquals(list.getAtPos(list.size()+1-i), listr.getAtPos(i));
        }
    }
}
