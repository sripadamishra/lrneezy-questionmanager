package com.lrneezy.questionmanager.model;

public class QuestionInfo {
	int question_id;
	/**
	 * @return the question_id
	 */
	public int getQuestion_id() {
		return question_id;
	}
	/**
	 * @param question_id the question_id to set
	 */
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	/**
	 * @return the grade_id
	 */
	public int getGrade_id() {
		return grade_id;
	}
	/**
	 * @param grade_id the grade_id to set
	 */
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	/**
	 * @return the subject_id
	 */
	public int getSubject_id() {
		return subject_id;
	}
	/**
	 * @param subject_id the subject_id to set
	 */
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	/**
	 * @return the question_desc
	 */
	public String getQuestion_desc() {
		return question_desc;
	}
	/**
	 * @param question_desc the question_desc to set
	 */
	public void setQuestion_desc(String question_desc) {
		this.question_desc = question_desc;
	}
	/**
	 * @return the question_skill_level
	 */
	public int getQuestion_skill_level() {
		return question_skill_level;
	}
	/**
	 * @param question_skill_level the question_skill_level to set
	 */
	public void setQuestion_skill_level(int question_skill_level) {
		this.question_skill_level = question_skill_level;
	}
	/**
	 * @return the question_image
	 */
	public String getQuestion_image() {
		return question_image;
	}
	/**
	 * @param question_image the question_image to set
	 */
	public void setQuestion_image(String question_image) {
		this.question_image = question_image;
	}
	/**
	 * @return the answer_option1
	 */
	public String getAnswer_option1() {
		return answer_option1;
	}
	/**
	 * @param answer_option1 the answer_option1 to set
	 */
	public void setAnswer_option1(String answer_option1) {
		this.answer_option1 = answer_option1;
	}
	/**
	 * @return the answer_option2
	 */
	public String getAnswer_option2() {
		return answer_option2;
	}
	/**
	 * @param answer_option2 the answer_option2 to set
	 */
	public void setAnswer_option2(String answer_option2) {
		this.answer_option2 = answer_option2;
	}
	/**
	 * @return the answer_option3
	 */
	public String getAnswer_option3() {
		return answer_option3;
	}
	/**
	 * @param answer_option3 the answer_option3 to set
	 */
	public void setAnswer_option3(String answer_option3) {
		this.answer_option3 = answer_option3;
	}
	/**
	 * @return the answer_option4
	 */
	public String getAnswer_option4() {
		return answer_option4;
	}
	/**
	 * @param answer_option4 the answer_option4 to set
	 */
	public void setAnswer_option4(String answer_option4) {
		this.answer_option4 = answer_option4;
	}
	/**
	 * @return the answer_correct
	 */
	public int getAnswer_correct() {
		return answer_correct;
	}
	/**
	 * @param answer_correct the answer_correct to set
	 */
	public void setAnswer_correct(int answer_correct) {
		this.answer_correct = answer_correct;
	}
	/**
	 * @return the answer_explaination
	 */
	public String getAnswer_explaination() {
		return answer_explaination;
	}
	/**
	 * @param answer_explaination the answer_explaination to set
	 */
	public void setAnswer_explaination(String answer_explaination) {
		this.answer_explaination = answer_explaination;
	}
	/**
	 * @return the answer_text_link
	 */
	public String getAnswer_text_link() {
		return answer_text_link;
	}
	/**
	 * @param answer_text_link the answer_text_link to set
	 */
	public void setAnswer_text_link(String answer_text_link) {
		this.answer_text_link = answer_text_link;
	}
	/**
	 * @return the answer_video_link
	 */
	public String getAnswer_video_link() {
		return answer_video_link;
	}
	/**
	 * @param answer_video_link the answer_video_link to set
	 */
	public void setAnswer_video_link(String answer_video_link) {
		this.answer_video_link = answer_video_link;
	}
	
	public QuestionInfo() {
		super();
	}
	
	public QuestionInfo(int question_id,int grade_id,int  subject_id,String question_desc,int question_skill_level,	
	String question_image,String answer_option1,String answer_option2, 
	String answer_option3,String answer_option4,int answer_correct,String answer_explaination,
	String answer_text_link,String answer_video_link) {
		
		this.question_id = question_id;
		this.grade_id = grade_id;
		this.subject_id = subject_id;
		this.question_desc = question_desc;
		this.question_skill_level = question_skill_level;
		this.question_image = question_image;
		this.answer_option1 = answer_option1;
		this.answer_option2 = answer_option2;
		this.answer_option3 = answer_option3;
		this.answer_option4 = answer_option4;
		this.answer_correct = answer_correct;
		this.answer_explaination = answer_explaination;
		this.answer_text_link = answer_text_link;
		this.answer_video_link = answer_video_link;
	}
	
	int grade_id;
	int  subject_id;   
	String question_desc;
	int question_skill_level;	
	String question_image;  
	String answer_option1;  
	String answer_option2; 
	String answer_option3;     
	String answer_option4;
	int answer_correct;
	String answer_explaination;
	String answer_text_link;
	String answer_video_link;
}
