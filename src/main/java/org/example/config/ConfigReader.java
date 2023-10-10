package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //Загружает конфигурационные данные из файла config.properties.
    private  static Properties properties;
    static {
        try {
            String path="C:\\Users\\Admin\\Desktop\\JAVA Project\\Projekt1\\SammerSDET\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream =new FileInputStream(path);
            // для чтения содержимого файла по указанному пути
            properties =new Properties();
            // объект этого класса
            properties.load(inputStream);
            // загружает в этот класс все данные
            inputStream.close();
                } catch (IOException e) {
            e.printStackTrace();
// распечатали ошибку в случае чего
        }
    }
public static String getProperty(String key){
 return properties.getProperty(key).trim();

}

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }
}
