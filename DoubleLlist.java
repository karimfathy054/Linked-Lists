package com.company;

public class DoubleLlist {
    node head;
    node tail;


    static class node{
        int data;
        node next;
        node prev;
        node(int k){
            data = k;
            next = null;
            prev = null;
        }
    }
    public int size(){
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
    public  void insert(int index, int data){
        node new_node = new node(data);
        if(index>=0 && index<= size()){
            if(head == null){
                head =new_node;
                tail =new_node;
                new_node.next=null;
                new_node.prev =null;
            }
            else{
                node pos = head;
                int i=0;
                while(i < index-1){
                    pos=pos.next;
                    i++;
                }
                new_node.next=pos.next;
                new_node.prev=pos;
                pos.next.prev=new_node;
                pos.next=new_node;

            }
        }
        else{
            System.out.println("not a valid index");
        }

    }
    public  void add(int data){
        node n2 = new node(data);
        if (head==null && tail==null){
            head=n2;
            tail=n2;
            n2.next= null;
            n2.prev= null;
        }
        else{
            n2.prev=tail;
            n2.next=null;
            tail.next=n2;
            tail=n2;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty,can not be printed");
        }
        else{
            node n = head;
            System.out.print("linked list:");
            while(n!= null){
                System.out.print(n.data + ", ");
                n=n.next;
            }
            System.out.println();
        }

    }
    public int get(int index) {
        {
            node cursor = head;
            int x = 0;
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
    public  void set (int index,int data) {

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
                cursor.data= data;
            }
        } else {
            System.out.println("not a valid index");
        }

    }
    public  void clear(){
        head=null;
        tail=null;
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
                while (i < index) {
                    cursor = cursor.next;
                    i++;
                }

                cursor.prev.next=cursor.next;
                cursor.next.prev=cursor.prev;
                cursor.next=null;
                cursor.prev=null;
            }
        } else {
            System.out.println("not a valid index");
        }

    }
    public DoubleLlist sublist(int fromIndex, int toIndex){
        DoubleLlist sublist = new DoubleLlist();
        if(fromIndex>=0 && toIndex>=0 && fromIndex<=size() && toIndex<=size() && fromIndex<=toIndex){
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
            System.out.println("invalid indices");
        }
        return sublist;
    }
    public  boolean contains(int key){
        node cursor = head;
        boolean flag=false;
        while(cursor.next != null && !flag ){
            if(cursor.data == key){
                flag = true;
            }
            cursor=cursor.next;
        }
        return flag;
    }
}
