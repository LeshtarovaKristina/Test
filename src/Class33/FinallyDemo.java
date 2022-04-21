package Class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
try{
        String path = "/Users/kristinaleshtarova/Desktop/Batch12/Book1.xlsx";
       fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

    }catch(FileNotFoundException exception){
        System.out.println("The File that you are trying to read is not present on provided path please check your path again");

    }catch(IOException ioException){
        System.out.println("Something with hard drive went wrong");
    }finally {
    try {
        fileInputStream.close();
    } catch (IOException e) {
        System.out.println(" error while closing the file");
    }
}

    }
}