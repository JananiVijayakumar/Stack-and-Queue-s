package com.bridgelabz;

public class Queue {
        public static class Node {
            public int item;
            private Node next;
            //Constructor to initialize the queue
            public Node(int item) {
                this.item = item;
                this.next = null;
            }
            public Node(){
            }
        }
        private Node front = null;
    private Node rear = null;
        //EnQue the item into the queue
        public void enque(int item){
            Node nnode = new Node(item);
            if (front == null){
                front = nnode;
                rear = nnode;
                Node top = front;
            }else {
                Node temp = rear;
                this.rear = nnode;
                temp.next = rear;
            }
            rear = nnode;
            System.out.println("EnQue items : " + item);
        }

        public void deque(){
            if(front == null){
                System.out.println("There is no items in queue");
                System.out.println("Queue is Empty!!");
                return;
            }else{
                while(front != null){
                    Node temp = front;
                    System.out.println("Deque items are : " + front.item);
                    front = front.next;
                }
            }
        }

        //to display the enque items into the queue
        public void display(){
            Node temp = new Node();
            temp = front;
            System.out.println("...........................................");
            System.out.println("Enque items in queue are : ");
            while (temp != null){
                System.out.println(+temp.item + "");
                temp = temp.next;
            }
        }



        public static void main(String[] args) {
            Queue queue = new Queue();
            //Pushing the elements into stack
            queue.enque(70);
            queue.enque(30);
            queue.enque(56);
            queue.display();
            System.out.println(".............................");
            queue.deque();
            queue.display();
            queue.deque();
    }
}