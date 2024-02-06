public class Event extends Task {
    String startDate;
    String endDate;

    public Event(String taskName, int counter, String startDate, String endDate) {
        super(taskName, counter);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void printRespond() {
        System.out.println("Okay! i've added to ur tasklist: ");
        System.out.print(" >> ");
        printTasktype();
        super.printCheckbox();
        System.out.println(" " + this.taskName + " (from: " + startDate + " ~~ to: " + endDate + "!)");
        super.printTaskcount();
    }
    @Override
    public void printTasktype() {
        System.out.print("[E]");
    }
    @Override
    public void printTask() {
        super.printTask();
        System.out.println("    >> from: " + startDate + " ~~ to: " + endDate);
    }
}