package com.brenodiogo;
/** 
====================================== 
TestGen 2.1 for JUnit 4.13.0 		
Test Case: PlateNumber::licensePlate 
Timestamp: 11/4/2020 3:58:29 PM 
-------------------------------------- 
® DARKKO 2020 © 
====================================== 

**/ 

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class PlateNumberTest { 
	
	@Test
	public void test01() { 
		assertEquals("5F3Z-2E9W", PlateNumber.licensePlate("5F3Z-2e-9-w", 4));
	}

	@Test
	public void test02() { 
		assertEquals("2-5G-3J", PlateNumber.licensePlate("2-5g-3-J", 2));
	}

	@Test
	public void test03() { 
		assertEquals("24-A0R-74K", PlateNumber.licensePlate("2-4A0r7-4k", 3));
	}

	@Test
	public void test04() { 
		assertEquals("GB-BD-51-9K-FC", PlateNumber.licensePlate("GB-bd519-KFC", 2));
	}

	@Test
	public void test05() { 
		assertEquals("BF-11G-F9I-781-9IT", PlateNumber.licensePlate("BF-11gf9i-7819iT", 3));
	}

	@Test
	public void test06() { 
		assertEquals("FIN-MMG-418", PlateNumber.licensePlate("Fin-Mmg-418", 3));
	}

	@Test
	public void test07() { 
		assertEquals("S-PXO-755", PlateNumber.licensePlate("sPx-o755", 3));
	}

	@Test
	public void test08() { 
		assertEquals("DE-57-UK", PlateNumber.licensePlate("de57-uk", 2));
	}

	@Test
	public void test09() { 
		assertEquals("D-KAPA-7778", PlateNumber.licensePlate("d-kapa-7778", 4));
	}

	@Test
	public void test10() { 
		assertEquals("NL-J20-6FV", PlateNumber.licensePlate("nlj-206-fv", 3));
	}

}
// end of tests