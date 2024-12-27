package homework.homeworkonoctombertenth.tasktwo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckApp {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println(isSymmetric(head));
    }

    public static boolean isSymmetric(Node head) {
        if (head == null) {
            return true;
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < length / 2; i++) {
            queue.add(temp.data);
            temp = temp.next;
        }

        if (length % 2 != 0) {
            temp = temp.next;
        }

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}


