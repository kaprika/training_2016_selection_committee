package by.training.lysiuk.project.datamodel;

import java.util.Date;
import java.util.Map;

public class Enrolee extends AbstractModel {

	private UserCredentials userCredentials;
	private Faculty faculty;
	private Double certificate;
	private String firstName;
	private String lastName;
	private Date dateOfRegistration;
	private Map<Subject, Integer> points;

	public Map<Subject, Integer> getPoints() {
		return points;
	}

	public void setPoints(Map<Subject, Integer> points) {
		this.points = points;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Double getCertificate() {
		return certificate;
	}

	public void setCertificate(Double certificate) {
		this.certificate = certificate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

}
