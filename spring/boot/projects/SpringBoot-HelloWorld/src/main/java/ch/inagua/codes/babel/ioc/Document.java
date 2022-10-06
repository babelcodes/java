package ch.inagua.codes.babel.ioc;

interface DocumentInterface {
    String getPage();
}

public class Document implements DocumentInterface {
    @Override
    public String getPage() {
        return "Page!";
    }
}

class Printer {
    private DocumentInterface document;

    public Printer(DocumentInterface document) {
        this.document = document;
    }

    public void print() {
        System.out.println(this.document.getPage());
    }
}

class Factory {
    Document document = new Document();
    Printer p = new Printer(document);

    void produce() {
        p.print();
    }
}
