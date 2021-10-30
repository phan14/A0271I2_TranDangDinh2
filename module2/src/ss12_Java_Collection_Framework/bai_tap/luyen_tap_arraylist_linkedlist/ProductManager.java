package ss12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;
import java.util.*;


public class ProductManager {
//    thuoc tinh
    private List<Product> ds;

//    phuong thuc
//    hàm khởi tạo
    public ProductManager() {
        ds = new ArrayList<>();
    }


    //   hàm thêm
    public void add(Product e){
        this.ds.add(e);
    }


//    hàm sủa tên
    public void editName(int id, String newName) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId() == id) {
                ds.get(i).setName(newName);
                return;
            }
        }
    }
//    hàm sửa id
    public void editPrice(int id, int newPrice) {
        for (Product product : ds) {
            if (product.getId() == id) {
                product.setValue(newPrice);
                return;
            }
        }
    }

// hàm xóa id
    public String remove(int id) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId() == id) {
                ds.remove(i);
                return "Xóa thành công id " + id;
            }
        }
        return "Không tìm thấy id " + id;
    }
//hàm hiển thị
    public void display() {
        for (Product a : ds) {
            System.out.println(a);
        }
    }


    //    hàm tìm kiếm id
    public String searchId(int id) {
        for (Product product : ds) {
            if (product.getId()== id) {
                return product.toString();
            }
        }
        return "Không tìm thấy id "+id;
    }

//    hàm tìm kiếm tên
    public String searchName(String name) {
        for (Product product : ds) {
            if (product.getName().equals(name)) {
                return "Đã tìm thấy: " + product.toString();
            }
        }
        return "Không tìm thấy tên "+ name;
    }
//

    public void SortProductByNameAsc() {
        Collections.sort(this.ds, new SortProductByNameAsc());
    }

// sắp xếp tăng
   public void SortProduct() {
    Collections.sort(this.ds, new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (int) (o2.getValue()-o1.getValue());
        }
    });
  }

//hàm sắp xếp
//
//     public void sapXepGiamDan() {
//      Collections.sort(this.ds, new Comparator<Product>() {
//          @Override
//          public int compare(Product o1, Product o2) {
//              return (int) (o1.getValue()-o2.getValue());
//          }
//      });
//
// }
//
//    public void sapXepTangDan() {
//        Collections.sort(this.ds, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int) (o2.getValue()-o1.getValue());
//            }
//        });
//
//    }


}








