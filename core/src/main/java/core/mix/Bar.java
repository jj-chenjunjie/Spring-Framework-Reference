package core.mix;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	public Bar() {
		System.out.println("Bar.Bar()");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am bar";
	}
}
