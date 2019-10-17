/**
 * 
 */
package com.lrneezy.questionmanager.jdbc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lrneezy.questionmanager.model.QuestionInfo;

/**
 * @author SRIPADA MISHRA
 *
 */
@Repository
public class JdbcQuestionInfoRepository implements QuestionInfoRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int count() {
		
		return jdbcTemplate
                .queryForObject("select count(*) from question_details", Integer.class);
	}

	@Override
	public int add(QuestionInfo question) {
		
		return jdbcTemplate.update(
                "insert into question_details(grade_id,subject_id,question_desc,question_image,answer_option1," + 
                "answer_option2,answer_option3,answer_option4,answer_correct,answer_explaination,answer_text_link,answer_video_link)"
                + " values(?,?,?,?,?,?,?,?,?,?,?,?)",
                question.getGrade_id(), question.getSubject_id(),question.getQuestion_desc(),question.getQuestion_image(),question.getAnswer_option1(),
                question.getAnswer_option2(),question.getAnswer_option3(),question.getAnswer_option4(),question.getAnswer_correct(),
                question.getAnswer_explaination(),question.getAnswer_text_link(),question.getAnswer_video_link());
	}

	@Override
	public int update(QuestionInfo question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<QuestionInfo> findAll() {
		
		return jdbcTemplate.query(
                "select * from question_details",
                (rs, rowNum) ->
                        new QuestionInfo(
                                rs.getInt("question_id"),
                                rs.getInt("grade_id"),
                                rs.getInt("subject_id"), 
                                rs.getString("question_desc"), 
                                rs.getInt("question_skill_level"), 
                                rs.getString("question_image"), 
                                rs.getString("answer_option1"), 
                                rs.getString("answer_option2"), 
                                rs.getString("answer_option3"), 
                                rs.getString("answer_option4"), 
                                rs.getInt("answer_correct"), 
                                rs.getString("answer_explaination"), 
                                rs.getString("answer_text_link"), 
                                rs.getString("answer_video_link")
                        )
        );
	}

	@Override
	public List<QuestionInfo> findBySubjectAndGrade(int subject_id, int grade_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<QuestionInfo> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
