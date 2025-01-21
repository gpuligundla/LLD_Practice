package SOLIDPrinciples.ISP.BadCode;

public class ModernPrintMachine implements Machine{

    @Override
    public void print() {
        System.out.println("Printing the paper");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the paper");
    }

    @Override
    public void copy() {
        System.out.println("Copying the scanned paper");
    }
}
