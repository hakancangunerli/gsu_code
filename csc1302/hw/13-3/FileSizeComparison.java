import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile = Paths.get("/root/sandbox/lyric1.txt");
        Path wordFile = Paths.get("/root/sandbox/lyric2.txt");

try{
BasicFileAttributes text_attribute = Files.readAttributes(textFile, BasicFileAttributes.class);

BasicFileAttributes word_attribute = Files.readAttributes(wordFile, BasicFileAttributes.class);

long size_text = text_attribute.size();
long size_word = word_attribute.size();

double ratio = size_text * 100.0 / size_word ; 

System.out.println(size_text);
System.out.println(size_word);
System.out.println(ratio);


}catch(IOException e ){

System.out.println("IO Exception");
}

    }
}
