package bt_Them.utils;

import java.util.List;
import java.io.*;
import java.util.Collection;
import java.util.Map;
public class ReadAndWriteFile<K>implements RepositoryByteStream{
    @Override
    public List readFileByteStream(String diachi) {
        FileInputStream FIn = null;
        ObjectInputStream OIn = null;
        Object read = null;
        try {
            //Khở tạo đối tượng với địa chỉ truyền vào
            FIn = new FileInputStream(new java.io.File(diachi));
            OIn = new ObjectInputStream(FIn);
            read = OIn.readObject();
            FIn.close();
            OIn.close();
            return (List) read;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }



    @Override
    public void writeFileByteStream(List list, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public void writeFileByByteStreamUseMap(Map map, String filePath) {
//        File file = new File(filePath);
//        FileOutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(map);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                outputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}