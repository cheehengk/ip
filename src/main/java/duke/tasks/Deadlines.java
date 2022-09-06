package duke.tasks;

public class Deadlines extends Task {
    private static String toBeDoneBy;

    public Deadlines(String taskName, String toBeDoneBy) {
        super(taskName);
        this.toBeDoneBy = toBeDoneBy;
    }

    public String toString() {
        String done = this.getIsDone() ? "[X]" : "[ ]";
        return "[D]" + done + this.getTaskName() + " (by: " + toBeDoneBy + " )";
    }
}