package CourseManagementSystem;

public class Courses {
	static {
		System.out.println("This is the static block of class Course");
	}
	
	 private int CourseId;
	 private String CourseTitle;
	 private int CourseDuration;
	 private String CourseProvider;
	 private float CourseCost;
	 private static int objCount;
	 
	 public Courses() {
		 this.CourseId = 1;
		 this.CourseTitle = "CDAC";
		 this.CourseDuration = 900;
		 this.CourseProvider = "Pune Board";
		 this.CourseCost = 106200;
		 objCount++;
		
	}
//	 public Courses(int CourseId,String CourseTitle){
//		 this.CourseId = CourseId;
//		 this.CourseTitle = CourseTitle;
//	 }

	 public Courses(int courseId, String courseTitle, int courseDuration, String courseProvider, float courseCost) {
		
		this.CourseId = courseId;
		this.CourseTitle = courseTitle;
		this.CourseDuration = courseDuration;
		this.CourseProvider = courseProvider;
		this.CourseCost = courseCost;
		objCount++;
	}

		 
//	 public String displayCourseDetail(){
//		 String detail = "Course Id ="+CourseId+","+"CourseTitle = "+CourseTitle+","+"\n"+"Course Duration ="+CourseDuration+","+"Course Provider="+CourseProvider+","+"Course Cost ="+CourseCost;
//		 return detail;
//	 }
	
	 
	 public void display() {
			System.out.println("CourseId ="+CourseId);
			System.out.println("CourseTitle ="+CourseTitle);
			System.out.println("CourseDuration ="+CourseDuration);
			System.out.println("CourseProvider ="+CourseProvider);
			System.out.println("CourseCost ="+CourseCost);
		}
	 
	public static int getObjCount() {
		return objCount;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getCourseTitle() {
		return CourseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		CourseTitle = courseTitle;
	}

	public int getCourseDuration() {
		return CourseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}

	public String getCourseProvider() {
		return CourseProvider;
	}

	public void setCourseProvider(String courseProvider) {
		CourseProvider = courseProvider;
	}

	public float getCourseCost() {
		return CourseCost;
	}

	public void setCourseCost(float courseCost) {
		CourseCost = courseCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(CourseCost);
		result = prime * result + CourseDuration;
		result = prime * result + CourseId;
		result = prime * result + ((CourseProvider == null) ? 0 : CourseProvider.hashCode());
		result = prime * result + ((CourseTitle == null) ? 0 : CourseTitle.hashCode());
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
		Courses other = (Courses) obj;
		if (Float.floatToIntBits(CourseCost) != Float.floatToIntBits(other.CourseCost))
			return false;
		if (CourseDuration != other.CourseDuration)
			return false;
		if (CourseId != other.CourseId)
			return false;
		if (CourseProvider == null) {
			if (other.CourseProvider != null)
				return false;
		} else if (!CourseProvider.equals(other.CourseProvider))
			return false;
		if (CourseTitle == null) {
			if (other.CourseTitle != null)
				return false;
		} else if (!CourseTitle.equals(other.CourseTitle))
			return false;
		return true;
	}

}
