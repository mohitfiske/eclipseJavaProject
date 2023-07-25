package CourseManagementSystem;

public class CourseEnrollmentData {
	public static CourseEnrollment[] courseEnrollments = new CourseEnrollment[4];
	
	static {
		
		CourseEnrollment c1 = new CourseEnrollment(101,"Aman",6);
		CourseEnrollment c2 = new CourseEnrollment(101,"Aman",5);
		CourseEnrollment c3 = new CourseEnrollment(102,"Sudir",2);
		CourseEnrollment c4 = new CourseEnrollment(103,"Ullhas",3);
		courseEnrollments[0]=c1;
		courseEnrollments[1]=c2;
		courseEnrollments[2]=c3;
		courseEnrollments[3]=c4;
		System.out.println("Inside courseEnrollmentData");
	}

	public static CourseEnrollment[] getCourseEnrollments() {
		return courseEnrollments;
	}

	public static void setCourseEnrollments(CourseEnrollment[] courseEnrollments) {
		CourseEnrollmentData.courseEnrollments = courseEnrollments;
	}
	
	public static int getPosition(CourseEnrollment obj) throws NoDataFoundException{
		int position = -1;
		for(int index = 0; index < courseEnrollments.length; index++) {
			if(obj.equals(courseEnrollments[index])) {
				System.out.println("EnrollmentId = "+courseEnrollments[index].getEnrollmentId());
				position = index;
				break;
			}
		}
		if(position == -1) {
			String errInfo = "Data not Found";
			String name = obj.getEnrolledBy();
			NoDataFoundException nx = new NoDataFoundException(errInfo,name);
			throw nx;
		}
			
		
		return position;
		
	}
}
