// Open for extension, but closed for Modification

class InvoiceDao {
    InVoice invoice;

    public InvoiceDao(InVoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to database
    }
}

// Don't modify already tested classes

class InVoiceDao {
    InVoice invoice;

    public InVoiceDao(InVoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to database
    }

    public void saveToFile(String fileName) {
        // save to file with the given name
    }
}

interface InvoiceDataAccessObject {
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDataAccessObject {

    public void save(Invoice invoice) {
        // save to database
    }
}

class FileInvoiceDao implements InvoiceDataAccessObject {

    public void save(Invoice invoice) {
        // save to file
    }
}