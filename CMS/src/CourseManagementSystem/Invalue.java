package CourseManagementSystem;
import java.util.*;

public class Invalue {
public Courses[] arr;	
public void arrInsert() {
	Courses c = new Courses();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number courses you want to enter");
	int size = sc.nextInt();
arr = new Courses[3];
int j = 1;

int num = 0;

for(int i = 0; i<j ; i++) {
	System.out.println("Enter Course ID");
	c.setCourseId(sc.nextInt());
	sc.nextLine();
	System.out.println("Enter Course Title");
	c.setCourseTitle(sc.nextLine());
	
	System.out.println("Enter Course Duration");
	c.setCourseDuration(sc.nextInt());
	sc.nextLine();
	System.out.println("Enter Course Provider");
	c.setCourseProvider(sc.nextLine());
	
	System.out.println("Enter course Cost");
	c.setCourseCost(sc.nextFloat());
	
	arr[i] = c;

	System.out.println("Enter 1 for insert or any num for exit");
	num = sc.nextInt();
	if(num == 1) {
		j++;
	}
	else {
//		System.exit(0);//It will end your program
		break;
	}
  }

sc.close();
}

public void displayarr(Courses[] arr) {
	for(Courses a : arr) {
		System.out.println("CourseId = "+a.getCourseId());
		System.out.println("CourseTitle = "+a.getCourseTitle());
		System.out.println("CourseDuration = "+a.getCourseDuration());
		System.out.println("Course Provider ="+a.getCourseProvider());
		System.out.println("CourseCost ="+a.getCourseCost());
		System.out.println();
		
	}
}

public Courses[] getArr() {
	return arr;
}

public void setArr(Courses[] arr) {
	this.arr = arr;
}


	
}
