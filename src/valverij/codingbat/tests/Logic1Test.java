package valverij.codingbat.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import valverij.codingbat.Logic1;

public class Logic1Test {

	Logic1 logic1;
	
	@Before
	public void setUp() {
		logic1 = new Logic1();
	}

	@Test
	public void cigarPartyTest() {		
		assertFalse(logic1.cigarParty(30, false));
		assertTrue(logic1.cigarParty(50, false));
		assertTrue(logic1.cigarParty(70, true));		
	}
	
	@Test
	public void dateFashionTest() {		
		assertEquals(2, logic1.dateFashion(5, 10));
		assertEquals(0, logic1.dateFashion(5, 2));
		assertEquals(1, logic1.dateFashion(5, 5));	
		assertEquals(0, logic1.dateFashion(10, 2));	
	}
	
	@Test
	public void squirrelPlayTest() {		
		assertTrue(logic1.squirrelPlay(70, false));
		assertFalse(logic1.squirrelPlay(95, false));
		assertTrue(logic1.squirrelPlay(95, true));		
	}
	
	@Test
	public void caughtSpeedingTest() {		
		assertEquals(0, logic1.caughtSpeeding(60, false));
		assertEquals(1, logic1.caughtSpeeding(65, false));
		assertEquals(0, logic1.caughtSpeeding(65, true));
		
	}

}
