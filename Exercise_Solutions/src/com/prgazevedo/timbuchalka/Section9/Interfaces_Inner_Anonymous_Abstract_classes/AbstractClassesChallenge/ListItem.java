package com.prgazevedo.timbuchalka.Section9.Interfaces_Inner_Anonymous_Abstract_classes.AbstractClassesChallenge;

public abstract class ListItem  {
    protected ListItem next;
    protected ListItem previous;
    protected Object item;

    public Object get() {
        return item;
    }

    public void set(Object item) {
        this.item = item;
    }


    public ListItem(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "item=" + item +
                '}';
    }

    public abstract int compareTo(ListItem listItem);

    public abstract ListItem next();
    public abstract ListItem previous();
    public abstract ListItem setNext(ListItem next);
    public abstract ListItem setPrevious(ListItem previous);


}
