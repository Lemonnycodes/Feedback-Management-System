//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)

//defines the CRUD operation methods that is used in the SurveyController.java file.

package com.StudentSurvey.service.impl;
import com.StudentSurvey.exception.ResourceNotFoundException;
import com.StudentSurvey.service.SurveyService;
import com.StudentSurvey.repository.SurveyRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.StudentSurvey.model.Survey;
@Service
public class StudentSurveyImpl implements SurveyService{

	public SurveyRepository surveyRepository;
	
	public StudentSurveyImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository=surveyRepository;
	}
	
	@Override
	public Survey submitSurvey(Survey survey) {
		return surveyRepository.save(survey);
	}

	@Override
	public List<Survey> getAllSurveys() {
		return surveyRepository.findAll();
	}

	public Survey getSurveyById(String surveyNum) throws ResourceNotFoundException{
		return surveyRepository.findById(surveyNum).orElse(null);
	}

	@Override
	public Survey updateSurvey(Survey survey, String surveyNum) throws ResourceNotFoundException{
		Survey existingSurvey = surveyRepository.findById(surveyNum).orElseThrow(
			() -> new ResourceNotFoundException("Survey", "Id", surveyNum));

			existingSurvey.setFname(survey.getFname());
			existingSurvey.setLname(survey.getLname());
			existingSurvey.setStreet(survey.getStreet());
			existingSurvey.setCity(survey.getCity());
			existingSurvey.setZip(survey.getZip());
			existingSurvey.setTelephone(survey.getTelephone());
			existingSurvey.setEmail(survey.getEmail());
			existingSurvey.setDateofsurvey(survey.getDateofsurvey());
			existingSurvey.setDateofsurvey(survey.getDateofsurvey());
			existingSurvey.setAtmos(survey.getAtmos());
			existingSurvey.setCampus(survey.isCampus());
			existingSurvey.setDorm(survey.getDorm());
			existingSurvey.setLocationaddr(survey.isLocationaddr());
			existingSurvey.setSport(survey.getSport());
			existingSurvey.setStudents(survey.getStudents());
			existingSurvey.setRecommend(survey.getRecommend());
			existingSurvey.setComments(survey.getComments());


			surveyRepository.save(existingSurvey);
                               
			return existingSurvey;

	}

	@Override
	public void deleteSurvey(String surveyNum) throws ResourceNotFoundException{
		surveyRepository.findById(surveyNum).orElseThrow( () -> new ResourceNotFoundException("Student", "Id", surveyNum));

		surveyRepository.deleteById(surveyNum);
	}

	
	
}
