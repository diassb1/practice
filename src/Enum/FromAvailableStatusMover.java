package Enum;

public class FromAvailableStatusMover extends BookMover{

    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.AVAILABLE && requestedStatus != Status.OVERDUED) {
            book.setStatus(requestedStatus);
            System.out.println("Перевод прошел успешно");
        } else {
            System.out.println("Перевод невозможен");
        }

    }
}
