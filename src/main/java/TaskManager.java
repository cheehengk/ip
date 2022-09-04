import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static final String END_OF_LINE = "\n____________________";
    private static List<Task> tasks = new ArrayList<Task>();

    public void addNewTodo(String taskName) {
        tasks.add(new Task(taskName));
        System.out.println("Added new to task: " + taskName + "\n " + tasks.get(tasks.size() - 1).toString()
                + "\nYou have " + tasks.size() + " tasks in the list." + END_OF_LINE);
    }

    public void addNewDeadline(String taskName, String by) {
        tasks.add(new Deadlines(taskName, by));
        System.out.println("Added new deadline task: " + taskName + "\n " + tasks.get(tasks.size() - 1).toString()
                + "\nYou have " + tasks.size() + " tasks in the list." + END_OF_LINE);
    }

    public void addNewEvent(String taskName, String at) {
        tasks.add(new Events(taskName, at));
        System.out.println("Added new event task: " + taskName + "\n " + tasks.get(tasks.size() - 1).toString()
                + "\nYou have " + tasks.size() + " tasks in the list." + END_OF_LINE);
    }

    public void listTasks() {
        System.out.println("Here is your list of tasks.");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).toString());
        }
        System.out.println("____________________");
    }

    public void markTasks(boolean toMark, int taskIndex) {
        if (taskIndex < 1 || taskIndex > tasks.size()) {
            System.out.println("Invalid task indicated, unable to process request" + END_OF_LINE);
            return;
        }
        if (toMark) {
            if (tasks.get(taskIndex - 1).getIsDone()) {
                System.out.println("This task has already been marked done!" + END_OF_LINE);
                return;
            }
            tasks.get(taskIndex - 1).setIsDone();
            System.out.println(tasks.get(taskIndex - 1).getTaskName()
                    + " has been marked as done!" + END_OF_LINE);
        } else {
            if (!tasks.get(taskIndex - 1).getIsDone()) {
                System.out.println("This task has already been unmarked!" + END_OF_LINE);
                return;
            }
            tasks.get(taskIndex - 1).setIsNotDone();
            System.out.println(tasks.get(taskIndex - 1).getTaskName()
                    + " has been unmarked!" + END_OF_LINE);
        }
    }
}