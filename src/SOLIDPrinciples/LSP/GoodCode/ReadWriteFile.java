package SOLIDPrinciples.LSP.GoodCode;

public class ReadWriteFile implements ReadWrite{

    @Override
    public void write(){
        System.out.println("Writing to the file.......");
    }

    @Override
    public void read() {
        System.out.println("Reading from the file ....");
    }
}
