package SOLIDPrinciples.ISP.GoodCode;

public class TraditionalPrinterMachine implements Printer{

    @Override
    public void print() {
        System.out.println("Printing the paper");
    }
}

// In the refactored code, we have specific interfaces, and we use the one which is necessary which satisfies the
// Interface segregation principle.
