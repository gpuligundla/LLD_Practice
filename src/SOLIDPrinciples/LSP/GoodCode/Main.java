package SOLIDPrinciples.LSP.GoodCode;

public class Main {
    public static void main(String[] args) {
        ReadOnly file = new ReadonlyFile();
        file.read();

        ReadWrite rwfile = new ReadWriteFile();
        rwfile.read();
        rwfile.write();
    }
}

// Here now we have defined the smaller interfaces which does specific jobs, so now we no need to write empty or exception
// functions which satisfies the Liskov Substitution Principle.