package com.company;

public class Llist {
     node head;


     static class node{
        int data;
        node next;
        node(int k){
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
    public  void insert(int index, int data){
        node new_node = new node(data);
        if(index>=0 && index<= size()){
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
    public  void add(int data){
        node n2 = new node(data);
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
    public  Llist sublist(int fromIndex,int toIndex){
        Llist sublist = new Llist();
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
            System.out.println("invalid indeces");
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

