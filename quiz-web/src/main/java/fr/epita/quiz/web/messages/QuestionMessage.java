package fr.epita.quiz.web.messages;

import java.util.List;

public class QuestionMessage {
	
    private	int id;
	
	private String title;
	
	private List<ChoiceMessage> choices;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ChoiceMessage> getChoices() {
		return choices;
	}

	public void setChoices(List<ChoiceMessage> choices) {
		this.choices = choices;
	}
	
}
