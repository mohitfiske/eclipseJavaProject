package CourseManagementSystem;

public class Coursestore {
public static Courses[] Course = new Courses[6];

static {
	Courses c1 = new Courses();
	Courses c2 = new Courses(2,"Full Stack Developer",120,"Up Grade",5000.25f);
	Courses c3 = new Courses(3,"Backend",100,"Edurekha",954.54f);
	Courses c4 = new Courses(4,"Java Web Development",80,"Udemy",499.99f);
	Courses c5 = new Courses(5,"Oracle",120,"Sameer Dehadrai",11f);
	Courses c6 = new Courses(6,"SQL",80,"Sameer Dehadrai",2000f);

	Course[0] = c1;
	Course[1] = c2;
	Course[2] = c3;
	Course[3] = c4;
	Course[4] = c5;
	Course[5] = c6;
}

public static String[] getCourseTitle() {
	int size = Course.length;
	String []CourseTitle = new String[size];
	String t;
	int index = 0;
	for(Courses title : Course) {
		t = title.getCourseTitle();
		CourseTitle[index] = t;
		index++;
	}
	
	return CourseTitle;		
	}

public static boolean isAvailable(Courses c) {
	boolean result = false ;
	for(Courses search : Course) {
		Courses s = search;
	 	if(s.equals(c)) {
	 		
	 		result = true;
	 		break;
	 	}
	 	
	}
	return result;
}

public static float getAvgDuration(String providerName) {
	float cost = 0.0f;
	int count = 0;
	for(Courses provider : Course) {
		String s = provider.getCourseProvider();
		System.out.println("Provider = "+ s);
		if(s.equals(providerName)) {
			cost = cost + provider.getCourseCost();
			count++;
		}
	
	}
	float avg = cost/count;
	return avg;
}


public static Courses[] getCourse() {
	return Course;
}

public static void setCourse(Courses[] course) {
	Course = course;
}


}
