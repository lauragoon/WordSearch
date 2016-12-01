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
	System.out.println("Successfully checked out" + this);
	currentHolder = patron;
	dueDate = due;
    }

    public void returned() {
	System.out.println("succesfsklfjskl");
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus() {
	try {
	    return currentHolder + ", " + dueDate;
	}
	catch (NullPointerException e) {
	    return "Book available on shelves";
	}
    }

    public String toString() {
	try {
	    return super.toString() + ", " + currentHolder + ", " + dueDate;
	}
	catch (NullPointerException e) {
	    return super.toString();
	}
    }
}