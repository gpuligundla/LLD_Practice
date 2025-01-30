package DesignPatterns.CreationalPatterns.Singleton.GoodCode;

public class AppSettings{
    private String DBUrl;
    private String APIKey;

    // 1. private static self instance ref
    private static AppSettings instance;

    private AppSettings(){
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

    public static AppSettings getInstance(){
        if(instance == null){
            instance = new AppSettings();
        }
        return instance;
    }
}