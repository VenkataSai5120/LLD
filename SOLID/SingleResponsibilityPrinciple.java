// A class should have only one reason to change

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;   
    }

    public int claculateTotal() {
        return marker.price * quantity;
    }

    public void printInvoice() {
        // print invoice
    }

    public void saveToDB() {
        // save to database
    }
}

class InVoice {
    private Marker marker;
    private int quantity;

    public InVoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;   
    }

    public int claculateTotal() {
        return marker.price * quantity;
    }
}


class InvoiceDao {
    InVoice invoice;

    public InvoiceDao(InVoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to database
    }
}

class InvoicePrinter {
    InVoice invoice;

    public InvoicePrinter(InVoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // print invoice
    }
}
