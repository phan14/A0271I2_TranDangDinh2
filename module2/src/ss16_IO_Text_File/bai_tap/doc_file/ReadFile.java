package ss16_IO_Text_File.bai_tap.doc_file;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
         String path="src\\ss16_IO_Text_File\\bai_tap\\doc_file\\danhsach.csv";

         File file =new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            String line =reader.readLine();
            while (line !=null){
                System.out.println(line);
                line=reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
                // file.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
