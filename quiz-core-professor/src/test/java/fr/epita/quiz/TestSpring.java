package fr.epita.quiz;

import org.junit.Assert;

import fr.epita.quiz.services.data.impl.QuestionDAO;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("/applicationContext.xml")
//FIXME check if this test is still relevant or create the corresponding beans (query and dao) in application context
public class TestSpring {
	

	//@Inject
	//@Named("firstQuery")
	String query;
	
	
	//@Inject
	QuestionDAO dao;
	
	//@Test TODO adjust configuration
	//FIXME
	//XXX what to do here?!
	public void firstTest() {
		Assert.assertTrue(query != null);
		System.out.println(query);
	
	}

}
