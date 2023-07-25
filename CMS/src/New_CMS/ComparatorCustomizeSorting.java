package New_CMS;


import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;;

public class ComparatorCustomizeSorting implements Comparator<Courses>,CourseDataSorter{

	

	@Override
	public int compare(Courses o1, Courses o2) {
		// TODO Auto-generated method stub
		String fname = o1.getCourseProvider();
		String sname = o2.getCourseProvider();
		int comparison = fname.compareTo(sname);
		
		return comparison;
	}

	@Override
	public Collection<Courses> sortCourses(Collection<Courses> courseData) {
		// TODO Auto-generated method stub
		
		Comparator<Courses> comp1 = new ComparatorCustomizeSorting();
		SortedSet<Courses> allCourses = new TreeSet<>(comp1);
		for(Courses data : courseData) {
			allCourses.add(data);
		}
		return allCourses;
		
	}

}
