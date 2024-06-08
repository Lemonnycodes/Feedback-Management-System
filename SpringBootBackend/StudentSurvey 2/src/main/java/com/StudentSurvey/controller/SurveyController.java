//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)
// The survey controller is responsible for the CRUD (Create, Read, Update, Delete) operations.
package com.StudentSurvey.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.StudentSurvey.exception.ResourceNotFoundException;
import com.StudentSurvey.model.Survey;
import com.StudentSurvey.service.SurveyService;

@CrossOrigin(origins="http://localhost:4200")
@RestController 
public class SurveyController {
	private final SurveyService surveyService;
	
	public SurveyController(SurveyService surveyService){
		super();
		this.surveyService = surveyService;
	}
	
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
	
	@PostMapping("/submitSurvey")
	public ResponseEntity<Survey> submitSurvey(@RequestBody Survey survey){
	
		return new ResponseEntity<Survey>(surveyService.submitSurvey(survey), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllSurvey")
	public List<Survey> getAllSurveys()
	{
		return surveyService.getAllSurveys();
	}

	@GetMapping("get/{surveyNum}")
	public ResponseEntity<Survey> getSurveyById(@PathVariable("surveyNum") String surveyNum) throws ResourceNotFoundException{
		return new ResponseEntity<Survey>(surveyService.getSurveyById(surveyNum), HttpStatus.OK);
	}

	@PutMapping("put/{surveyNum}")
	public ResponseEntity<Survey> updateSurvey(@RequestBody Survey survey, @PathVariable("surveyNum") String surveyNum) throws ResourceNotFoundException{
		return new ResponseEntity<Survey>(surveyService.updateSurvey(survey, surveyNum), HttpStatus.OK);
	}

	@DeleteMapping("del/{surveyNum}")
	public ResponseEntity<String> deleteSurvey(@PathVariable("surveyNum") String surveyNum) throws ResourceNotFoundException{
		surveyService.deleteSurvey(surveyNum);

		return new ResponseEntity<String>("Survey submission deleted successfully", HttpStatus.OK);
	}

	
	
}
