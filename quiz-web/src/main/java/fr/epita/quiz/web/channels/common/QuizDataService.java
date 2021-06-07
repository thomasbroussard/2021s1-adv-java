package fr.epita.quiz.web.channels.common;

import java.util.List;

import javax.inject.Inject;

import fr.epita.quiz.datamodel.Choice;
import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IChoiceDAO;
import fr.epita.quiz.services.data.api.IQuestionDAO;
import fr.epita.quiz.web.messages.QuestionMessage;

public class QuizDataService {

	@Inject
	IQuestionDAO questionDAO;

	@Inject
	IChoiceDAO choiceDAO;

	public List<QuestionMessage> findQuestions(String questionTitle) {

		Question criterion = new Question("");
		criterion.setId(Integer.valueOf(id));
		List<Question> search = questionDAO.search(criterion);

		for (Question question : search) {
			QuestionMessage message = new QuestionMessage();
			List<Choice> choices = choiceDAO.search(new Choice());
			message.setTitle(question.getSubject());
		}

	}

	public QuestionMessage getById(int id) {
		try {
			Question criterion = new Question("");
			criterion.setId(Integer.valueOf(id));
			Question fetchedQuestion = questionDAO.search(criterion).get(0);
			QuestionMessage message = new QuestionMessage();
			List<Choice> choices = choiceDAO.search(new Choice());
			message.setTitle(fetchedQuestion.getSubject());

			return message;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
