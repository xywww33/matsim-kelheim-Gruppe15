package org.matsim.run;

import org.junit.jupiter.api.Test;

class Run1pctKelheimScenarioZhihangTest {
	@Test
	public void testMain() {

		String[] args = {"input/v3.1/kehlheim-v3.1-1pct.config.xml",
			"--config:controller.lastIteration","1"
		};
		RunKelheimScenario.main(args);
	}

}
