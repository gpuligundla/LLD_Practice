package SOLIDPrinciples.LSP.BadCode;

// Here we are trying to extend the File class for a specific case ReadOnlyFile. Here the problem File parent class
// supports both read and write operations, however in this class we should keep the write() as empty or throw exception
// which is the violation of the Liskov Substitution Principle.
public class ReadOnlyFile extends File{
    public void write() {
        throw new UnsupportedOperationException("Can't perform the write operation on the readonly file");
    }
}
