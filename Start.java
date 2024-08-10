package start;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.studentDao;

import java.io.IOException;


public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Welcome in the world of Java");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
    while(true) {
    	System.out.println("PRESS  1 to ADD student");
    	System.out.println("PRESS  2 to DELETE student");
    	System.out.println("PRESS  3 to display student");
    	System.out.println("PRESS  4 to EXIT app");
    	int c = Integer.parseInt(br.readLine());
    	if(c==1) {
    		//add student..
    		
    		System.out.println("Enter user name:");
    		String name = br.readLine();
    		
    		System.out.println("Enter phone name:");
    		String phone = br.readLine();
    		
    		System.out.println("Enter city name:");
    		String city = br.readLine();
    		System.out.println(city);

    		
    		//create student object
    		Student st = new Student(name, phone, city);
    		
    		boolean answer= studentDao.insertStudentToDB(st);
    		if(answer) {
    			System.out.println("Student is added successfully");
    		}
    		else {
    			System.out.println("Something went wrong");
    		}
    		System.out.println(st);
    		
    	}
    	else if(c==2) {
    		//delete student
    		
    		System.out.println("entr student id to delete:");
    		int userId = Integer.parseInt(br.readLine());
    		System.out.println("userId"+userId);
    		boolean f =studentDao.deleteStudent(userId);
    		System.out.println("deleted"+f);
    		if(f) {
    			System.out.println("Deleted..");
    		}
    		else {
    			System.out.println("Something went wrong...");
    		}
    	}
    	else if(c==3) {
    		//display
    		studentDao.showAllStudent();
    	}
    	else if(c==4) {
    		//exit application
    		System.out.println("Thank you for using our app....");
    		System.out.println("See you soon .... bye bye");
    	}
    	else {
    		// wrong option opt
    		System.out.println("You entered wrong option");
    		break;
    		
    	}
    }
    }
    catch(IOException e) {
    	System.out.println("Error!!");
    }
	}

}
