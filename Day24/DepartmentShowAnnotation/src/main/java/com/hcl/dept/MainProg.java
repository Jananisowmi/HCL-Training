package com.hcl.dept;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class MainProg {
	public static void main(String[] args) {
		Configuration cfg= new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> lstDepartment=q.list();
		for (Department Department : lstDepartment) {
			System.out.println("Deptno" +Department.getDeptno());
			System.out.println("Name" +Department.getDname());
			System.out.println("Location" +Department.getLoc());
			System.out.println("Head" +Department.getHead());
			
			System.out.println("***************");
			
		}
	}


}
