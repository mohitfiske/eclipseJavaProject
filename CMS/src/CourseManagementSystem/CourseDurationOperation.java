package CourseManagementSystem;

public class CourseDurationOperation extends CourseOperation {
	int duration;
	
	public float getData(Courses[] course) {
		int size = course.length;
		
		for(Courses d : course) {
			duration = duration + d.getCourseDuration();
		}
		
		float avgDuration = duration/size;
		return avgDuration;
	}

}
