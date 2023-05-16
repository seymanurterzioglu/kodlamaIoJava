package homeworks.day3.work3.business;

import java.util.ArrayList;

import homeworks.day3.work3.core.logging.Logger;
import homeworks.day3.work3.dataAccess.BaseDao;
import homeworks.day3.work3.entities.Course;

public class CourseManager {

	private Logger[] loggers;
	private BaseDao baseDao;
	ArrayList<Course> courses;

	public CourseManager(Logger[] loggers, BaseDao baseDao, ArrayList<Course> courses) {

		this.loggers = loggers;
		this.baseDao = baseDao;
		this.courses = courses;
	}

	public void addCourse(Course course) throws Exception {

		for (Course item : courses) {
			if (item.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}

		for (Course item : courses) {
			if (item.getPrice() < 0) {
				throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
			}
		}

		courses.add(course);

		// gelen dao ya yazılma işlemi tamamlandı
		baseDao.write();

		// çoklu loglama
		for (Logger logger : loggers) {
			logger.log();
		}

	}

	public void listCourse() {
		for (Course item : courses) {
			System.out.println(item.getCourseName());
		}
	}

}
