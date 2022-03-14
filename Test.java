package com.tut.HibernateAnnotation;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	private static SessionFactory sf;

	public static void main(String[] args) {

		sf = HibUtil.getInstance();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

//		Answers ans = new Answers();
//		// ans.setAns_id(11);
//		ans.setAnswers("alex");
//
//		Answers ans1 = new Answers();
//		// ans1.setAns_id(12);
//		ans1.setAnswers("sam");
//
//		Answers ans3 = new Answers();
//		// ans3.setAns_id(13);
//		ans3.setAnswers("ram");
//
//		Answers ans4 = new Answers();
//		// ans.setAns_id(11);
//		ans4.setAnswers("pune");
//
//		Answers ans5 = new Answers();
//		// ans1.setAns_id(12);
//		ans5.setAnswers("satara");
//
//		Answers ans6 = new Answers();
//		// ans3.setAns_id(13);
//		ans6.setAnswers("batu");
//
//		Set<Answers> set = new HashSet();
//		set.add(ans);
//		set.add(ans1);
//		set.add(ans3);
//
//		Set<Answers> set1 = new HashSet();
//		set1.add(ans4);
//		set1.add(ans5);
//
//		Set<Answers> set2 = new HashSet();
//		set2.add(ans6);
//
//		Question que = new Question();
//		// que.setQue_id(1);
//		que.setQuestion("Good name?");
//		que.setAnswers(set);
//
//		Question que2 = new Question();
//		// que.setQue_id(1);
//		que2.setQuestion("city name?");
//		que2.setAnswers(set1);
//
//		Question que3 = new Question();
//		// que.setQue_id(1);
//		que3.setQuestion("clg name?");
//		que3.setAnswers(set2);
//
//
//		ses.save(ans);
//		Integer question1 = (Integer) ses.save(que);
//		ses.save(ans1);
//		ses.save(que2);
//		ses.save(ans6);
//		ses.save(que3);
//		ses.save(ans3);
//		ses.save(ans4);
//		ses.save(ans5);
//
//		tx.commit();

		Question q1 = (Question) ses.get(Question.class, 1);
		System.out.println(q1.getQue_id());
		System.out.println(q1.getQuestion());
		
		

		ses.close();
		
		Session ses1=sf.openSession();
		Question q2 = (Question) ses1.get(Question.class, 2);
		System.out.println(q2.getQue_id());
		System.out.println(q2.getQuestion());
		ses1.close();
		
		
		System.out.println("done");

	}

}
