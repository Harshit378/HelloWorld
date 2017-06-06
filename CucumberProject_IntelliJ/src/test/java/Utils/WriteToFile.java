package Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class WriteToFile {
    
    public static void main(String args[]) {
        try {
            byte[] bb = "Hello Brother".getBytes(StandardCharsets.UTF_8);
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(bb);
            fout.close();
            callFileOutputStream(bb);
            
            callFileReader();
            
            callBufferedWriter();
            
            int a = 5;
            if (a > 3) {
                System.out.println("if executed");
            } else if (a > 2) {
                System.out.println("Else if executed");
            } else if (a > 1) {
                System.out.println("Second else if executed");
            }
            
            String textToAppend = " Heart break kid";
            appendToFile(textToAppend);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private static void appendToFile(String textToAppend) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\appendToFile.txt", true);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos, Charset.forName("UTF-8")));
        out.append(textToAppend);
        out.close();
    }
    
    private static void callBufferedWriter() {
        
    }
    
    private static void callFileReader() throws IOException {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(new FileInputStream("D:\\testout.txt"), "UTF8"));
        System.out.println("Result of Buffered Reader" + in);
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
    }
    
    private static void callFileOutputStream(byte[] bb) throws IOException {
        System.out.println(bb);
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.write(bb);
        data.flush();
        data.close();
    }
}
