package org.hrms.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SAP_EMP_ID")
	private long id;
	
	@Column(name = "EMP_FNAME")
	private String firstName;

	@Column(name = "EMP_LNAME")
	private String lastName;
	
	@Column(name = "EMP_EMAILID")
	private String emailId;
	
	@Column(name = "EMP_NUM")
	private String 	empNumber;
	
	@Column(name = "LOGIN_ID")
	private String loginId;
	
	@Column(name = "LOC_CODE")
	private String locCode;
	
	@Column(name = "EMP_JOIN_DATE")
	private String joinDate;
	
	@Column(name = "REPORT_MANAGER")
	private String reportManager;
	
	@Column(name = "COC_CODE")
	private String COC_CODE;
	
	@Column(name = "GENDER_NAME")
	private String gender;
	
	@Column(name = "EMP_DESG")
	private String designation;
	
	@Column(name = "GRADE_ID")
	private String gradeId;
	
	@Column(name = "EMP_APPROVE")
	private String empApprove;
	
	@Column(name = "EMP_DEPT")
	private String dept;
	
	public Employee() {
		
	}

	public Employee(String joinDate, String firstName, String empNumber, String dept, String gender, String lastName,
			String designation, String emailId, String locCode, String gradeId, String loginId, long id,
			String cOC_CODE, String empApprove, String reportManager) {
		super();
		this.joinDate = joinDate;
		this.firstName = firstName;
		this.empNumber = empNumber;
		this.dept = dept;
		this.gender = gender;
		this.lastName = lastName;
		this.designation = designation;
		this.emailId = emailId;
		this.locCode = locCode;
		this.gradeId = gradeId;
		this.loginId = loginId;
		this.id = id;
		COC_CODE = cOC_CODE;
		this.empApprove = empApprove;
		this.reportManager = reportManager;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getReportManager() {
		return reportManager;
	}

	public void setReportManager(String reportManager) {
		this.reportManager = reportManager;
	}

	public String getCOC_CODE() {
		return COC_CODE;
	}

	public void setCOC_CODE(String cOC_CODE) {
		COC_CODE = cOC_CODE;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	public String getEmpApprove() {
		return empApprove;
	}

	public void setEmpApprove(String empApprove) {
		this.empApprove = empApprove;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
