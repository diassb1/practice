package Enum;

public class Book {
    private String title;
    private Status status;

    public Book(String title){
        this.title = title;
        status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
