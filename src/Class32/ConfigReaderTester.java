package Class32;

import util.ConfigReader;

import java.io.IOException;

public class ConfigReaderTester {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URl"));
        System.out.println(ConfigReader.getProperty("username"));
        System.out.println(ConfigReader.getProperty("password"));
    }
}
