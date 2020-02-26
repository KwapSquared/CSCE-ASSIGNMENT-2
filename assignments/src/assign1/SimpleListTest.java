package assign1;

/*
 * Author: Damon Williams
 * ClassId: 340
 * Assignment: CSE360 Assignment 1
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	// Test initialization of the object SimpleList
	@Test
	void testInit() {
		SimpleList dummy = new SimpleList();
		assertNotNull(dummy);
	}
	
	// Test the 'add' method
	@Test
	void testAdd() {
		SimpleList dummy = new SimpleList();
		dummy.add(4);
		assertEquals(0, dummy.search(4));
	}
	
	// Test the 'toString' method
	@Test
	void testToString() {
		SimpleList dummy = new SimpleList();
		dummy.add(4);
		dummy.add(6);
		dummy.add(8);
		dummy.add(7);
		dummy.remove(7);
		assertEquals(0, dummy.toString().compareTo("8 6 4"));
	}
	
	// Test the 'count' method
	@Test
	void testCount() {
		SimpleList dummy = new SimpleList();
		dummy.add(4);
		assertEquals(1, dummy.count());
	}
	
	// Test the 'search' method
	@Test
	void testSearch() {
		SimpleList dummy = new SimpleList();
		dummy.add(4);
		dummy.add(7);
		dummy.add(3);
		assertNotEquals(-1, dummy.search(3));
	}
	
	// test the 'remove' method
	@Test
	void testRemove() {
		SimpleList dummy = new SimpleList();
		dummy.add(4);
		dummy.add(7);
		dummy.add(3);
		dummy.remove(7);
		assertNotEquals(-1, dummy.search(7));
	}
}
