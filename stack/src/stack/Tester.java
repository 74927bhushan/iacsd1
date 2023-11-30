package stack;

public class Tester {

	public static void main(String[] args) {
		
		Stack <Integer> s1 = new Stack <>(5);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		
		s1.display();

	}

}
