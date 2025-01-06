package in.aakash.binding;

import java.util.Arrays;

public class Student {

	private Integer studentId; 
	private String studentName;
	private String studentEmail;
	private String gender;
	private String course;
	private String[] timings;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", gender=" + gender + ", course=" + course + ", timings=" + Arrays.toString(timings) + "]";
	}
	
	
	
}
