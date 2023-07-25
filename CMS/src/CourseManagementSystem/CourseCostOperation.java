package CourseManagementSystem;

public class CourseCostOperation extends CourseOperation {
	private float cost;
	
	public float getData(Courses[] course) {
		int size = course.length;
		
		for(Courses c : course) {
			cost = cost + c.getCourseCost();
		}
		float avgCost = cost/size;
		return avgCost; 		
	}

}
