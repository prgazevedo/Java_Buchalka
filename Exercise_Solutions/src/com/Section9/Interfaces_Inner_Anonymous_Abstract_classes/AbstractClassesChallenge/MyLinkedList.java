package com.Section9.Interfaces_Inner_Anonymous_Abstract_classes.AbstractClassesChallenge;

import java.util.List;

public class MyLinkedList implements ILinkedList {
    private ListItem root;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (listItem == null) return false;
        if (this.root == null) {
            this.root = listItem;
            return true;
        }
        else {
            ListItem traversing = this.root;
            while (traversing != null) {
                if (traversing.compareTo(listItem) < 0){
                    if(traversing.next()==null) {
                        //add to the end
//                        traversing.setNext(listItem);
//                        listItem.setPrevious(traversing);
//                        listItem.setNext(null);
                        traversing.setNext(listItem).setPrevious(traversing);
                        listItem.setNext(null);
                        return true;
                    }
                    else{
                        //move to next
                        traversing = traversing.next();
                    }
                }
                else if (traversing.compareTo(listItem) == 0) {
                    System.out.println("This item is already present in the list: "+listItem);
                    return false; //found same
                }
                else {
                    //this item is bigger so add before
                    if(traversing.previous!=null){
                        //another previous exists insert at middle
//                        traversing.previous().setNext(listItem);
//                        listItem.setPrevious(traversing.previous());
//                        listItem.setNext(traversing);
//                        traversing.setPrevious(listItem);

                        //can be replaced with terse calls.
                        traversing.previous().setNext(listItem).setPrevious(traversing.previous());
                        listItem.setNext(traversing).setPrevious(listItem);

                        return true;
                    }else{
                        //no previous exists this will become the root
                        traversing.setPrevious(listItem).setNext(traversing);
//                        listItem.setNext(traversing);
                        this.root=listItem;
                        return true;
                    }

                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if ( listItem == null)  System.out.println("listItem cannot be null");
        else if(this.root ==null) System.out.println("root is null - list is empty");
        else {
            ListItem traversing = this.root;
            while (traversing != null) {
                if (traversing.compareTo(listItem) < 0) {
                    traversing = traversing.next();
                }
                else if (traversing.compareTo(listItem) == 0) {
                    //Found item so we can remove it
                    //System.out.println(("Removing item: "+listItem.get().toString()));
                    //root special case
                    if(traversing == this.root) this.root = traversing.next();
                    //end special case
                    else if(traversing.next()==null) traversing.previous().setNext(null);
                    else traversing.previous().setNext(traversing.next()).setPrevious(traversing.previous());
                    return true;
                }
                else {
                    return false;
                }
            }

        }

        return false;

    }

    @Override
    public void traverse(ListItem root) {
        while(root!=null){
            System.out.println("Traverse is at: "+root.toString());
            root=root.next();
        }
        if(root==null) System.out.println("List is empty");

    }
}
