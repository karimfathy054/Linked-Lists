package com.company;

import java.util.Scanner;

public class SingleLinkedList {
     node head;

     static class object {
        int int_data ;
        public object(int int_data) {
            this.int_data = int_data;
        }
    }

     static class node{
        object data;
        node next;
        node(object k){
            data = k;
            next = null;
        }
    }
    public  int size(){
        int size=0;
        if (head != null) {
            node currentnode = head;
            while (currentnode != null) {
                size++;
                currentnode = currentnode.next;
            }
        }
        return size;
    }
    public  void addtoindex(int index, object element){
        node new_node = new node(element);
        if(index>=0 && index< size()){
            if(head == null){
                head=new_node;
                new_node.next=null;
            }
            else{
                node pos =head;
                int i=0;
                while(i < index-1){
                        pos=pos.next;
                        i++;
                }
                new_node.next=pos.next;
                pos.next=new_node;

            }
        }
        else{
            System.out.println("not a valid index");
        }

    }
    public  void add(object element){
        node n2 = new node(element);
        if (head==null){
            head=n2;
            n2.next= null;
        }
        else{
            node last = head;
            while(last.next!= null){
                last=last.next;
            }
            last.next = n2;
            n2.next= null;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("[]");
        }
        else{
            node n = head;
//            System.out.print("linked list:");
            System.out.print("[");
            while(n.next!= null){
                System.out.print(n.data.int_data + ", ");
                n=n.next;
            }
            System.out.print(n.data.int_data+"]");
            System.out.println();
        }

    }
    public object get(int index) {
        {
            node cursor = head;
            object x = null;
            if (index >= 0 && index <= size()) {
                if (head == null) {
                    System.out.println("list is empty");
                } else {
                    int i = 0;
                    while (i < index) {
                        cursor = cursor.next;
                        i++;
                    }
                    x = cursor.data;


                }
            } else {
                System.out.println("not a valid index");
            }
            return x;
        }
    }
    public  void set (int index,object element) {

            node cursor = head;
            if (index >= 0 && index <= size()) {
                if (head == null) {
                    System.out.println("list is empty");
                } else {
                    int i = 0;
                    while (i < index) {
                        cursor = cursor.next;
                        i++;
                    }
                    cursor.data= element;
                }
            } else {
                System.out.println("not a valid index");
            }

    }
    public  void clear(){
        head=null;
    }
    public  boolean isEmpty( ){
        return (head==null);
    }
    public  void remove (int index){

            node cursor = head;
            if (index >= 0 && index <= size()) {
                if (head == null) {
                    System.out.println("list is empty");
                } else {
                    int i = 0;
                    while (i < index-1) {
                        cursor = cursor.next;
                        i++;
                    }
                    node x=cursor.next;
                    cursor.next=x.next;
                    x.next=null;
                }
            } else {
                System.out.println("not a valid index");
            }

    }
    public SingleLinkedList sublist(int fromIndex, int toIndex){
         SingleLinkedList sublist = new SingleLinkedList();
        if(fromIndex>=0 && toIndex>=0 && fromIndex<size() && toIndex<size() && fromIndex<=toIndex){
            node cursor =head;
            int i=0;
            while(i<fromIndex){
                i++;
                cursor=cursor.next;
            }
            while(i<=toIndex){
                sublist.add(cursor.data);
                i++;
                cursor=cursor.next;
            }
        }
        else{
            System.out.println("Error");
        }
        return sublist;
    }
    public  boolean contains(object o){
        node cursor = head;
        boolean flag=false;
        while(cursor != null && !flag ){
            if(cursor.data.int_data == o.int_data){
                flag = true;
            }
            cursor=cursor.next;
        }
        return flag;
    }
    public static void main(String[] args) {
        // write your code here

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|\\]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for(int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }
        SingleLinkedList list =new SingleLinkedList();
        for (int j : arr) {
            list.add(new object(j));
        }
        String function = sc.nextLine();
        switch (function) {
            case "add" -> {
                int x = sc.nextInt();
                list.add(new object(x));
                list.printList();

                break;
            }
            case "size" ->{
                System.out.println(list.size());
                break;
            }
            case "addToIndex" -> {
                int pos = sc.nextInt();
                int x = sc.nextInt();
                list.addtoindex(pos, new object(x));
                list.printList();

                break;
            }
            case "get" -> {
                int pos = sc.nextInt();
                try{

                    System.out.println(list.get(pos).int_data);
                } catch (NullPointerException e) {
                    System.out.println("Error");
                }

                break;
            }
            case "set" -> {
                int pos = sc.nextInt();
                int x = sc.nextInt();
                list.set(pos, new object(x));
                list.printList();

                break;
            }
            case "clear" -> {
                list.clear();
                list.printList();
            }
            case "isEmpty" -> System.out.println(list.isEmpty());
            case "remove" -> {
                int pos = sc.nextInt();
                try{
                    list.remove(pos);
                    list.printList();

                } catch (NullPointerException e) {
                    System.out.println("Error");
                }

                break;
            }
            case "sublist" -> {
                int from = sc.nextInt();
                int to = sc.nextInt();
                SingleLinkedList sublist = list.sublist(from, to);
                sublist.printList();
            }
            case "contains" -> {
                int key = sc.nextInt();
                System.out.println(list.contains(new object(key)));
            }
            default -> System.out.println("not a valid operation");
        }
    }













        /*SingleLinkedList list =new SingleLinkedList();
        list.printList();
        System.out.println(list.isEmpty());
        list.add(new object(1));
        list.add(new object(2));
        list.add(new object(3));
        list.add(new object(4));
        list.add(new object(5));
        list.printList();
        SingleLinkedList sublist = list.sublist(2,4);
        sublist.printList();
        list.addtoindex(3,new object(8));
        list.printList();
        list.set(1,new object(9));
        System.out.println("does it contain 9??:"+ list.contains(new object(9)));
        System.out.println("does it contain 12??:"+ list.contains(new object(12)));
        list.printList();
        System.out.println(list.isEmpty());
        list.remove(1);
        list.printList();
        object x = list.get(1);
        System.out.println(x.int_data);
        list.clear();
        list.printList();
        System.out.print(list.isEmpty());*/



        /*DoubleLlist list =new DoubleLlist();
        list.add(new object(1));
        list.add(new object(2));
        list.add(new object(3));
        list.add(new object(4));
        list.add(new object(5));
        list.printList();
        DoubleLlist sublist = list.sublist(2,4);
        sublist.printList();
        list.insert(3,new object(8));
        list.printList();
        list.set(1,new object(9));
        System.out.println("does it contain 9??:"+ list.contains(new object(9)));
        System.out.println("does it contain 12??:"+ list.contains(new object(12)));
        list.printList();
        System.out.println(list.isEmpty());
        list.remove(1);
        list.printList();
        int x = list.get(1);
        System.out.println(x);
        list.clear();
        list.printList();
        System.out.print(list.isEmpty());*/







}

