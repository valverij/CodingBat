package valverij.codingbat.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import valverij.codingbat.String1;

public class String1Test {
	
	String1 string1;
	
	@Before
	public void setUp() {
		string1 = new String1();
	}

	@Test
	public void helloNameTest() {
		assertEquals("Hello Bob!", string1.helloName("Bob"));
		assertEquals("Hello Alice!", string1.helloName("Alice")); 
		assertEquals("Hello X!", string1.helloName("X"));
	} 

	@Test
	public void makeAbbaTest() {
		assertEquals("HiByeByeHi", string1.makeAbba("Hi", "Bye"));
		assertEquals("YoAliceAliceYo", string1.makeAbba("Yo", "Alice")); 
		assertEquals("WhatUpUpWhat", string1.makeAbba("What", "Up"));
	}
	
	@Test
	public void makeTagsTest() {
		assertEquals("<i>Yay</i>", string1.makeTags("i", "Yay"));
		assertEquals("<i>Hello</i>", string1.makeTags("i", "Hello")); 
		assertEquals("<cite>Yay</cite>", string1.makeTags("cite", "Yay"));
	}//makeOutWord
	
	@Test
	public void makeOutWordTest() {
		assertEquals("<<Yay>>", string1.makeOutWord("<<>>", "Yay"));
		assertEquals("<<WooHoo>>", string1.makeOutWord("<<>>", "WooHoo")); 
		assertEquals("[[word]]", string1.makeOutWord("[[]]", "word"));
	}
	
	@Test
	public void extraEndTest() {
		assertEquals("lololo", string1.extraEnd("Hello"));
		assertEquals("ababab", string1.extraEnd("ab")); 
		assertEquals("HiHiHi", string1.extraEnd("Hi"));
	}
	
	@Test
	public void firstTwoTest() {
		assertEquals("He", string1.firstTwo("Hello"));
		assertEquals("ab", string1.firstTwo("abcdefg")); 
		assertEquals("ab", string1.firstTwo("ab"));
		assertEquals("a", string1.firstTwo("a"));
		assertEquals("", string1.firstTwo(""));
	}
	
	@Test
	public void firstHalfTest() {
		assertEquals("Woo", string1.firstHalf("WooHoo"));
		assertEquals("Hello", string1.firstHalf("HelloThere")); 
		assertEquals("abc", string1.firstHalf("abcdef"));
		assertEquals("a", string1.firstHalf("abc"));		
	}
	
	@Test
	public void withoutEndTest() {
		assertEquals("ell", string1.withoutEnd("Hello"));
		assertEquals("av", string1.withoutEnd("java")); 
		assertEquals("odin", string1.withoutEnd("coding"));				
	}
	
	@Test
	public void comboStringTest() {
		assertEquals("hiHellohi", string1.comboString("Hello", "hi"));
		assertEquals("hiHellohi", string1.comboString("hi", "Hello")); 
		assertEquals("baaab", string1.comboString("aaa", "b"));
		assertEquals("a", string1.comboString("a", ""));
		assertEquals("", string1.comboString("", ""));
	}
	
	@Test
	public void nonStartTest() {
		assertEquals("ellohere", string1.nonStart("Hello", "There"));
		assertEquals("avaode", string1.nonStart("java", "code")); 
		assertEquals("hotlava", string1.nonStart("shotl", "java"));
	}
	
	@Test
	public void left2Test() {
		assertEquals("lloHe", string1.left2("Hello"));
		assertEquals("vaja", string1.left2("java")); 
		assertEquals("Hi", string1.left2("Hi"));				
	}
	
	@Test
	public void right2Test() {
		assertEquals("loHel", string1.right2("Hello"));
		assertEquals("vaja", string1.right2("java")); 
		assertEquals("Hi", string1.right2("Hi"));				
	}
	
	@Test
	public void theEndTest() {
		assertEquals("H", string1.theEnd("Hello", true));
		assertEquals("o", string1.theEnd("Hello", false)); 
		assertEquals("o", string1.theEnd("oh", true));				
	}
	
	@Test
	public void withoutEnd2Test() {
		assertEquals("ell", string1.withoutEnd2("Hello"));
		assertEquals("b", string1.withoutEnd2("abc")); 
		assertEquals("", string1.withoutEnd2("ab"));
		assertEquals("", string1.withoutEnd2(""));
	}
	
	@Test
	public void middleTwoTest() {
		assertEquals("ri", string1.middleTwo("String"));
		assertEquals("od", string1.middleTwo("code")); 
		assertEquals("ct", string1.middleTwo("practice"));		
	}
	
	@Test
	public void endsLyTest() {
		assertTrue(string1.endsLy("oddly"));
		assertFalse(string1.endsLy("y"));
		assertFalse(string1.endsLy("oddy"));
	}
	
	@Test
	public void nTwiceTest() {
		assertEquals("Helo", string1.nTwice("Hello", 2));
		assertEquals("Choate", string1.nTwice("Chocolate", 3)); 
		assertEquals("Ce", string1.nTwice("Chocolate", 1));				
	}
	
	@Test
	public void twoCharTest() {
		assertEquals("ja", string1.twoChar("java", 0));
		assertEquals("va", string1.twoChar("java", 2)); 
		assertEquals("ja", string1.twoChar("java", 3));	
		assertEquals("ja", string1.twoChar("java", -1));		
	}
	
	@Test
	public void middleThreeTest() {
		assertEquals("and", string1.middleThree("Candy"));
		assertEquals("and", string1.middleThree("and")); 
		assertEquals("lvi", string1.middleThree("solving"));		
	}
	
	@Test
	public void hasBadTest() {
		assertTrue(string1.hasBad("badxx"));
		assertTrue(string1.hasBad("xbadxx"));
		assertFalse(string1.hasBad("xxbadxx"));
		assertFalse(string1.hasBad(""));
	}
	
	@Test
	public void atFirstTest() {
		assertEquals("he", string1.atFirst("hello"));
		assertEquals("hi", string1.atFirst("hi")); 
		assertEquals("h@", string1.atFirst("h"));
		assertEquals("@@", string1.atFirst(""));
	}
	
	@Test
	public void lastCharsTest() {
		assertEquals("ls", string1.lastChars("last", "chars"));
		assertEquals("ya", string1.lastChars("yo", "java")); 
		assertEquals("h@", string1.lastChars("hi", ""));
	}
	
	@Test
	public void conCatTest() {
		assertEquals("dogcat", string1.conCat("dog", "cat"));
		assertEquals("abcat", string1.conCat("abc", "cat")); 
		assertEquals("abc", string1.conCat("abc", ""));
	}
	
	@Test
	public void lastTwoTest() {
		assertEquals("codign", string1.lastTwo("coding"));
		assertEquals("cta", string1.lastTwo("cat")); 
		assertEquals("ba", string1.lastTwo("ab"));		
	}
	
	@Test
	public void seeColorTest() {
		assertEquals("red", string1.seeColor("redxx"));
		assertEquals("", string1.seeColor("xxred")); 
		assertEquals("blue", string1.seeColor("blueTimes"));		
	}
	
	@Test
	public void frontAgainTest() {
		assertTrue(string1.frontAgain("edited"));
		assertFalse(string1.frontAgain("edit"));
		assertTrue(string1.frontAgain("ed"));
	}
	
	@Test
	public void minCatTest() {
		assertEquals("loHi", string1.minCat("Hello", "Hi"));
		assertEquals("ellojava", string1.minCat("Hello", "java")); 
		assertEquals("javaello", string1.minCat("java", "Hello"));
		assertEquals("", string1.minCat("", "Hello"));
	}
	
	@Test
	public void extraFrontTest() {
		assertEquals("HeHeHe", string1.extraFront("Hello"));
		assertEquals("ababab", string1.extraFront("ab")); 
		assertEquals("HHH", string1.extraFront("H"));
		assertEquals("", string1.extraFront(""));
	}
	
	@Test
	public void without2Test() {
		assertEquals("lloHe", string1.without2("HelloHe"));
		assertEquals("HelloHi", string1.without2("HelloHi")); 
		assertEquals("", string1.without2("Hi"));		
	}
	
	@Test
	public void deFrontTest() {
		assertEquals("llo", string1.deFront("Hello"));
		assertEquals("va", string1.deFront("java")); 
		assertEquals("aay", string1.deFront("away"));
		assertEquals("a", string1.deFront("a"));
		assertEquals("b", string1.deFront("xb"));
		assertEquals("", string1.deFront("b"));
		assertEquals("", string1.deFront(""));
	}
	
	@Test
	public void startWordTest() {
		assertEquals("hi", string1.startWord("hippo", "hi"));
		assertEquals("hip", string1.startWord("hippo", "xip")); 
		assertEquals("h", string1.startWord("hippo", "i"));	
		assertEquals("hip", string1.startWord("hip", "zip"));
	}
	
	@Test
	public void withoutXTest() {
		assertEquals("Hi", string1.withoutX("xHix"));
		assertEquals("Hi", string1.withoutX("xHi")); 
		assertEquals("Hxi", string1.withoutX("Hxix"));
		assertEquals("", string1.withoutX("x"));
		assertEquals("", string1.withoutX(""));
		assertEquals("x", string1.withoutX("xxx"));
	}
	
	@Test
	public void withoutX2Test() {		
		assertEquals("Hi", string1.withoutX2("xHi")); 
		assertEquals("Hi", string1.withoutX2("Hxi"));
		assertEquals("Hi", string1.withoutX2("Hi"));		
	}
}
