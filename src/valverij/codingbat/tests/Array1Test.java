package valverij.codingbat.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import valverij.codingbat.Array1;

public class Array1Test {
	
	Array1 array1;
	
	@Before
	public void setUp() {
		array1 = new Array1();
	}

	@Test
	public void firstLast6Test() {
		assertTrue(array1.firstLast6(new int[] {1, 2, 6}));
		assertTrue(array1.firstLast6(new int[] {6, 1, 2, 3}));
		assertFalse(array1.firstLast6(new int[] {13, 6, 1, 2, 3}));
	}
	
	@Test
	public void sameFirstLastTest() {
		assertFalse(array1.sameFirstLast(new int[] {1, 2, 3}));
		assertTrue(array1.sameFirstLast(new int[] {1, 2, 3, 1}));
		assertTrue(array1.sameFirstLast(new int[] {1, 2, 1}));
		assertTrue(array1.sameFirstLast(new int[] {1}));
		assertFalse(array1.sameFirstLast(new int[] {}));
	}
	
	@Test
	public void makePiTest() {
		int[] pi = array1.makePi();
		assertEquals(3, pi.length);
		assertEquals(3, pi[0]);
		assertEquals(1, pi[1]);
		assertEquals(4, pi[2]);
	}

	@Test
	public void commonEndTest() {
		assertTrue(array1.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
		assertFalse(array1.commonEnd(new int[] {1, 2, 3, 1}, new int[] {7, 3, 2}));
		assertTrue(array1.commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));		
	}
	
	@Test
	public void sum3Test() {		
		assertEquals(6, array1.sum3(new int[] {1, 2, 3}));
		assertEquals(18, array1.sum3(new int[] {5, 11, 2}));
		assertEquals(7, array1.sum3(new int[] {7, 0, 0}));		
	}
	
	@Test
	public void rotateLeft3Test() {
		int[] arr = new int[] {1, 2, 3};
		int[] rotated = array1.rotateLeft3(new int[] {1, 2, 3});
		assertEquals(arr[1], rotated[0]);
		assertEquals(arr[2], rotated[1]);
		assertEquals(arr[0], rotated[2]);		
	}
	
	@Test
	public void reverse3Test() {
		int[] arr = new int[] {1, 2, 3};
		int[] reversed = array1.reverse3(new int[] {1, 2, 3});
		assertEquals(arr[0], reversed[2]);
		assertEquals(arr[1], reversed[1]);
		assertEquals(arr[2], reversed[0]);		
	}
	
	@Test
	public void maxEnd3Test() {
		int[] arr = new int[] {1, 2, 3};
		int[] maxed = array1.maxEnd3(new int[] {1, 2, 3});
		assertEquals(arr[2], maxed[0]);
		assertEquals(arr[2], maxed[1]);
		assertEquals(arr[2], maxed[2]);		
	}
	
	@Test
	public void sum2Test() {		
		assertEquals(3, array1.sum2(new int[] {1, 2, 3}));
		assertEquals(2, array1.sum2(new int[] {1, 1}));
		assertEquals(2, array1.sum2(new int[] {1, 1, 1, 1}));
		assertEquals(0, array1.sum2(new int[] {}));
		assertEquals(1, array1.sum2(new int[] {1}));
	}
	
	@Test
	public void middleWayTest() {
		assertArrayEquals(new int[] {2, 5}, array1.middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
		assertArrayEquals(new int[] {7, 8}, array1.middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0}));
		assertArrayEquals(new int[] {2, 4}, array1.middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5}));
	}
	
	@Test
	public void makeEndsTest() {
		assertArrayEquals(new int[] {1, 3}, array1.makeEnds(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {1, 4}, array1.makeEnds(new int[] {1, 2, 3, 4}));
		assertArrayEquals(new int[] {7, 2}, array1.makeEnds(new int[] {7, 4, 6, 2}));
	}
	
	@Test
	public void has23Test() {
		assertTrue(array1.has23(new int[] {2, 5}));
		assertTrue(array1.has23(new int[] {4, 3}));
		assertFalse(array1.has23(new int[] {4, 5}));
	}
	
	@Test
	public void no23Test() {
		assertTrue(array1.no23(new int[] {4, 5}));
		assertFalse(array1.no23(new int[] {4, 2}));
		assertFalse(array1.no23(new int[] {3, 5}));		
	}
	
	@Test
	public void makeLastTest() {
		assertArrayEquals(new int[] {0, 0, 0, 0, 0, 6}, array1.makeLast(new int[] {4, 5, 6}));
		assertArrayEquals(new int[] {0, 0, 0, 2}, array1.makeLast(new int[] {1, 2}));
		assertArrayEquals(new int[] {0, 3}, array1.makeLast(new int[] {3}));
	}
	
	@Test
	public void double23Test() {
		assertTrue(array1.double23(new int[] {2, 2}));
		assertTrue(array1.double23(new int[] {3, 3}));
		assertFalse(array1.double23(new int[] {2, 3}));
	}
	
	@Test
	public void fix23Test() {
		assertArrayEquals(new int[] {1, 2, 0}, array1.fix23(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {2, 0, 5}, array1.fix23(new int[] {2, 3, 5}));
		assertArrayEquals(new int[] {1, 2, 1}, array1.fix23(new int[] {1, 2, 1}));
	}
	
	@Test
	public void start1Test() {
		assertEquals(2, array1.start1(new int[] {1, 2, 3}, new int[] {1, 3}));
		assertEquals(1, array1.start1(new int[] {7, 2, 3}, new int[] {1}));
		assertEquals(1, array1.start1(new int[] {1, 2}, new int[] {}));		
	}
	
	@Test
	public void bigger2Test() {
		assertArrayEquals(new int[] {3, 4}, array1.bigger2(new int[] {1, 2}, new int[] {3, 4}));
		assertArrayEquals(new int[] {3, 4}, array1.bigger2(new int[] {3, 4}, new int[] {1, 2}));
		assertArrayEquals(new int[] {1, 2}, array1.bigger2(new int[] {1, 1}, new int[] {1, 2}));
	}
	
	@Test
	public void makeMiddleTest() {
		assertArrayEquals(new int[] {2, 3}, array1.makeMiddle(new int[] {1, 2, 3, 4}));
		assertArrayEquals(new int[] {2, 3}, array1.makeMiddle(new int[] {7, 1, 2, 3, 4, 9}));
		assertArrayEquals(new int[] {1, 2}, array1.makeMiddle(new int[] {1, 2}));
	}
	
	@Test
	public void plusTwoTest() {
		assertArrayEquals(new int[] {1, 2, 3, 4}, array1.plusTwo(new int[] {1, 2}, new int[] {3, 4}));
		assertArrayEquals(new int[] {4, 4, 2, 2}, array1.plusTwo(new int[] {4, 4}, new int[] {2, 2}));
		assertArrayEquals(new int[] {9, 2, 3, 4}, array1.plusTwo(new int[] {9, 2}, new int[] {3, 4}));
	}
	
	@Test
	public void swapEndsTest() {
		assertArrayEquals(new int[] {4, 2, 3, 1}, array1.swapEnds(new int[] {1, 2, 3, 4}));
		assertArrayEquals(new int[] {3, 2, 1}, array1.swapEnds(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {5, 6, 7, 9, 8}, array1.swapEnds(new int[] {8, 6, 7, 9, 5}));
	}
	
	@Test
	public void midThreeTest() {
		assertArrayEquals(new int[] {2, 3, 4}, array1.midThree(new int[] {1, 2, 3, 4, 5}));
		assertArrayEquals(new int[] {7, 5, 3}, array1.midThree(new int[] {8, 6, 7, 5, 3, 0, 9}));
		assertArrayEquals(new int[] {1, 2, 3}, array1.midThree(new int[] {1, 2, 3}));
	}
	
	@Test
	public void maxTripleTest() {
		assertEquals(3, array1.maxTriple(new int[] {1, 2, 3}));
		assertEquals(5, array1.maxTriple(new int[] {1, 5, 3}));
		assertEquals(5, array1.maxTriple(new int[] {5, 2, 3}));
		assertEquals(5, array1.maxTriple(new int[] {5, 7, 2, 9, 3}));
	}
	
	@Test
	public void frontPieceTest() {
		assertArrayEquals(new int[] {1, 2}, array1.frontPiece(new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {1, 2}, array1.frontPiece(new int[] {1, 2}));
		assertArrayEquals(new int[] {1}, array1.frontPiece(new int[] {1}));
		assertArrayEquals(new int[] {}, array1.frontPiece(new int[] {}));
	}
	
	@Test
	public void unlucky1Test() {
		assertTrue(array1.unlucky1(new int[] {1, 3, 4, 5}));
		assertTrue(array1.unlucky1(new int[] {2, 1, 3, 4, 5}));
		assertFalse(array1.unlucky1(new int[] {1, 1, 1}));
	}
	
	@Test
	public void make2Test() {
		assertArrayEquals(new int[] {4, 5}, array1.make2(new int[] {4, 5}, new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {4, 1}, array1.make2(new int[] {4}, new int[] {1, 2, 3}));
		assertArrayEquals(new int[] {1, 2}, array1.make2(new int[] {}, new int[] {1, 2}));
	}
	
	@Test
	public void front11Test() {
		assertArrayEquals(new int[] {1, 7}, array1.front11(new int[] {1, 2, 3}, new int[] {7, 9, 8}));
		assertArrayEquals(new int[] {1, 2}, array1.front11(new int[] {1}, new int[] {2}));
		assertArrayEquals(new int[] {1}, array1.front11(new int[] {1, 7}, new int[] {}));
		assertArrayEquals(new int[] {}, array1.front11(new int[] {}, new int[] {}));
		assertArrayEquals(new int[] {2}, array1.front11(new int[] {}, new int[] {2, 8}));
	}
}
