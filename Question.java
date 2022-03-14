package com.tut.HibernateAnnotation;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="QUESTION")
@Cacheable
@Cache (usage = CacheConcurrencyStrategy.READ_ONLY)
public class Question
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int que_id;
	@Column(name = "question")
	private String question;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Answers> answers;
	public Question(int que_id, String question, Set<Answers> answers) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.answers = answers;
	}
	public Question() {
		super();
	}
	public int getQue_id() {
		return que_id;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answers> answers) {
		this.answers = answers;
	}
	

}
