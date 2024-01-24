package sg.edu.nus.iss.cicddemo.datacontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sg.edu.nus.iss.cicddemo.controller.DataController;

@SpringBootTest
class DataControllerTest {
	@Autowired
	DataController dataController;

	@Test
	void testHealthCheck() {
		// Perform the health check and verify the result
		String result = dataController.healthCheck();
		assertEquals("HEALTH CHECK OK!", result);
	}

	@Test
	void version() {
		assertEquals("The actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationsLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}
}
