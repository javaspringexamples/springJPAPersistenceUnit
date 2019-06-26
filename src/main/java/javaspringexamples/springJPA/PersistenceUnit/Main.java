package javaspringexamples.springJPA.PersistenceUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);

		PersonDAO dao = (PersonDAO) applicationContext.getBean("personDao");
		// Creating person object
		Person person = new Person();
		person.setFirstName("Jabane");
		person.setLastName("KOLOBANE");
		// Saving person
		dao.save(person);
	}
}