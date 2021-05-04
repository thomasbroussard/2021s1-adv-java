package fr.epita.quiz.services.data.impl.em;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.epita.quiz.datamodel.Choice;
import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IChoiceDAO;

public class ChoiceJPAEMDAO extends AbstractGenericDAO<Choice> implements IChoiceDAO {

	@Override
	public List<Choice> search(Choice choice) throws DataAccessException {

		TypedQuery<Choice> query = em.createQuery("from Choice", Choice.class);
		return query.getResultList();

	}

}
