package CourseManagementSystem;

public class App {
	static {
		System.out.println("This is the static block of class app");
		
	}
	
	
	public static void main(String[] args) {
		
//		 Courses c1 = new Courses(1,"Java Web Development",80,"Udemy",499.99f);
//		 System.out.println("Course "+c1.getCourseTitle()); c1.display();
//
//		  
//		  
//		  System.out.println(); Courses c2 = new
//		  Courses(2,"Full Stack Developer",120,"Up Grade",5000.25f); c2.display();
		  
//		  
//		  System.out.println(); 
//		  Courses c3 = new Courses(3,"Backend",100,"Edurekha",954.54f);
//		  c3.display();
		  
//		  System.out.println();
//Courses c4 = new Courses(); 
//		c4.display();
		 
		
//		String[] title=Coursestore.getCourseTitle();
//		for(String t : title) {
//			System.out.println(t);
//		}
	
//		CourseOperation c1 = new CourseCostOperation();
//		CourseOperation d1 = new CourseDurationOperation();
//		
//		System.out.println("Course Cost Average = "+c1.getData(Coursestore.getCourse()));
//		System.out.println("Course Duration Average = "+d1.getData(Coursestore.getCourse()));
//		
//		System.out.println("Number of Objects:::"+ Courses.getObjCount());
		
		
				
			
	
//		Invalue call = new Invalue();
//		call.arrInsert();
//		call.displayarr(call.getArr());
//		Courses c = new Courses();
//		c = call.arr[1];
//		
		
//		System.out.println("Check Course is available");
//		boolean available = Coursestore.isAvailable(c4);
//		System.out.println("CourseStore is available "+available);
//		if(available == true) {
//			System.out.println("Course is Avaailable");
//		}
//		else {
//			System.out.println("Course is Not Available");
//		}
//
//		
//		System.out.println("Check for course provider");
//		float avg = Coursestore.getAvgDuration("Sameer Dehadrai");
//		System.out.println("Average = "+avg);
//		
		
		
		try {
			CourseEnrollment ce1 = new CourseEnrollment(101,"Aman",5);
			int position = CourseEnrollmentData.getPosition(ce1);
			System.out.println(ce1.getEnrolledBy()+" Found at position = "+position);		
		}
		catch(NoDataFoundException nx) {
			String message = nx.getMessage();
			System.out.println(message);
		}

	
	}
	
	


}
