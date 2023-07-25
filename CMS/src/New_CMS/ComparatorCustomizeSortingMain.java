package New_CMS;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorCustomizeSortingMain {

	public static void main(String[] args) {
		
//		Customized sorting by provider name
		Courses c1 = new Courses(1,"SQL",91,"SameerSir",11);
		Courses c2 = new Courses(2,"Java",100,"RahulSir",51);
		Courses c3 = new Courses(3,"SnowFlake",200,"Google",80000);
		Courses c4 = new Courses(4,"Python",100,"Udemy",499.99f);
		Set<Courses> course = new HashSet<>();
		course.add(c1);
		course.add(c2);
		course.add(c3);
		course.add(c4);
		
		ComparatorCustomizeSorting obj1 = new ComparatorCustomizeSorting();
		Collection<Courses> sortedData = obj1.sortCourses(course);
		for(Courses data : sortedData) {
			System.out.println(data.toString());
		}
				
	}

	

	
}
