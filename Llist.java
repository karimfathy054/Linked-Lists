package com.company;

public class Llist {
    node head;
    node tail;

    static class node{
        int data;
        node next;
        node(int k){
            data = k;
            next = null;
        }
    }
    public static int size(Llist list){
        int size=0;
        if (list.head != null) {
            node currentnode = list.head;
            while (currentnode != list.tail) {
                size++;
                currentnode = currentnode.next;
            }
        }
        return size;
    }
    public static void insert(Llist list, int index, int data){
        node new_node = new node(data);
        if(index>=0 && index<= size(list)){
            if(list.head == null){
                list.head=new_node;
                new_node.next=list.tail;
            }
            else{
                node pos =list.head;
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
    public static void add(Llist list , int data){
        node n2 = new node(data);
        if (list.head==null){
            list.head=n2;
            n2.next=list.tail;
        }
        else{
            node last = list.head;
            while(last.next!=list.tail){
                last=last.next;
            }
            last.next = n2;
            n2.next=list.tail;
        }
    }
    public static void printList(Llist list){
        if(list.head==null){
            System.out.println("list is empty,can not be printed");
        }
        else{
            node n = list.head;
            System.out.print("linked list:");
            while(n!=list.tail){
                System.out.print(n.data + ", ");
                n=n.next;
            }
            System.out.println();
        }

    }
    public static int get (Llist list,int index) {
        {
            node cursor = list.head;
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
    public static void set (Llist list,int index,int data) {

            node cursor = list.head;
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
    public static void clear(Llist list){
        list.head=null;
    }
    public static boolean isEmpty(Llist list){
        return (list.head==null);
    }
    public static void remove (Llist list,int index){

            node cursor = list.head;
            if (index >= 0 && index <= size(list)) {
                if (list.head == null) {
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
    public static Llist sublist(Llist list,int fromIndex,int toIndex){
        Llist sublist = new Llist();
        if(fromIndex>=0 && toIndex>=0 && fromIndex<=size(list) && toIndex<=size(list) && fromIndex<=toIndex){
            node cursor =list.head;
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
    public static boolean contains(Llist list,int key){
        node cursor = list.head;
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

