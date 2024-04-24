package datastr;

public class MyBST <Ttype>{
    private MyTreeNode root = null;
    private int counter = 0;

    // pec noklusejuma jau bus bezargumenta konstruktors

    public boolean isEmpty(){
        return (counter == 0);
    }

    public int howManyElements(){
        return counter;
    }

    public void insert(Ttype element){
        if (isEmpty())root = new MyTreeNode(element);
        else {
            // izsaukt rrekursivo funkciju pirmo reizi
            insertHelpRecursive( root,element);

        }
    }

    private void insertHelpRecursive(MyTreeNode tempNode, Ttype element){
        // apakskoka sakne ir lielaks par elementu
        if (((Comparable)tempNode.getElement()).compareTo(element) == 1){
            // kreisais berns neeksiste
            if (tempNode.getLeftChild() == null){
                MyTreeNode newNode = new MyTreeNode(element);
                tempNode.setLeftChild(newNode);
                newNode.setParent(tempNode);
                counter++;
            }
            //kreisasi berns eksiste
            else {
                insertHelpRecursive(tempNode.getLeftChild(), element);
            }
        }
        // saknes elements ir mazaks par element
        else if (((Comparable)tempNode.getElement()).compareTo(element) == -1) {
            // labais berns neeksiste
            if (tempNode.getRightChild() == null){
                MyTreeNode newNode = new MyTreeNode(element);
                tempNode.setRightChild(newNode);
                newNode.setParent(tempNode);
                counter++;

            }
            // labais berns eksiste
            else {
                insertHelpRecursive(tempNode.getRightChild(), element);
            }

        }
        else {
            System.out.println("dads elements jau eksiste BTS");
        }

    }

}
