import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q.poll());
		
	}

}
