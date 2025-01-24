package DesignPatterns.BehavioralPatterns.Template;

class CSVParser{
    public void readFile(){
        System.out.println("Reading the file.....");
    }
    public void parseFile(){
        System.out.println("Parsing the CSV File.....");
    }
    public void writeFile(){
        System.out.println("Writing the file......");
    }

}

class JSONParser{
    public void readFile(){
        System.out.println("Reading the file.....");
    }
    public void parseFile(){
        System.out.println("Parsing the JSON File.....");
    }
    public void writeFile(){
        System.out.println("Writing the file......");
    }

}
public class ParserWithoutTemplate {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JSONParser jsonParser = new JSONParser();
        // csv parsing
        csvParser.readFile();
        csvParser.parseFile();
        csvParser.writeFile();

        // json parsing
        jsonParser.readFile();
        jsonParser.parseFile();
        jsonParser.writeFile();

    }
}

/*
If you see here, we have 2 types of parsers which is doing 75% of work same except the parser function which is
specific to the parser. If you observe the above code we have read, write functions which are same and repeated which
needs lot of management if needs to change(DRY-Dont Repeat Yourself)

To fix this, we can use the template pattern which says to create a abstract class with a abstract method which can
be implemented in the necessary concrete classes. all common functions are implemented in the abstract class itself
which is simple and compact.
 */