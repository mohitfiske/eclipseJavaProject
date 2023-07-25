package New_CMS;

import java.util.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;




public class DefaultImplementationOfSortingTODO implements CourseDataSorter {
//	Accepts a collection of Course types and returns a sorted collection using
//	default algorithm.
//	By default we sort it by name
	@Override
	public Collection<Courses> sortCourses(Collection<Courses> courseData) {
		SortedSet<Courses> sortedData = new TreeSet<>();
		for(Courses obj1 : courseData) {
			sortedData.add(obj1);
		}
		
		
		return sortedData;
	}
	public static void main(String[] args) {
		Courses c1 = new Courses(1,"SQL",91,"SameerSir",11);
		Courses c2 = new Courses(2,"Java",100,"RahulSir",51);
		Courses c3 = new Courses(3,"SnowFlake",200,"Google",80000);
		Courses c4 = new Courses(4,"Python",100,"Udemy",499.99f);
		Set<Courses> course = new HashSet<>();
		course.add(c1);
		course.add(c2);
		course.add(c3);
		course.add(c4);
		
		
		DefaultImplementationOfSortingTODO obj1 = new DefaultImplementationOfSortingTODO();
		Collection<Courses> result = obj1.sortCourses(course);
		for(Courses obj2 : result) {
			System.out.println(obj2.toString());
		}
	}
	

	

}
