package Enum;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.OVERDUED && requestedStatus != Status.BORROWED) {
            book.setStatus(requestedStatus);
            System.out.println("Перевод прошел успешно");
        } else {
            System.out.println("Перевод невозможен");
        }

    }
}
