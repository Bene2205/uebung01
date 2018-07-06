package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    class Element{
        char v;
        Element next;

        public Element(char v, Element next) {
            this.v = v;
            this.next = next;
        }
    }

    Element head = null;
    int size = 0;

    @Override
    public void push(char c) {
        if (head == null) {
            head = new Element(c, null);
            size = 1;
            return;
        }
        Element it = head;
        while(it.next != null) {
            it = it.next;
        }
        it.next = new Element(c, null);
        size = size +1;
    }

    @Override
    public char pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (size == 1) {
            char r = head.v;
            head = null;
            size--;
            return r;
        }

        Element it = head;
        for(int i = 0; i < size-2; i++) {
            it = it.next;
        }
        char r = it.next.v;
        it.next = null;
        size--;
        return r;
    }

    @Override
    public int size() {
        return size;
    }
}
