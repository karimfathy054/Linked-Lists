package com.company;

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
    public  void addtoindex(int index, object data){
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
    public  void add(object data){
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
    public  void set (int index,object data) {

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
    public SingleLinkedList sublist(int fromIndex, int toIndex){
         SingleLinkedList sublist = new SingleLinkedList();
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
            System.out.println("invalid indexes");
        }
        return sublist;
    }
    public  boolean contains(object key){
        node cursor = head;
        boolean flag=false;
        while(cursor.next != null && !flag ){
            if(cursor.data.int_data == key.int_data){
                flag = true;
            }
            cursor=cursor.next;
        }
        return flag;
    }
    public static void main(String[] args) {
        // write your code here
        SingleLinkedList list =new SingleLinkedList();
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
        System.out.print(list.isEmpty());



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
}

