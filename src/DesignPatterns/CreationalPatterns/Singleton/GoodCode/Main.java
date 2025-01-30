package DesignPatterns.CreationalPatterns.Singleton.GoodCode;

public class Main {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettings1 = AppSettings.getInstance();

        System.out.println(appSettings.getAPIKey());
        System.out.println(appSettings1.getAPIKey());

        System.out.println(appSettings==appSettings1);
    }
}

/* we have created the Appsettings based on the singleton pattern. here the steps to make it private is create an
private static instance self reference, make the constructor private and static method getInstance()


here if you observe the objects comparison returned true. so we can control the number of objects created in the
getInstance method.
 */