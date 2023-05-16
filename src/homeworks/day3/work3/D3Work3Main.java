package homeworks.day3.work3;

import homeworks.day3.work3.business.CategoryManager;
import homeworks.day3.work3.business.CourseManager;
import homeworks.day3.work3.business.InstructorManager;

import java.util.ArrayList;
import homeworks.day3.work3.core.logging.DatabaseLogger;
import homeworks.day3.work3.core.logging.EmailLogger;
import homeworks.day3.work3.core.logging.Logger;
import homeworks.day3.work3.dataAccess.HibernateDao;
import homeworks.day3.work3.dataAccess.JdbcDao;
import homeworks.day3.work3.entities.Category;
import homeworks.day3.work3.entities.Course;
import homeworks.day3.work3.entities.Instructor;

public class D3Work3Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new EmailLogger(), new DatabaseLogger() };
		ArrayList<Course> courses = new ArrayList<>();
		ArrayList<Category> categorys = new ArrayList<>();
		ArrayList<Instructor> instructors = new ArrayList<>();

		CourseManager courseManager = new CourseManager(loggers,  new HibernateDao(),courses);

		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Java");
		course1.setPrice(50);

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("Oracle");
		course2.setPrice(50);

		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.listCourse();

		// CATEGORY

		CategoryManager catManager = new CategoryManager(loggers, new JdbcDao(), categorys);

		Category cat1 = new Category();
		cat1.setCategoryId(1);
		cat1.setCategoryName("Yazılım");
		
		Category cat2 = new Category();
		cat2.setCategoryId(2);
		cat2.setCategoryName("Donanım");

		catManager.addCategory(cat1);
		catManager.addCategory(cat2);
		catManager.listCategory();

		// INSTRUCTOR
		
		InstructorManager insManager = new InstructorManager(loggers, new HibernateDao(), instructors);
		
		Instructor ins= new Instructor();
		ins.setInstId(1);
		ins.setFirstName("Engin");
		ins.setLastName("Demirog");
		
		insManager.addInstructor(ins);
		insManager.listInstructor();
		
		

	}

}
