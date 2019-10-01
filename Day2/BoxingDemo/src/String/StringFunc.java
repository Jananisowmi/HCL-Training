
package String;

public class StringFunc {
	
	static String name;
	public StringFunc(String name) {
		this.name=name;
	}
	public int length() {
		char[] arr=name.toCharArray();
		int i=0;
		for(char c: arr) {
			i++;
		}
		return i;
		}
	}
	public static void main(String[] args) {
		
	}

}
