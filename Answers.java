package com.tut.HibernateAnnotation;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="ANSWERS")
public class Answers
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ans_id;
	@Column(name = "answers")
	private  String answers;
	@ManyToOne
	private Question question;
	public Answers(int ans_id, String answers, Question question) {
		super();
		this.ans_id = ans_id;
		this.answers = answers;
		this.question = question;
	}
	public Answers() {
		super();
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	

}
