package core.mix;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Async;

public class Foo {
	
	@Resource
	private Bar bar;
	
	@Resource
	private Baz baz;
	
	public Foo() {
		System.out.println("Foo.Foo()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am foo";
	}
	
	
	public void doSomething() {
		System.out.println("Foo.doSomething()");
		System.out.println(Thread.currentThread().getName());
	}
	
	@Async
	public void doAnything() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Foo.doAnything()");
		System.out.println(Thread.currentThread().getName());
	}
}
