package integration.scheduling;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Foo{
	
	public Foo() throws InterruptedException {
		// TODO Auto-generated constructor stub
		init();
	}
	
	@Async
	public void hello() {
		System.out.println("Foo.hello()");
	}
	
	@Async
	public void howAreYou() {
		System.out.println("Foo.howAreYou()");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("how are you");
	}
	
	void init() throws InterruptedException{
		System.out.println("Foo.Foo()");
		Thread.sleep(2000);
		System.out.println("hello foo");
	}
	
}
