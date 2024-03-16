package Enum;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.BORROWED){
            book.setStatus(requestedStatus);
            System.out.println("Перевод прошел успешно");
        } else {
            System.out.println("Статус книги не Borrowed");
        }

    }
}
