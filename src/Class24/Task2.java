package Class24;
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile
that will provide specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc
 */
abstract class File {
    abstract void open();

    void edit() {
        System.out.println("Editing a class");
    }

    void close() {
        System.out.println("Closing the file");
    }
}
class JavaFile extends File {
    void open() {
        System.out.println("to open .java file we need notepad++");
    }

}
class WordFile extends File {
    void open() {
        System.out.println("to open file we need sublime text");
    }

}
class PDFFile extends File {
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }

}
public class Task2 {
    public static void main(String[] args) {
        /* if a method is not present inside the parent class we can not call
        that method using polymorphism
         */
     /*   Object[] files={new JavaFile(),new PDFFile(),new WordFile()};
        files[0].  */
        File[] files={new JavaFile(),new PDFFile(),new WordFile()};
        for(int i=0;i<files.length;i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }

}
