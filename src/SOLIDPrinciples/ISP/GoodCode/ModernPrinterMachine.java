package SOLIDPrinciples.ISP.GoodCode;

public class ModernPrinterMachine implements Printer, Scanner, Copier{
    @Override
    public void copy() {
        System.out.println("Copying the paper");
    }

    @Override
    public void print() {
        System.out.println("Printing the paper");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the paper");
    }
}
