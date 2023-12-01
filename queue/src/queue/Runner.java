package queue;

public class Runner {

	public static void main(String[] args) {
		
		Queue que = new Queue(5);
		
		que.insert(10);
		que.insert(20);
		que.insert(30);
		que.insert(40);
		
		
		
		que.display();

	}

}
