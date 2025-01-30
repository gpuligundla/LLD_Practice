package DesignPatterns.CreationalPatterns.Singleton;

class AppSettings{
    private String DBUrl;
    private String APIKey;

    public AppSettings(){
        DBUrl = "JDBC://abcd";
        APIKey = "123asdf";
    }

    public void setDBUrl(String url){
        this.DBUrl = url;
    }
    public void setAPIKey(String api){
        this.APIKey = api;
    }

    public String getDBUrl(){
        return DBUrl;
    }
    public String getAPIKey(){
        return APIKey;
    }
}

public class AppSettingsWithoutSingleton {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        AppSettings appSettings1 = new AppSettings();

        System.out.println(appSettings.getAPIKey());
        System.out.println(appSettings1.getAPIKey());

        System.out.println(appSettings1==appSettings);
    }
}


/*
In this example we are creating multiple objects for the AppSettings class. if the objects where resource heavy it also
leads to more memory consumption and high latency.

We can use Singleton pattern to restrict the number of objects created for an class.
 */