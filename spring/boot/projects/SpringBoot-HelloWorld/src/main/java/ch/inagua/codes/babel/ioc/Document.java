package ch.inagua.codes.babel.ioc;

public class Document {
    public String getPage() {
        return "Page!";
    }
}

class Printer {
    Document document = new Document();

    public void print() {
        System.out.println(this.document.getPage());
    }
}

class Factory {
    Printer p = new Printer();

    void produce() {
        p.print();
    }
}
