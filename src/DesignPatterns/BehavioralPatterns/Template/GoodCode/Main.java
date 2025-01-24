package DesignPatterns.BehavioralPatterns.Template.GoodCode;

public class Main {
    public static void main(String[] args) {
        Parser jsonParser = new JSONParser();
        Parser csvParser = new CSVParser();
        jsonParser.doParse();
        csvParser.doParse();
    }
}

/*
Here we have used the template pattern. we created the abstract class for the parser with few concrete functions which
are common are implemented there itself. A TEMPLATE function(wrapper logic for the flow of instructions) doParse() here
which does the series of steps to complete the parsing. Along with these the parse() abstract function is added which
is implemented in the respective classes.

Now everything is loose couple and maintainable
 */