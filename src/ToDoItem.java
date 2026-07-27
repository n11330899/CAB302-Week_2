public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem() {
        description = " ";
        isDone = false;
    }

    public String getToDoDesc() {
        return description;
    }

    public void setToDoDesc(String newDesc) {
        this.description = newDesc;
    }

    public Boolean getToDoDone() {
        return isDone;
    }

    public void setToDoDone(Boolean newStatus) {
        this.isDone = newStatus;
    }
}