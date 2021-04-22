package fr.epita.quiz.services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import fr.epita.quiz.datamodel.Question;

public class QuestionJPADAO {
	
	@Inject
	SessionFactory sf;
	
	
	public void create(Question question) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		tx.commit();
	}
	
	public void update(Question question) {
		sf.openSession().update(question);
	}
	public void delete(Question question) {
		sf.openSession().update(question);
	}
	
	public List<Question> search(Question question) {
		Query<Question> query = sf.openSession().createQuery("from Question");
		List<Question> list = query.list();
		return list;
	}
	
	

}
