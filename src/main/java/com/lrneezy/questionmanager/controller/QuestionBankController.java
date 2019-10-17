/**
 * 
 */
package com.lrneezy.questionmanager.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lrneezy.questionmanager.model.QuestionInfo;

/**
 * @author SRIPADA MISHRA
 *
 */
@RestController
public class QuestionBankController {

	@PostMapping(path="question/save", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QuestionInfo> saveQuestion(@RequestBody String strQuestiondtls){
		ObjectMapper objmapper = new ObjectMapper();
		QuestionInfo questiondtlReceived = null;
		if(!strQuestiondtls.isEmpty()) {
			try {
				questiondtlReceived = objmapper.readValue(strQuestiondtls, QuestionInfo.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//QuestionInfo qInfo = new QuestionInfo();
		//qInfo.setQuestion_id(1);
		questiondtlReceived.setQuestion_id(1);
		return new ResponseEntity<QuestionInfo>(questiondtlReceived,HttpStatus.OK);
	}
}
