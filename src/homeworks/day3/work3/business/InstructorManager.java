package homeworks.day3.work3.business;

import java.util.ArrayList;

import homeworks.day3.work3.core.logging.Logger;
import homeworks.day3.work3.dataAccess.BaseDao;
import homeworks.day3.work3.entities.Instructor;

public class InstructorManager {
	
	private Logger[] loggers;
	private BaseDao baseDao;
	ArrayList<Instructor> instructors;
	
	public InstructorManager(Logger[] loggers, BaseDao baseDao, ArrayList<Instructor> instructors) {
		this.loggers = loggers;
		this.baseDao = baseDao;
		this.instructors = instructors;
	}
	
	public void addInstructor(Instructor instructor)throws Exception{
		
		instructors.add(instructor);
		
		baseDao.write();
		
		for(Logger logger:loggers) {
			logger.log();
		}
		
	}
	
	public void listInstructor(){
		for(Instructor inst:instructors) {
			System.out.println(inst.getFirstName()+" "+inst.getLastName());
		}
		
	}
	

}
