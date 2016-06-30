package core.mix;

import org.springframework.stereotype.Component;

@Component
public class Baz {
	public Baz() {
		System.out.println("Baz.Baz()");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am baz";
	}
	
	
}
