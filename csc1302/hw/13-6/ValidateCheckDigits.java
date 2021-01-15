import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits {
    public static void main(String[] args) {
        Path fileIn = Paths.get("/root/sandbox/AcctNumsIn.txt");
        Path fileOut = Paths.get("/root/sandbox/AcctNumsOut.txt");

        String acct;
        int account_number;
        int last_digit;
        int digit;
        int sum;
        int x;
        String next_line = "\n";
        InputStream input = null;
        OutputStream output = null;
        try
        {
            input = Files.newInputStream(fileIn);
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(input));
            output = Files.newOutputStream(fileOut);
            acct = reader.readLine();
            while(acct != null)
            {
                sum = 0;
                account_number = Integer.parseInt(acct);
                last_digit = account_number % 10;
                account_number = account_number / 10;
                for(x = 0; x < 6; x++)
                {
                    digit = account_number % 10;
                    account_number = account_number / 10;
                    sum = sum + digit;
                }
                sum = sum % 10;
                if(sum == last_digit)
                {
                    System.out.println(acct + " is valid");
                    acct = acct + System.getProperty("line.separator");
                    byte[] data = acct.getBytes();
                    output.write(data);
                }
                else
                {
                    System.out.println(acct + " is invalid");
                }
                acct = reader.readLine();
            }
       
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
