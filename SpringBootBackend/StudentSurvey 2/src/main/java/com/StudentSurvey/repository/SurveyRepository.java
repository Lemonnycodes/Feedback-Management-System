//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)
//Defines the interface for the repository that stores all of the survey data.
package com.StudentSurvey.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.StudentSurvey.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, String> {

	
	

}
