package fr.epita.quiz.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Choice;
import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IChoiceDAO;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
public class TestEntities {
	
	private static final Logger LOGGER = LogManager.getLogger(TestEntities.class);

	@Inject
	IQuestionDAO questionDAO;

	@Inject
	IChoiceDAO choiceDAO;

	@Inject
	DataSource ds;

	@Test
	@Transactional
	public void test() throws Exception {

		prepare();
		PreparedStatement prepareStatement = ds.getConnection().prepareStatement("SELECT ID FROM CHOICES");
		ResultSet rs = prepareStatement.executeQuery();

		while (rs.next()) {
			System.out.println("test");
			System.out.println(rs.getInt(1));
		}

	}

	private void prepare() {
		try {
			Question question = new Question("test");
			questionDAO.create(question);
			Choice choice1 = new Choice();
			choice1.setLabel("test label");
			choice1.setQuestion(question);
			choiceDAO.create(choice1);
			LOGGER.info("try to record");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
