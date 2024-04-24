package service;

import datastr.MyBST;

public class MainService {
    public static void main(String[] args) {
        MyBST<Integer> bstWithIntegera = new MyBST<Integer>();
        bstWithIntegera.insert(5);
        bstWithIntegera.insert(8);
        bstWithIntegera.insert(3);
        bstWithIntegera.insert(4);
        bstWithIntegera.insert(7);
        bstWithIntegera.insert(6);
        try {
            bstWithIntegera.print();

            System.out.println("3? -> " + bstWithIntegera.search(3));
            System.out.println("100? -> " + bstWithIntegera.search(100));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
