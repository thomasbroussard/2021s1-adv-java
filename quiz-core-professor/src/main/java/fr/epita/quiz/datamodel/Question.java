package fr.epita.quiz.datamodel;

public class Question {
	
	private String subject;
	private int id;
	private int difficulty;
	
	
	
	
	public Question(String subject) {
		super();
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Question [subject=" + subject + ", id=" + id + ", difficulty=" + difficulty + "]";
	}
	
	
	
	
	

}
