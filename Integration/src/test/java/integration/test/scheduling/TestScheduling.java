package integration.test.scheduling;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.ContextConfiguration;

import integration.scheduling.Foo;
import integration.test.AppTest;

@ComponentScan("integration.scheduling")
@EnableScheduling
@EnableAsync
@ContextConfiguration(classes=TestScheduling.class)
@Configuration
public class TestScheduling extends AppTest{
	
	@Autowired
	private Foo foo;
	
	@Test
	public void test() throws Exception {
		foo.howAreYou();
		foo.hello();
		while (true) {
			
			
		}
	}
	
}
