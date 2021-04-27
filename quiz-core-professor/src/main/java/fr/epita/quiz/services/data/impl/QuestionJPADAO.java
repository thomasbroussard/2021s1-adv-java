package fr.epita.quiz.services.data.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@Transactional(value=TxType.REQUIRED)
public class QuestionJPADAO implements IQuestionDAO{
	
	@Inject
	SessionFactory sf;
	
	public void create(Question question) {
		Session session = sf.openSession();
	
		session.save(question);

	}
	
	public void update(Question question) {
		sf.openSession().update(question);
	}
	
	public void delete(Question question) {
		sf.openSession().delete(question);
	}
	
	public List<Question> search(Question question) {
		Query<Question> query = sf.openSession().createQuery("from Question");
		List<Question> list = query.list();
		return list;
	}
	
	

}
