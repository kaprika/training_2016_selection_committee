package by.training.lysiuk.project.datamodel;

import java.util.Date;
import java.util.List;

public class Faculty extends AbstractModel {

	private String name;
	private Integer plan;
	private Date endDateSet;
	private List<Subject> subject;

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlan() {
		return plan;
	}

	public void setPlan(Integer plan) {
		this.plan = plan;
	}

	public Date getEndDateSet() {
		return endDateSet;
	}

	public void setEndDateSet(Date endDateSet) {
		this.endDateSet = endDateSet;
	}

}
