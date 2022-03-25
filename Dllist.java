package com.company;

public class Dllist {
    Dllist.node head;
    Dllist.node tail;

    static class node{
        int data;
        Dllist.node next;
        Dllist.node prev;

        node(int k){
            data = k;
            next = null;
            prev = null;
        }
    }
    public static int size(Dllist list){
        int size=0;
        if (list.head != null) {
            Dllist.node currentnode = list.head;
            while (currentnode != list.tail) {
                size++;
                currentnode = currentnode.next;
            }
        }
        return size;
    }
    public static void insert(Dllist list, int index, int data){
        Dllist.node new_node = new Dllist.node(data);
        if(index>=0 && index<= size(list)){
            if(list.head == null){
                list.head=new_node;
                new_node.next=list.tail;
                list.tail.prev=new_node;
            }
            else{
                Dllist.node pos =list.head;
                int i=0;
                while(i < index-1){
                    pos=pos.next;
                    i++;
                }
                new_node.next=pos.next;
                new_node.prev=pos;
                pos.next=new_node;
                new_node.next.prev=new_node;

            }
        }
        else{
            System.out.println("not a valid index");
        }

    }
    public static void add(Dllist list , int data){
        Dllist.node n2 = new Dllist.node(data);
        if (list.head==null){
            n2.prev = list.head;
            n2.next = list.tail;
            list.head.next = n2;
            list.tail.prev = n2;
        }
        else{
            n2.prev=list.tail.prev;
            list.tail.prev=n2;
            n2.next=list.tail;
        }
    }
    public static void printList(Dllist list){
        if(list.head==null){
            System.out.println("list is empty,can not be printed");
        }
        else{
            Dllist.node n = list.head;
            System.out.print("linked list:");
            while(n!=list.tail){
                System.out.print(n.data + ", ");
                n=n.next;
            }
            System.out.println();
        }

    }
    public static int get (Dllist list,int index) {
        {
            Dllist.node cursor = list.head;
            int x = 0;
            if (index >= 0 && index <= size(list)) {
                if (list.head == null) {
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
    public static void set (Dllist list,int index,int data) {

        Dllist.node cursor = list.head;
        if (index >= 0 && index <= size(list)) {
            if (list.head == null) {
                System.out.println("list is empty");
            } else {
                int i = 0;
                while (i < index) {
                    cursor = cursor.next;
                    i++;
                }
                cursor.data= data;
            }
        } else {
            System.out.println("not a valid index");
        }

    }
    public static void clear(Dllist list){
        list.head=null;
        list.tail.prev=null;
    }
    public static boolean isEmpty(Dllist list){
        return (list.head==null);
    }
    public static void remove (Dllist list,int index){

        Dllist.node cursor = list.head;
        if (index >= 0 && index <= size(list)) {
            if (list.head == null) {
                System.out.println("list is empty");
            } else {
                int i = 0;
                while (i < index) {
                    cursor = cursor.next;
                    i++;
                }
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
                cursor.next =null;
                cursor.prev =null;

            }
        } else {
            System.out.println("not a valid index");
        }

    }
    public static Dllist sublist(Dllist list,int fromIndex,int toIndex){
        Dllist sublist = new Dllist();
        if(fromIndex>=0 && toIndex>=0 && fromIndex<=size(list) && toIndex<=size(list) && fromIndex<=toIndex){
            Dllist.node cursor =list.head;
            int i=0;
            while(i<fromIndex){
                i++;
                cursor=cursor.next;
            }
            while(i<=toIndex){
                sublist.add(sublist,cursor.data);
                i++;
                cursor=cursor.next;
            }
        }
        else{
            System.out.println("invalid indeces");
        }
        return sublist;
    }
    public static boolean contains(Dllist list,int key){
        Dllist.node cursor = list.head;
        boolean flag=false;
        while(cursor.next != list.tail && !flag ){
            if(cursor.data == key){
                flag = true;
            }
            cursor=cursor.next;
        }
        return flag;
    }
}
