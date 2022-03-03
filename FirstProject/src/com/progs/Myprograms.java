package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MyProgramTest {

	@Test
	void testFindsum() {
		MyProgram prog =new MyProgram();
		int actual=prog.findsum(10,5);
		assertEquals(15,actual);
		
	}
	@Test
	void testfindsum() {
		MyProgram prog =new Myprogram();
		int actual=prog.findsum(-2,2);
		assertEquals(0,actual;)
	

}
