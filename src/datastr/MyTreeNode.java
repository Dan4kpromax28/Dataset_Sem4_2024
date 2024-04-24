package datastr;

public class MyTreeNode<Ttype> {
    private Ttype element;
    private MyTreeNode parent = null;
    private MyTreeNode rightChild = null;
    private MyTreeNode leftChild = null;

    public MyTreeNode getParent() {
        return parent;
    }

    public void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public Ttype getElement() {
        return element;
    }

    public void setElement(Ttype element) {
        if (element == null){
            this.element = element;
        }
        else {
            this.element= (Ttype)new Object();
        }

    }

    public MyTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MyTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public MyTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    //2. get and set

    //3. constructor

    MyTreeNode(Ttype element){
        setElement(element);
    }

    @Override
    public String toString() {
        return "MyTreeNode{" +
                "element=" + element +
                '}';
    }

    //4.

}
