public class CirculatingBook extends LibraryBook {
    private String author;
    private String title;
    private String isbn;
    private String callNumber;
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String auth, String name, String code, String call) {
	author = auth;
	title = name;
	isbn = code;
	callNumber = call;
    }

    public String getHolder() {
	return currentHolder;
    }

    public String getDueDat() {
	return dueDate;
    }

    public void checkout(String patron, String due) {
	currentHolder = patron;
	dueDate = due;
    }

    public void returned() {
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	try {
	    System.out.println(currentHolder + ", " + dueDate);
	}
	catch (NullReferenceException e) {
	    System.out.println("Book available on shelves");
	}
    }

    public String toString() {
	try {
	    System.out.println(super.toString() + ", " + currentHolder + ", " + dueDate);
	}
	catch (NullReferenceException e) {
	    System.out.println(super.toString());x
	}
    }
}
