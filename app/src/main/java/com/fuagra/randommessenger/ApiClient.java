package com.fuagra.randommessenger;

public class ApiClient {

    private static ApiClient instance;

    public static ApiClient getInstance() {
        if (instance==null){
            instance = new ApiClient();
        }
        return instance;
    }

    private ApiClient() {
    }

    public void newLetter(String text) {
        //TODO
    }
}
