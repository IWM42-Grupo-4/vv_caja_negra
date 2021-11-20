package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;


public class pruebasgetAtPos {

    @DisplayName("Test getAtPos posición inferior a 1")
    @Test
    public void PruebagetAtPos(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(IllegalArgumentException.class, () ->list.getAtPos(0));

    }

    @DisplayName("Test getAtPos posición igual a valor mínimo")
    @Test
    public void PruebagetAtPos1(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("A", list.getAtPos(1));

    }

    @DisplayName("Test getAtPos posición inmediatamente superior a valor mínimo")
    @Test
    public void PruebagetAtPos2(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("B", list.getAtPos(2));

    }

    @DisplayName("Test getAtPos posición entre valor mínimo y valor máximo")
    @Test
    public void PruebagetAtPos3(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("C", list.getAtPos(3));

    }

    @DisplayName("Test getAtPos posición inmediatamente inferior a valor máximo")
    @Test
    public void PruebagetAtPos4(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("D", list.getAtPos(4));

    }

    @DisplayName("Test getAtPos posición igual a valor máximo")
    @Test
    public void PruebagetAtPos5(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals("E", list.getAtPos(5));

    }

    @DisplayName("Test getAtPos posición superior a valor máximo")
    @Test
    public void PruebagetAtPos6(){
        SingleLinkedListImpl<String> list = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertThrows(IllegalArgumentException.class, () ->list.getAtPos(6));

    }


}
