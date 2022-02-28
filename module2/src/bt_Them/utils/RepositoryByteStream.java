package bt_Them.utils;

import bt_Them.models.QuanLy;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface RepositoryByteStream<K> {
    List<K> readFileByteStream(String diachi);
    void writeFileByteStream(List <K> list, String filePath);
//    void writeFileByByteStreamUseMap(Map<QuanLy, Integer> map, String filePath);
}