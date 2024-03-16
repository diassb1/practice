package Enum;

public class FromArchievedStatusMover extends BookMover{

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.ARCHIVED && requestedStatus == Status.AVAILABLE) {
            book.setStatus(requestedStatus);
            System.out.println("Перевод прошел успешно");
        } else {
            System.out.println("Перевод невозможен");
        }
    }
}
