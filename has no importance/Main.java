package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Llist list =new Llist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        Llist sublist = list.sublist(2,4);
        sublist.printList();
        list.insert(3,8);
        list.printList();
        list.set(1,9);
        System.out.println("does it contain 9??:"+ list.contains(9));
        System.out.println("does it contain 12??:"+ list.contains(12));
        list.printList();
        System.out.println(list.isEmpty());
        list.remove(1);
        list.printList();
        int x = list.get(1);
        System.out.println(x);
        list.clear();
        list.printList();
        System.out.print(list.isEmpty());*/



        DoubleLlist list =new DoubleLlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        DoubleLlist sublist = list.sublist(2,4);
        sublist.printList();
        list.insert(3,8);
        list.printList();
        list.set(1,9);
        System.out.println("does it contain 9??:"+ list.contains(9));
        System.out.println("does it contain 12??:"+ list.contains(12));
        list.printList();
        System.out.println(list.isEmpty());
        list.remove(1);
        list.printList();
        int x = list.get(1);
        System.out.println(x);
        list.clear();
        list.printList();
        System.out.print(list.isEmpty());






    }
}
