package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Llist list =new Llist();
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
        System.out.print(list.isEmpty());
        /*Dllist list =new Dllist();
        Dllist sublist ;
        Dllist.add(list,1);
        Dllist.add(list,2);
        Dllist.add(list,3);
        Dllist.add(list,4);
        Dllist.add(list,5);
        Dllist.printList(list);
        sublist = Dllist.sublist(list,2,4);
        Dllist.printList(sublist);
        Dllist.insert(list,3,8);
        Dllist.printList(list);
        Dllist.set(list,1,9);
        System.out.println("does it contain 9??:"+ Dllist.contains(list,9));
        System.out.println("does it contain 12??:"+ Dllist.contains(list,12));
        Dllist.printList(list);
        System.out.println(Dllist.isEmpty(list));
        Dllist.remove(list,1);
        Dllist.printList(list);
        int x = Dllist.get(list,1);
        System.out.println(x);
        Dllist.clear(list);
        Dllist.printList(list);
        System.out.print(Dllist.isEmpty(list));*/






    }
}
