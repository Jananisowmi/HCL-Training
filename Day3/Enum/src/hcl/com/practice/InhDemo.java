package hcl.com.practice;

class First {
	public void show(){
		System.out.println("show method from class first");
		
	}
}
class Second extends First {
     public void show() {
    	 
    	 System.out.println("show method feom class second");
     }
}
public class InhDemo {
	
	public static void main(String[] args) {
		
	
		First obj1=new First();
		Second obj2=new Second();
		
		First f1=(First)obj2;
		f1.show();
		
		First f2=(Second)obj2;
		f2.show();
		
		Second f3=(Second)obj1;
		f3.show();
	}
	
	
}



