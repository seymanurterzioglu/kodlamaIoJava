package homeworks.day3.work3.business;

import java.util.ArrayList;

import homeworks.day3.work3.core.logging.Logger;
import homeworks.day3.work3.dataAccess.BaseDao;
import homeworks.day3.work3.entities.Category;

public class CategoryManager {

	private Logger[] loggers;
	private BaseDao baseDao;
	ArrayList<Category> categorys;

	public CategoryManager(Logger[] loggers, BaseDao baseDao, ArrayList<Category> categorys) {
		this.loggers = loggers;
		this.baseDao = baseDao;
		this.categorys = categorys;
	}

	public void addCategory(Category category) throws Exception {

		for (Category item : categorys) {
			if(item.getCategoryName()== category.getCategoryName())
			{
				throw new Exception("Kategori ismi tekrar edemez");
			}

		}
		
		categorys.add(category);
		
		baseDao.write();
		
		for(Logger logger:loggers) {
			logger.log();
		}

	}

	public void listCategory() {
		for (Category item : categorys) {
			System.out.println(item.getCategoryName());
		}
	}

}
