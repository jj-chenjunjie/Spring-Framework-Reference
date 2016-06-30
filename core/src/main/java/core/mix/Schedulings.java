package core.mix;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedulings {
	
	public void execute(String... msg) {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + msg[0] + ": " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	@Scheduled(fixedRate=3000)
	public void doSomething() {
		execute("some");
	}
	
	@Scheduled(fixedRate=3000)
	public void doAnything() {
		execute("any");
	}
	
	@Scheduled(fixedRate=3000)
	public void schedule1() {
		execute("schedule1");
	}
	
	@Scheduled(fixedRate=3000)
	public void schedule2() {
		execute("schedule2");
	}
	
	@Scheduled(fixedRate=3000)
	public void schedule3() {
		execute("schedule3");
	}
	
	@Scheduled(fixedRate=3000)
	public void schedule4() {
		execute("schedule4");
	}
	
	@Scheduled(fixedRate=3000)
	public void schedule5() {
		execute("schedule5");
	}
}
