package ss12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Giay", 20000);
        Product p2 = new Product(2, "Ao", 15000);
        Product p3 = new Product(3, "Quan", 350000);
        Product p4 = new Product(4, "Ao", 350000);
        ProductManager productManager = new ProductManager();
        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);
        productManager.add(p4);

        System.out.println("Chọn chức năng: \n" +
                "1/ Thêm sản phẩm \n" +
                "2/ Sửa tên sản phẩm theo id \n" +
                "3/ Sửa giá sản phẩm theo id \n" +
                "4/ Xóa sản phẩm theo id \n" +
                "5/ Hiển thị danh sách sản phẩm \n" +
                "6/ Tìm kiếm sản phẩm theo tên \n" +
                "7/ Sắp xếp sản phẩm theo giá tăng dần \n" +
                "8/ Sắp xếp sản phẩm theo giá giảm dần \n" +
                "9/ Thoát chương trình.");
        boolean checkLoop = true;
        while (checkLoop) {
            Scanner inputLuaChon = new Scanner(System.in);
            int luaChon = inputLuaChon.nextInt();
            switch (luaChon) {

                case 1:
                    Scanner inputId = new Scanner(System.in);
                    System.out.println("Nhập id:");
                    int id = inputId.nextInt();
                    if (productManager.searchId(id).equals(" " + id)) {
                        System.out.println("Nhập tên sản phẩm:");
                        String name = inputId.next();
                        System.out.println("Nhập giá sản phẩm:");
                        int value = inputId.nextInt();
                        Product product = new Product(id, name, value);
                        productManager.add(product);
//                        productManager.display();
                        System.out.println("--------chọn tiếp chức mới-----------");
                        break;

                    } else  {
                        System.out.println("id " + id + " đã tồn tại-Mời nhập lại chức năng :");
                        System.out.println("--------chọn tiếp chức mới-----------");
                        break;
                    }

                case 2:
                    System.out.println("Nhập id cần chỉnh sửa tên");
                    Scanner inputIdName = new Scanner(System.in);
                    int idEditName = inputIdName.nextInt();
                    if (productManager.searchId(idEditName).equals(" " + idEditName)) {
                        System.out.println("Không tìm thấy id " + idEditName);
                        break;
                    } else {
                        System.out.println("Chỉnh sửa: "+productManager.searchId(idEditName));
                        System.out.println("Nhập tên mới: ");
                        Scanner inputNewName = new Scanner(System.in);
                        String nameNew = inputNewName.nextLine();
                        productManager.editName(idEditName, nameNew);
//                      productManager.display();
                        System.out.println("--------chọn tiếp chức mới-----------");
                        break;
                    }
                case 3:
                    System.out.println("Nhập id cần chỉnh sửa giá");
                    Scanner inputIdPrice = new Scanner(System.in);
                    int idEditPrice = inputIdPrice.nextInt();
                    if (productManager.searchId(idEditPrice).equals("Không tìm thấy id " + idEditPrice)) {
                        System.out.println("Không tìm thấy id " + idEditPrice);
                        break;
                    } else {
                        System.out.println("Chỉnh sửa: "+productManager.searchId(idEditPrice));
                        System.out.println("Nhập giá mới: ");
                        int newPrice = inputIdPrice.nextInt();
                        productManager.editPrice(idEditPrice, newPrice);
//                       productManager.display();
                        System.out.println("--------chọn tiếp chức mới-----------");
                        break;
                    }
                case 4:
                    System.out.println("Nhập id cần xóa:");
                    Scanner inputIdRemove = new Scanner(System.in);
                    int idRemove = inputIdRemove.nextInt();
                    if (productManager.searchId(idRemove).equals("Không tìm thấy id " + idRemove)) {
                        System.out.println("Không tìm thấy id " + idRemove);
                        break;
                    } else {
                        System.out.println(productManager.remove(idRemove));
//                      productManager.display();
                        System.out.println("--------chọn tiếp chức mới-----------");
                        break;
                    }
                case 5:
                    System.out.println("Hiển thị danh sách sản phẩm:");
                    productManager.display();
                    System.out.println("--------chọn tiếp chức mới-----------");
                    break;
                case 6:
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm");
                    Scanner inputIdSearch = new Scanner(System.in);
                    String nameSearch = inputIdSearch.nextLine();
                    System.out.println(productManager.searchName(nameSearch));
                    System.out.println("--------chọn tiếp chức mới-----------");
                    break;
                case 7:
                    System.out.println("Sắp xếp theo giá sản phẩm tăng dần:");
                    productManager.SortProductByNameAsc();
                    productManager.display();
                    System.out.println("--------chọn tiếp chức mới-----------");
                    break;
                case 8:
                    System.out.println("Sắp xếp theo giá sản phẩm giảm dần");
                    productManager.SortProduct();
                    productManager.display();
                    System.out.println("--------chọn tiếp chức mới-----------");
                    break;
                case 0:
                    checkLoop = false;
                    break;
                default:
                    System.out.println("Nhập lại 1-8");
            }
        }
    }
}