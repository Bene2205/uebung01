package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    private char [] ca = new char[0];

    @Override
    public void push(char c) {
        char[] caNew = new char[ca.length +1];
        System.arraycopy(ca, 0, caNew, 1, ca.length);
        caNew[0] = c;
        ca = caNew;
    }

    @Override
    public char pop() {
        if (ca.length == 0) {
            throw new NoSuchElementException();
        }

        char[] caNew = new char[ca.length -1];
        System.arraycopy(ca, 1, caNew, 0, ca.length -1);
        char value = ca[0];
        ca = caNew;
        return value;
    }

    @Override
    public int size() {
        return ca.length;
    }
}
