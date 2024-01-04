package oop.properties;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //data.properties 파일로드
        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
        //주어진 키에 대한 값을 읽기 위해서
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver = " + driver);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("admin = " + admin);
        
    }
}
