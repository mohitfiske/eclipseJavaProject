package New_CMS;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in); 
		ArrayList<Courses> courseData = new ArrayList<>();
		
		String sourcepath = "./src/New_CMS/CourseSerializedData";
		String destination = "./src/New_CMS/CouresDesirializedData";
		
		while(true){
			Courses c = new Courses();
			System.out.println("Enter your choice \n1. Create New Course\n2. Store Courses\n3. Show All Courses\n4. Exit");
			choice = sc.nextInt();
			if(choice == 4) {
				break;
			}
			else if(choice == 1) {
				System.out.println("Enter CourseID");
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
				courseData.add(c);
				System.out.println("New Courses Created successfully");
			}
			else if(choice == 2 ) {
				for(Object obj : courseData) {
				System.out.println(obj.toString());
				}
				try (
					FileOutputStream fout = new FileOutputStream(sourcepath);
					ObjectOutputStream oout = new ObjectOutputStream(fout);
					){
					for(Object obj1 : courseData) {
						oout.writeObject(obj1);
					}
					System.out.println("Object Serialized successfully");
					
				}
				catch(Exception ex){
					ex.printStackTrace();
					
				}
				
			}
			else if(choice == 3) {
				try(
						FileInputStream fin = new FileInputStream(sourcepath);
						ObjectInputStream oin = new ObjectInputStream(fin);
						OutputStream fileOut = new FileOutputStream(destination,true);
					){
					for(Object obj : courseData) {
						obj = oin.readObject();
						System.out.println("Deserialized object is : "+ obj);
						byte dataBytes[] = obj.toString().getBytes();
						fileOut.write(dataBytes);
						System.out.println("Data has been written successfully");
					}
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
				
				System.out.println("Deserialized successfull");
			}
			
			
		}
		
	}

}
