package gov.texas.trs.intgr.timer.service.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.batriver.intgr.timer.service.app.TimerServiceApp;

@CamelSpringBootTest
@SpringBootTest(classes = TimerServiceApp.class)
class TimerServiceRouteTests {

	
	@Test
	public void helloGetEndpoint_Success() {
	   // TODO: create a real test.
	   String s = "\"Hello World!\"";
	   assertEquals("\"Hello World!\"", s, "Messages are not equal.");
	}

}
