package com.sandbox.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");
        linkedList.addLast("ninth");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.addFirst("sixth");

        System.out.println(linkedList);

        linkedList.pollFirst();
        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.pollLast();
        linkedList.pollLast();

        System.out.println(linkedList);

        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList.contains("third"));
        System.out.println(linkedList.contains("42"));
        System.out.println(linkedList.size());

        linkedList.clear();
        System.out.println(linkedList.size());
    }
}