package SOLIDPrinciples.ISP.BadCode;

public class TraditionalPrintMachine implements Machine{
    @Override
    public void print() {
        System.out.println("Printing the paper");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scanning is not supported");

    }

    @Override
    public void copy() {
        throw new UnsupportedOperationException("Copying is not supported");
    }
}

// Here we have a generic Interface called Machine which has 3 functions, we have 2 types of machines which implemented
// this interface, and we can see in the TraditionalPrintMachine class, it made us to unnecessarily add logic for the
// scan and copy operations with exception logic. instead of adding burden of writing unused functions, lets refactor
// the interface into smaller specific ones so that we implement all necessary functions.