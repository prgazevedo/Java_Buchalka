package com.Section9.Interfaces_Inner_Anonymous_Abstract_classes.AbstractClassesChallenge;

import java.util.Objects;

public class Node extends ListItem {

    public Node(Object item) {
        super(item);
    }

    @Override
    public ListItem next() {
        return next;
    }

    @Override
    public ListItem previous() {
        return previous;
    }

    @Override
    public ListItem setNext(ListItem next) {
        this.next=next;
        return this.next;
    }

    @Override
    public ListItem setPrevious(ListItem previous) {
        this.previous=previous;
        return this.previous;
    }


    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListItem listItem = (ListItem) o;
        return Objects.equals(item.toString(), listItem.item.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }


    @Override
    public int compareTo(ListItem item) {
        if(item!=null){
            return -((String)item.get()).compareTo((String)this.get());
        }
        return -1;

    }
}
