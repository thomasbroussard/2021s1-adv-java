package fr.epita.quiz.services.data.api;

import fr.epita.quiz.datamodel.Question;

/**
 * This dao is supposed to be injected through DI. It is an interface that
 * represents data management for the Question datamodel class
 * 
 * <pre>
 * <code>
 * &#64;Inject
 * IQuestionDAO dao = ...;
 * //...
 * dao.create(question);
 * </code>
 * </pre>
 * 
 * The modification methods can throw a {@link DataAccessException}
 * @author User
 *
 */
public interface IQuestionDAO extends IDAO<Question> {

}
