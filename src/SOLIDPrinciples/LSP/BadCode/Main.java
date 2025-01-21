package SOLIDPrinciples.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        file.write();
    }
}

// If you see here in the driver code, we can able to call both read & write functions on the object of the ReadOnlyFile
// which is incorrect. inorder to correct it we need to explicitly override the write() in the ReadOnlyFile class and
// throw an exception.

// Instead of this if we create specific interfaces for readonly, rw files we would not be allowing the above case.