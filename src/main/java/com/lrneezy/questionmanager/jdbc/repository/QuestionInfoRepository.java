/**
 * 
 */
package com.lrneezy.questionmanager.jdbc.repository;

import java.util.List;
import java.util.Optional;

import com.lrneezy.questionmanager.model.QuestionInfo;

/**
 * @author SRIPADA MISHRA
 *
 */
public interface QuestionInfoRepository {

	int count();

    int add(QuestionInfo question);

    int update(QuestionInfo question);

    int deleteById(Long id);

    List<QuestionInfo> findAll();

    List<QuestionInfo> findBySubjectAndGrade(int subject_id, int grade_id);

    Optional<QuestionInfo> findById(Long id);
}
