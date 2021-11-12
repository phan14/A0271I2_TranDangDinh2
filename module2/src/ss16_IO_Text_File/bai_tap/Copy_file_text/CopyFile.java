package ss16_IO_Text_File.bai_tap.Copy_file_text;

import ss17_Binary_File_Serialization.bai_tap.SanPham;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    static final String  SOURCE_PATH ="src\\ss16_IO_Text_File\\bai_tap\\Copy_file_text\\source file";
    static final String  TARGET_PATH ="src\\ss16_IO_Text_File\\bai_tap\\Copy_file_text\\target file.txt";

    public static String readFile(String path){
        String result=" ";
        File file =new File(path);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readByLine;
            while ((readByLine = bufferedReader.readLine()) != null) {
                result += readByLine + "\n";
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void writeFile(String path, String content) {
        File file = new File(path);
        checkFile(file);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.append(content);
            bufferedWriter.close();
            System.out.println("copy thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFile(File file) {
        FileWriter fileWriter = null;
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            try {
                file.createNewFile();
                fileWriter = new FileWriter(file);
                Scanner sc =new Scanner(System.in);
                String content = sc.nextLine();
                fileWriter.append(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File tồn tại !");
        }
    }
//
    public static void main(String[] args) {
        String content =readFile(SOURCE_PATH);
        writeFile(TARGET_PATH ,content);
    }

}
