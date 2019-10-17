/**
 * 
 */
package com.lrneezy.questionmanager.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lrneezy.questionmanager.jdbc.repository.JdbcQuestionInfoRepository;
import com.lrneezy.questionmanager.model.QuestionInfo;

/**
 * @author SRIPADA MISHRA
 *
 */
@RestController
public class QuestionBankController {

	@Autowired
	JdbcQuestionInfoRepository questionInfoRepo;
	
	@PostMapping(path="question/save", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QuestionInfo> saveQuestion(@RequestBody String strQuestiondtls){
		ObjectMapper objmapper = new ObjectMapper();
		QuestionInfo questiondtlReceived = null;
		if(!strQuestiondtls.isEmpty()) {
			try {
				questiondtlReceived = objmapper.readValue(strQuestiondtls, QuestionInfo.class);
				questionInfoRepo.add(questiondtlReceived);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}						
		return new ResponseEntity<QuestionInfo>(questiondtlReceived,HttpStatus.OK);
	}
	
	@GetMapping(path="question/getall",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<QuestionInfo>> getAllQuestions(){
		List<QuestionInfo> lstQuestionInfo= questionInfoRepo.findAll();
		return new ResponseEntity<List<QuestionInfo>>(lstQuestionInfo,HttpStatus.OK);
	}
}
