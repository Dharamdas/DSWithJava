package memoryleak;

import java.util.ArrayDeque;
import java.util.Deque;

import com.sun.jmx.snmp.tasks.Task;

public class TaskList {

	 private static Deque<Task> tasks = new ArrayDeque<Task>();
	    public void addTask(Task task){
	        tasks.add(task);
	        tasks.peek().execute();//Memory leak!
	    }
}
