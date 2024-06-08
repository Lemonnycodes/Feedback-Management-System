//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

//defines the interface for methods in StudentSurveyImpl.java file.
package com.StudentSurvey.service;

import java.util.List;

import com.StudentSurvey.exception.ResourceNotFoundException;
import com.StudentSurvey.model.Survey;
import com.StudentSurvey.repository.SurveyRepository;  

import org.springframework.stereotype.Service;

public interface SurveyService {
    List<Survey> getAllSurveys();
    Survey submitSurvey(Survey survey);
    Survey getSurveyById(String surveyNum) throws ResourceNotFoundException;
    Survey updateSurvey(Survey survey, String surveyNum) throws ResourceNotFoundException;
    void deleteSurvey(String surveyNum) throws ResourceNotFoundException;
}
