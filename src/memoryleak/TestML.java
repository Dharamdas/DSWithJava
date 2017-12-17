package memoryleak;

public class TestML {

	public static void main(String[] args) {
        TaskList taskList = new TaskList();
        final TaskCreator taskCreator = new TaskCreator(taskList);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    taskCreator.createTask();
                }
            }
        }).start();
    }
}
