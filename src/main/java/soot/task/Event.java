package soot.task;

public class Event extends Task {
    public String startDate;
    public String endDate;

    public Event(String taskName, Boolean isDone, String startDate, String endDate) {
        super(taskName, isDone);
        this.taskType = TaskType.EVENT;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void printDelete() {
        super.printDelete();
        System.out.println(" " + this.taskName + " (from: " + startDate + " ~~ to: " + endDate + "!)");
        super.printTaskCount();
    }

    @Override
    public void printRespond() {
        super.printRespond();
        System.out.println(" " + this.taskName + " (from: " + startDate + " ~~ to: " + endDate + "!)");
        super.printTaskCount();
    }
    @Override
    public void printTaskType() {
        System.out.print("[E]");
    }
    @Override
    public void printTask(int index) {
        super.printTask(index);
        System.out.println("    >> from: " + startDate + " ~~ to: " + endDate);
    }
}