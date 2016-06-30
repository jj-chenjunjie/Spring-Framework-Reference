package core.mix.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
		
		Person person = (Person) target;
		if (person.getAge() < 0) {
			errors.rejectValue("age", "negativeage");
		}else if (person.getAge() > 120) {
			errors.rejectValue("age", "too.darn.old");
		}
	}

}
