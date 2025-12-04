package org.matsim.run;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Run1pctKelheimScenarioKNTest{

	@Test
	public void testMain() {

		String [] args = { "input/v3.1/kelheim-v3.1-config.xml",
			"--config:controller.lastIteration", "1"
		};
		Run1pctKelheimScenario.main( args );

	}

}
