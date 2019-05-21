package com.cybertek.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
    private static Properties properties;

            static {
        String path ="configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties= new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
            }
            public static String getProperty(String Property){
                return properties.getProperty(Property);
            }

    }

