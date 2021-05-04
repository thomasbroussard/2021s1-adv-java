package fr.epita.quiz.services.data.impl.em;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.test.context.jdbc.SqlConfig.TransactionMode;

import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IDAO;

abstract class AbstractGenericDAO<T> implements IDAO<T> {

	
	@PersistenceContext
	EntityManager em;
		
	

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void update(T entity) throws DataAccessException {
		em.merge(entity);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void delete(T entity) throws DataAccessException {
		em.remove(entity);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void create(T entity) throws DataAccessException {
		em.persist(entity);
	}
}
