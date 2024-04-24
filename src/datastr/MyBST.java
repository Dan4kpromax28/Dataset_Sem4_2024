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

    public void print() throws Exception {
        if (isEmpty()) throw new Exception("Koks ir tukšs");

        // TODO izsaukt rekursovo printesanas funkciju


    }
    //TODO izveidit majas ari PostOrder
    private void printHelpRecursivePreOrder(MyTreeNode tempNode){
        // Root - Left - right
        System.out.println(tempNode.getElement());

        // Left
        if (tempNode.getLeftChild()!= null){
            System.out.print(" -> LC: " + tempNode.getLeftChild().getElement() + " [" + tempNode.getElement() + "]");
            printHelpRecursivePreOrder(tempNode.getLeftChild());
        }
        // Right
        if (tempNode.getRightChild()!= null){
            System.out.print(" -> RC: " + tempNode.getRightChild().getElement() + " [" + tempNode.getElement() + "]");
            printHelpRecursivePreOrder(tempNode.getRightChild());
        }
    }

}
