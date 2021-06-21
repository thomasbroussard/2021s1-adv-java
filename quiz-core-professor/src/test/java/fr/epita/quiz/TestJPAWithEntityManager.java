package fr.epita.quiz;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Question;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
@Commit
public class TestJPAWithEntityManager {

	
	@PersistenceContext
	EntityManager manager;
	
	
	@Test
	@Transactional
	public void testEM() {
		Question entity = new Question("test");
		manager.persist(entity);
	}
	
}
