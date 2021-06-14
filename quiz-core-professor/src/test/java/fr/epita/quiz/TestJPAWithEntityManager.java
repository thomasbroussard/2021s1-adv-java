package fr.epita.quiz;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.epita.quiz.datamodel.Question;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
@TransactionC
public class TestJPAWithEntityManager {

	
	@PersistenceContext
	EntityManager manager;
	
	
	@Test
	@Transactional(propagation = Propagation.REQUIRED)
	public void testEM() {
		Question entity = new Question("test");
		manager.persist(entity);
		manager.flush();
		manager.getTransaction().commit();
		//manager.getTransaction().commit();
		//manager.remove(entity);
	}
	
	
	
}
