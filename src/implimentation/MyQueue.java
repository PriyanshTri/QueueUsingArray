package implimentation;

import myqueueADT.MyQueueADT;

import java.util.ArrayList;

public class MyQueue<E> implements MyQueueADT<E> {
    int size = 0;
    int front = 0;
    int rear = 0;
    E[] arr;

    public MyQueue(E[] arr) {
        this.arr = arr;
    }

    @Override
    public int size() {
        return size;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E element) {
        if (size != arr.length) {
//          rotating rear
            if (rear == arr.length) {
                //reset array
                rear = 0;
            }
            arr[rear] = element;
            rear++;
            size++;
        } else {
            System.out.println("queue overflow!");
        }
    }

    @Override
    public E dequeue() {
        E response = null;
        if (!isEmpty()) {
            response = arr[front];
            front++;
            size--;
            //rotate
            if (front == arr.length) {
                front = 0;
            }
        }
        return null;
    }

    @Override
    public E front() {
        E resonse=null;
        if(!isEmpty()){
            resonse=arr[front];
        }
        return resonse;
    }

    @Override
    public E rear() {
        E response=null;
        if(!isEmpty()){
            response=arr[rear];
        }
        return response;
    }

    @Override
    public E peek() {
        E response=null;
        if(!isEmpty()){
            response=arr[front];
        }
        return response;
    }

    @Override
    public void traverse() {
        System.out.println("printing queue element:-");
        System.out.print("front<--");
        if(rear<=front) {
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + "<--");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }

        }
        else{
            for (int i = front; i <rear ; i++) {
                System.out.print(arr[i]+"<--");
            }
        }
        System.out.println("rear");
    }
}
