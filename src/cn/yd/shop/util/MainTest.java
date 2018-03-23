package cn.yd.shop.util;

import java.sql.SQLException;
import java.util.Date;

import cn.yd.shop.dao.BaseDaoImpl;
import cn.yd.shop.dao.ProductDaoImpl;
import cn.yd.shop.model.Product;


// 测试代码：父类的引用,可以指向子类对象.
public class MainTest {
	
	public static void main(String[] args) {
		
		// 父类的引用指向子类的对象
		Object o = new Date();
		System.out.println(o);
		// 但是子类的引用不可以指向父类对象
//		Date date = new Object();
//		BaseDaoImpl<Product> daoImpl = new ProductDaoImpl();
//		try {
////			daoImpl.getRow(null);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
