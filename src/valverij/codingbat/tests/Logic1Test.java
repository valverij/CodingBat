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
	
	@Test
	public void sortaSumTest() {
		assertEquals(7, logic1.sortaSum(3, 4));
		assertEquals(20, logic1.sortaSum(9, 4));
		assertEquals(21, logic1.sortaSum(10, 11));		
	}
	
	@Test
	public void alarmClockTest() {		
		assertEquals("7:00", logic1.alarmClock(1, false));
		assertEquals("7:00", logic1.alarmClock(5, false));
		assertEquals("10:00", logic1.alarmClock(0, false));
		assertEquals("off", logic1.alarmClock(6, true));
		assertEquals("10:00", logic1.alarmClock(2, true));
	}

	@Test
	public void love6Test() {		
		assertTrue(logic1.love6(6, 4));
		assertFalse(logic1.love6(4, 5));
		assertTrue(logic1.love6(1, 5));		
	}
	
	@Test
	public void specialElevenTest() {		
		assertTrue(logic1.specialEleven(22));
		assertTrue(logic1.specialEleven(23));
		assertFalse(logic1.specialEleven(24));		
	}
	
	
}
