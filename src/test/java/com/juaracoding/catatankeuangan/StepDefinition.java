package com.juaracoding.catatankeuangan;

import org.testng.annotations.Test;

public class StepDefinition extends BaseTestClass {
	
	@Test
	public void testAddcatatankeuangan() {
		logger = reports.startTest("AplikasiKeuangan");
		dashboard.addNewTransaction();
				
	}

}
