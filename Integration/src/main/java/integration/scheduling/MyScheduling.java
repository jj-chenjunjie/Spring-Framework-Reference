package integration.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class MyScheduling {
	
	@Scheduled(fixedRate=3000)
	public void schedule() {
		System.out.println("MyScheduling.schedule()");
	}
	
}
