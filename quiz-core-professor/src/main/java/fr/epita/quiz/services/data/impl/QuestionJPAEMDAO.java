package fr.epita.quiz.services.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@Transactional(value = Transactional.TxType.REQUIRED)
public class QuestionJPAEMDAO implements IQuestionDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Question> search(Question questionQBE) throws DataAccessException {
		TypedQuery<Question> query = em.createQuery("from Question", Question.class);
		return query.getResultList();
	}

	@Override
	public void update(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		em.merge(question);
		
	}

	@Override
	public void delete(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		em.remove(question);
	}

	@Override
	public void create(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		em.persist(question);
	}
	
	

}
