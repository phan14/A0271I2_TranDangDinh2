package ss12_Java_Collection_Framework.optional.thuc_hanh.tim_kiem_nhi_phan;

public interface Tree<E> {

    public boolean insert(E e);

    public void inorder();

    public int getSize();
}