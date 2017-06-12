package Utils;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteToFile {
    
    public static void main(String args[]) {
        try {
            byte[] bb = "Hello Brother".getBytes(StandardCharsets.UTF_8);
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(bb);
            fout.close();
            System.out.println("success...");
            callFileOutputStream(bb);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private static void callFileOutputStream(byte[] bb) throws IOException {
       System.out.println(bb);   
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.write(bb);
        data.flush();
        data.close();
        System.out.println("Succcess...");
        
    }
    
}
