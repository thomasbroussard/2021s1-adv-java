package fr.epita.quiz;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.services.QuestionDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSpring {
	
	
	@Inject
	@Named("firstQuery")
	String query;
	
	
	@Inject
	QuestionDAO dao;
	
	@Test
	public void firstTest() {
		Assert.assertTrue(query != null);
		System.out.println(query);
		Assert.assertNotNull(dao.getUrl());
	}

}
