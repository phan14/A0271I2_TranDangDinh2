package ss12_Java_Collection_Framework.optional.thuc_hanh.tim_kiem_nhi_phan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}