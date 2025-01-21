package SOLIDPrinciples.LSP.GoodCode;

public class ReadonlyFile implements ReadOnly{

    @Override
    public void read(){
        System.out.println("Reading the file from ....");
    }
}
