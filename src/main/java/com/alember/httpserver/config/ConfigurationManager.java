package com.alember.httpserver.config;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance(){
        if(configurationManager == null)
            configurationManager = new ConfigurationManager();
        return configurationManager;
    }
}
