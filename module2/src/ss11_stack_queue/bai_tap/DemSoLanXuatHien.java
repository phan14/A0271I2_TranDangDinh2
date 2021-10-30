package ss11_stack_queue.bai_tap;

import java.util.*;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 câu: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        Map<String,Integer> map = new TreeMap<>();
        String chuThuong = input.toLowerCase();
        String[] cat = chuThuong.split("");

        for (String chuoi:cat){
            System.out.print(chuoi + "");
        }
        for(int i = 0; i<cat.length;i++){
            if (cat[i].equals(" ")) {
                continue;
            }else {
                if (!map.containsKey(cat[i])) {
                    map.put(cat[i],1);
                } else {
                    int count = map.get(cat[i]) + 1;
                    map.put(cat[i],count);
                }
            }
        }
        System.out.println(map);

    }
}
