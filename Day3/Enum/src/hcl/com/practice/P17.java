package hcl.com.practice;

enum Test {
	A,B,X,Y,P,C,N;
	private Test() {
		System.out.println("Hi");
	}
}

public class P17 {
	public static void main(String[] args) {
		Test t=Test.A;
	}

}
