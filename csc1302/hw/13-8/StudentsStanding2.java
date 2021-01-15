import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class StudentsStanding2 {
    public static void main(String[] args) {
        Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");
        Path probFile = Paths.get("/root/sandbox/StudentsAcademicProbation.txt");
        String str = "";

        try
        {
            InputStream goodStream = new BufferedInputStream(Files.newInputStream(goodFile));
            BufferedReader goodReader = new BufferedReader(new InputStreamReader(goodStream));
            InputStream probStream = new BufferedInputStream(Files.newInputStream(probFile));
            BufferedReader probReader = new BufferedReader(new InputStreamReader(probStream));
            System.out.println("Probationary Standing");
            str = probReader.readLine();
            while( str != null)
            {
                display(str);
                str = probReader.readLine();
            }
            System.out.println("Good Standing");
            str = goodReader.readLine();
            while( str != null)
            {
                display(str);
                str = goodReader.readLine();
            }
            probStream.close();
            goodStream.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
    public static void display(String s)
    {
        String[] array = new String[4];
        String delimiter = ",";
        String stringId;
        String first_name;
        String last_name;
        double gpa;
        double prob_limit;
        final double CUTOFF = 2.0;
        array = s.split(delimiter);
        stringId = array[0];
        first_name = array[1];
        last_name = array[2];
        gpa = Double.parseDouble(array[3]);
        prob_limit = gpa - CUTOFF;
        System.out.println("ID #" + stringId + "  " + first_name + "  " +last_name + "  GPA: " + gpa + "    " + prob_limit +
                " from " + CUTOFF + " cutoff");
    }
}
