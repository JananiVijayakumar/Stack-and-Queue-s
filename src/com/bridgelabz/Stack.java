package com.bridgelabz;

public class Stack {
        public static class Node {
            public int element;
            private Node next;
            public int top;
            //Constructor to initialize the stack
            public Node(int data) {
                this.element = data;
                this.next = null;
            }
            public Node(){
            }
        }
        private Node top = null;
        //push the element into the stack
        public void push(int element){
            Node node = new Node(element);
            if (node == null){
                System.out.println("There is no element in Stack");
                node.next = null;
            }else {
                node.next = top;
            }
            top = node;
            System.out.println("Pushed elements : " + element);
        }

        //to display the pushed elements into the stack
        public void display(){
            if (top == null)
                System.out.println("There is no element in Stack");
            Node temp = new Node();
            temp = top;
            System.out.println("...........................................");
            System.out.println("Pushed elements into the Stack are : ");
            while (temp != null){
                System.out.println(+temp.element);
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            com.bridgelabz.Stack stack = new com.bridgelabz.Stack();
            //Pushing the elements into stack
            stack.push(70);stack.push(30);
            stack.push(56);
            stack.display();
        }
    }