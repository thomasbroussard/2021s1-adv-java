package fr.epita.quiz.services.data.impl.em;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@Transactional(value = Transactional.TxType.REQUIRED)
public class QuestionJPAEMDAO extends AbstractGenericDAO<Question> implements IQuestionDAO {

	
	@Override
	public List<Question> search(Question questionQBE) throws DataAccessException {
		TypedQuery<Question> query = em.createQuery("from Question", Question.class);
		return query.getResultList();
	}

}
