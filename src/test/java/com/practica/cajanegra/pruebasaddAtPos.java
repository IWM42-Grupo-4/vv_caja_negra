package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class pruebasaddAtPos {

	@DisplayName("Test addAtPos T clase válida y p por debajo del valor mínimo")
	@Test
	public void PruebaaddAtPos(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		assertThrows(IllegalArgumentException.class, () ->mylist.addAtPos("P", 0));
	}
	@DisplayName("Test addAtPos T igual al valor mínimo y n igual al valor mínimo")
	@Test
	public void PruebaaddAtPos1(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("P", "A", "B", "C", "D", "E");
		mylist.addAtPos("P", 1);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}
	}
	@DisplayName("Test addAtPos T inmediatamente superior al valor mínimo y p inmediatamente superior al mínimo")
	@Test
	public void PruebaaddAtPos2(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("A", "P", "B", "C", "D", "E");
		mylist.addAtPos("P", 2);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}

	}
	@DisplayName("Test addAtPos T entre el mínimo y el máximo y p valor nominal")
	@Test
	public void PruebaaddAtPos3(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("A", "B", "P", "C", "D", "E");
		mylist.addAtPos("P", 3);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}

	}
	@DisplayName("Test addAtPos T inmediatamente inferior al valor máximo y p valor nominal")
	@Test
	public void PruebaaddAtPos4(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("A", "B", "C", "P", "D", "E");
		mylist.addAtPos("P", 4);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}

	}
	@DisplayName("Test addAtPos T igual al valor máximo y p valor nominal")
	@Test
	public void PruebaaddAtPos5(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "P", "E");
		mylist.addAtPos("P", 5);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}

	}
	@DisplayName("Test addAtPos T clase válida y p superior al tamaño")
	@Test
	public void PruebaaddAtPos6(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		SingleLinkedListImpl<String> mylist2 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "P");
		mylist.addAtPos("P", 6);
		for (int i = 1; i <= mylist.size(); i++) {
			assertEquals(mylist2.getAtPos(i), mylist.getAtPos(i));
		}

	}

	@DisplayName("Test addAtPos T inferior al mínimo y p valor nominal")
	@Test
	public void PruebaaddAtPos7(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		assertThrows(Exception.class, ()->mylist.addAtPos("@", 3), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");

	}

	@DisplayName("Test addAtPos T superior al límite máximo y p valor nominal")
	@Test
	public void PruebaaddAtPos8(){
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
		assertThrows(Exception.class, ()->mylist.addAtPos("[", 3), "Test fallido debido a la no aparición de una excepción al usar un valor fuera de rango");

	}





}
