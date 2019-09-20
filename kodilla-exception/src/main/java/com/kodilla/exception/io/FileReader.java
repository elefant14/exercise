package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {
        Object getFile = null;
        if (getFile !=null) {
            System.out.println("Oh no! Sth went wrong");
        } else {
            return;

        }


        ClassLoader classLoader=getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);

        } catch (IOException e) {
            throw new FileReaderException();

        } finally {
            System.out.println("I am gonna to be here...always");
        }

}

}
