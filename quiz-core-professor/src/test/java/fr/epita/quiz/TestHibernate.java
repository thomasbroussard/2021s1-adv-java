package fr.epita.quiz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
public class TestHibernate {

	@Inject
	IQuestionDAO dao;

	@Inject
	@Named("dataSource")
	DataSource ds;

	@Test
	public void test() throws DataAccessException, SQLException {
		Question question = new Question("ABC");

		dao.create(question);

		PreparedStatement prepareStatement = ds.getConnection()
				.prepareStatement("SELECT * FROM QUESTIONS WHERE TITLE=?");
		prepareStatement.setString(1, question.getSubject());
		ResultSet rs = prepareStatement.executeQuery();
		rs.next();
		String string = rs.getString("TITLE");

		Assert.assertEquals("ABC", question.getSubject());
	}

}
