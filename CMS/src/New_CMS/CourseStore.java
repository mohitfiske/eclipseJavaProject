package New_CMS;

import java.util.Scanner;

import New_CMS.Courses;

public class CourseStore {
	public Courses[] course = new Courses[3];
	
	public void arrInsert() {
		
			
			Scanner sc = new Scanner(System.in);	
		int num = 0;
		int end = 1;
		for(int index = 0 ; index < end; index++) {
			Courses c = new Courses();
			System.out.println("Enter Course_ID of the course");
			c.setCourseId(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter Course Title ");
			c.setCourseTitle(sc.nextLine());
			
			System.out.println("Enter Course Duration");
			c.setCourseDuration(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Course Provider");
			c.setCourseProvider(sc.nextLine());
			
			System.out.println("Enter course Cost");
			c.setCourseCost(sc.nextFloat());
			
			System.out.println(index);
			course[index] = c;
			System.out.println("CourseId="+c.getCourseId());
			System.out.println("CourseTitle = "+c.getCourseTitle());
			System.out.println("CourseCost = "+c.getCourseCost());
			
			
			System.out.println("Enter 1 to insert and 2 to stop inserting");
			num = sc.nextInt();
			if(num == 1) {
				end++;
			}
			else {
			break;
//				System.out.println(c);
			}
				
		}
	sc.close();	
	}
	
	public void displayarr(Courses[] arr) {
		for(Courses a : arr) {
//			System.out.println("CourseId = "+a.getCourseId());
//			System.out.println("CourseTitle = "+a.getCourseTitle());
//			System.out.println("CourseDuration = "+a.getCourseDuration());
//			System.out.println("Course Provider ="+a.getCourseProvider());
//			System.out.println("CourseCost ="+a.getCourseCost());
//			System.out.println();
//			
			System.out.println(a.toString());
		}
	}

	public Courses[] getCourse() {
		return course;
	}

	public void setCourse(Courses[] course) {
		this.course = course;
	}
	
	
}
