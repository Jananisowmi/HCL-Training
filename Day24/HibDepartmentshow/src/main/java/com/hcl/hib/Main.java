package com.hcl.hib;


	
	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

	public class Main {
		
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Dept");
		List<Dept> lstDept=q.list();
		for (Dept dept : lstDept) {
			System.out.println("Deptno "+dept.getDeptno()); 
			System.out.println("Name "+dept.getDname());
			System.out.println("Loc "+dept.getLoc());
			System.out.println("Head "+dept.getHead());
			System.out.println("***************");
			
		}
	}

	}



