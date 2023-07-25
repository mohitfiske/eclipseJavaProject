package CourseManagementSystem;

public class CourseEnrollment {
	static {
		System.out.println("Inside CourseEnrollment");
	}
	
	private int enrollmentId;
	private String enrolledBy;
	private int courseId;
	
	public CourseEnrollment() {
		System.out.println("Constructor of CourseEnrollment");
	}

	public CourseEnrollment(int enrollmentId, String enrolledBy, int courseId) {
		super();
		this.enrollmentId = enrollmentId;
		this.enrolledBy = enrolledBy;
		this.courseId = courseId;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getEnrolledBy() {
		return enrolledBy;
	}

	public void setEnrolledBy(String enrolledBy) {
		this.enrolledBy = enrolledBy;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result + ((enrolledBy == null) ? 0 : enrolledBy.hashCode());
		result = prime * result + enrollmentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseEnrollment other = (CourseEnrollment) obj;
		if (courseId != other.courseId)
			return false;
		if (enrolledBy == null) {
			if (other.enrolledBy != null)
				return false;
		} else if (!enrolledBy.equals(other.enrolledBy))
			return false;
		if (enrollmentId != other.enrollmentId)
			return false;
		return true;
	}
	
	
}
