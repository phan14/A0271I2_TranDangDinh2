package ss16_IO_Text_File.thuc_hanh.tim_gia_tri_lon_nhat;


import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        final String PATH= "src\\ss16_IO_Text_File\\thuc_hanh\\tim_gia_tri_lon_nhat\\numbers.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_IO_Text_File\\thuc_hanh\\tim_gia_tri_lon_nhat\\result.txt", maxValue);
    }
}
