package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Llist list =new Llist();
        Llist sublist =new Llist();
        Llist.add(list,1);
        Llist.add(list,2);
        Llist.add(list,3);
        Llist.add(list,4);
        Llist.add(list,5);
        Llist.printList(list);
        sublist = Llist.sublist(list,2,4);
        Llist.printList(sublist);
        Llist.insert(list,3,8);
        Llist.printList(list);
        Llist.set(list,1,9);
        System.out.println("does it contain 9??:"+ Llist.contains(list,9));
        System.out.println("does it contain 12??:"+ Llist.contains(list,12));
        Llist.printList(list);
        System.out.println(Llist.isEmpty(list));
        Llist.remove(list,1);
        Llist.printList(list);
        int x = Llist.get(list,1);
        System.out.println(x);
        Llist.clear(list);
        Llist.printList(list);
        System.out.print(Llist.isEmpty(list));*/
        Dllist list =new Dllist();
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
        System.out.print(Dllist.isEmpty(list));






    }
}
