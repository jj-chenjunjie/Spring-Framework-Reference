package core.mix;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import core.mix.validation.Person;
import core.mix.validation.PersonValidator;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core/mix/application.xml");
		
		/*Foo foo = context.getBean(Foo.class);
		foo.doAnything();
		foo.doSomething();*/
		
		Person person = new Person();
//		person.setName("aa");
		DataBinder binder = new DataBinder(person);
		binder.setValidator(new PersonValidator());
		binder.validate();
		BindingResult result = binder.getBindingResult();
		List<ObjectError> errors = result.getAllErrors();
		for (ObjectError objectError : errors) {
			System.out.println(objectError.getObjectName() + " : " + objectError.getCode());
		}
	}
}
