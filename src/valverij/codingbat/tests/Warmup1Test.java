package valverij.codingbat.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import valverij.codingbat.Warmup1;

public class Warmup1Test {

	private Warmup1 warmup;
	
	@Before
	public void setUp() {
		warmup = new Warmup1();
	}
	
	@Test
	public void warmup1_sleepInTest() {
		assertTrue(warmup.sleepIn(false, false));
		assertFalse(warmup.sleepIn(true, false));
		assertTrue(warmup.sleepIn(false, true));		
	}
	
	@Test
	public void warmup1_monkeyTroubleTest() {
		assertTrue(warmup.monkeyTrouble(true, true));
		assertTrue(warmup.monkeyTrouble(false, false));
		assertFalse(warmup.monkeyTrouble(true, false));
	}
	
	@Test
	public void warmup1_sumDoubleTest() {
		assertEquals(3, warmup.sumDouble(1, 2));
		assertEquals(3, warmup.sumDouble(1, 2));
		assertEquals(3, warmup.sumDouble(1, 2));
	}
	
	@Test
	public void warmup1_diff21() {
		assertEquals(2, warmup.diff21(19));
		assertEquals(11, warmup.diff21(10));
		assertEquals(0, warmup.diff21(21));
		assertEquals(2, warmup.diff21(22));
	}
	
	@Test
	public void warmup1_parrotTroubleTest() {
		assertTrue(warmup.parrotTrouble(true, 6));
		assertFalse(warmup.parrotTrouble(true, 7));
		assertFalse(warmup.parrotTrouble(false, 6));
	}
	
	@Test
	public void warmup1_makes10Test() {
		assertTrue(warmup.makes10(9, 10));
		assertFalse(warmup.makes10(9, 9));
		assertTrue(warmup.makes10(1, 9));
	}
	
	@Test
	public void warmup1_nearHundredTest() {
		assertTrue(warmup.nearHundred(93));
		assertTrue(warmup.nearHundred(90));
		assertTrue(warmup.nearHundred(110));
		assertFalse(warmup.nearHundred(89));
		assertFalse(warmup.nearHundred(111));
		
		assertTrue(warmup.nearHundred(201));
		assertTrue(warmup.nearHundred(190));
		assertTrue(warmup.nearHundred(195));
		assertFalse(warmup.nearHundred(211));
		assertFalse(warmup.nearHundred(189));
	}

	@Test
	public void warmup1_posNegTest() {
		assertTrue(warmup.posNeg(1, -1, false));
		assertTrue(warmup.posNeg(-1, 1, false));
		assertTrue(warmup.posNeg(-4, -5, true));
		
		assertFalse(warmup.posNeg(-4, -5, false));
		assertFalse(warmup.posNeg(4, 5, true));		
	}

	@Test
	public void warmup1_notStringTest() {
		assertEquals("not candy", warmup.notString("candy"));		
		assertEquals("not x", warmup.notString("x"));
		assertEquals("not bad", warmup.notString("not bad"));		
	}
	
	@Test
	public void warmup1_missingCharTest() {
		assertEquals("ktten", warmup.missingChar("kitten", 1));		
		assertEquals("itten", warmup.missingChar("kitten", 0));
		assertEquals("kittn", warmup.missingChar("kitten", 4));
	}
	
	@Test
	public void warmup1_frontBackTest() {
		assertEquals("eodc", warmup.frontBack("code"));		
		assertEquals("a", warmup.frontBack("a"));
		assertEquals("ba", warmup.frontBack("ab"));
	}
	
	@Test
	public void warmup1_front3Test() {
		assertEquals("JavJavJav", warmup.front3("Java"));		
		assertEquals("ChoChoCho", warmup.front3("Chocolate"));
		assertEquals("abcabcabc", warmup.front3("abc"));
		assertEquals("aaa", warmup.front3("a"));
	}
	
	@Test
	public void warmup1_backAroundTest() {
		assertEquals("tcatt", warmup.backAround("cat"));		
		assertEquals("oHelloo", warmup.backAround("Hello"));
		assertEquals("aaa", warmup.backAround("a"));
	}
	
	@Test
	public void warmup1_or35Test() {
		assertTrue(warmup.or35(3));
		assertTrue(warmup.or35(10));
		assertFalse(warmup.or35(8));
	}
	
	@Test
	public void warmup1_front22Test() {
		assertEquals("kikittenki", warmup.front22("kitten"));		
		assertEquals("HaHaHa", warmup.front22("Ha"));
		assertEquals("ababcab", warmup.front22("abc"));
	}
	
	@Test
	public void warmup1_startHiTest() {
		assertTrue(warmup.startHi("hi there"));
		assertTrue(warmup.startHi("hi"));
		assertFalse(warmup.startHi("hello hi"));
	}
	
	@Test
	public void warmup1_icyHotTest() {
		assertTrue(warmup.icyHot(120, -1));
		assertTrue(warmup.icyHot(-1, 120));
		assertFalse(warmup.icyHot(2, 120));
	}
	
	@Test
	public void warmup1_in1020Test() {
		assertTrue(warmup.in1020(12, 99));
		assertTrue(warmup.in1020(21, 12));
		assertFalse(warmup.in1020(8, 99));
	}
	
	@Test
	public void warmup1_hasTeenTest() {
		assertTrue(warmup.hasTeen(13, 20, 10));
		assertTrue(warmup.hasTeen(20, 19, 10));
		assertTrue(warmup.hasTeen(20, 10, 13));
		assertFalse(warmup.hasTeen(20, 9, 30));
	}
	
	@Test
	public void warmup1_loneTeenTest() {
		assertTrue(warmup.loneTeen(13, 99));
		assertTrue(warmup.loneTeen(21, 19));
		assertFalse(warmup.loneTeen(13, 13));
		assertFalse(warmup.loneTeen(20, 20));
	}
	
	@Test
	public void warmup1_delDelTest() {
		assertEquals("abc", warmup.delDel("adelbc"));
		assertEquals("aHello", warmup.delDel("adelHello"));
		assertEquals("adedbc", warmup.delDel("adedbc"));
		assertEquals("delabcdela", warmup.delDel("delabcdela"));		
	}
	
	@Test
	public void warmup1_mixStartTest() {
		assertTrue(warmup.mixStart("mix snacks"));
		assertTrue(warmup.mixStart("pix snacks"));
		assertFalse(warmup.mixStart("piz snacks"));
	}
	
	@Test
	public void warmup1_startOzTest() {
		assertEquals("oz", warmup.startOz("ozymandias"));
		assertEquals("z", warmup.startOz("bzoo"));
		assertEquals("o", warmup.startOz("oxx"));
	}
	
	@Test
	public void warmup1_intMaxTest() {
		assertEquals(3, warmup.intMax(1, 2, 3));
		assertEquals(3, warmup.intMax(1, 3, 2));
		assertEquals(3, warmup.intMax(3, 2, 1));		
	}
	
	@Test
	public void warmup1_close10Test() {
		assertEquals(8, warmup.close10(8, 13));
		assertEquals(8, warmup.close10(13, 8));
		assertEquals(0, warmup.close10(13, 7));		
	}

	@Test
	public void warmup1_in3050Test() {
		assertTrue(warmup.in3050(30, 31));
		assertFalse(warmup.in3050(30, 41));
		assertTrue(warmup.in3050(40, 50));
	}
	
	@Test
	public void warmup1_max1020Test() {
		assertEquals(19, warmup.max1020(19, 11));
		assertEquals(19, warmup.max1020(11, 19));
		assertEquals(11, warmup.max1020(11, 9));
		assertEquals(0, warmup.max1020(21, 9));
	}
	
	@Test
	public void warmup1_stringETest() {
		assertTrue(warmup.stringE("Hello"));
		assertTrue(warmup.stringE("Heelle"));
		assertFalse(warmup.stringE("Heelele"));
	}
	
	@Test
	public void warmup1_lastDigitTest() {
		assertTrue(warmup.lastDigit(7, 17));
		assertFalse(warmup.lastDigit(6, 17));
		assertTrue(warmup.lastDigit(3, 113));
		assertTrue(warmup.lastDigit(-15, 5));		
	}
	
	@Test
	public void warmup1_endUpTest() {
		assertEquals("HeLLO", warmup.endUp("Hello"));		
		assertEquals("Hi thERE", warmup.endUp("Hi there"));
		assertEquals("HI", warmup.endUp("hi"));
	}

	@Test
	public void warmup1_everyNthTest() {
		assertEquals("Mrce", warmup.everyNth("Miracle", 2));
		assertEquals("aceg", warmup.everyNth("abcdefg", 2)); 
		assertEquals("adg", warmup.everyNth("abcdefg", 3));
	}
}
