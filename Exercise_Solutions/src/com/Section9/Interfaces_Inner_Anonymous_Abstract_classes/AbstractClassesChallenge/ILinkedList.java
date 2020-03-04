package com.Section9.Interfaces_Inner_Anonymous_Abstract_classes.AbstractClassesChallenge;

import java.util.List;

public interface ILinkedList {
    ListItem getRoot();
    boolean addItem(ListItem listItem);
    boolean removeItem(ListItem listItem);
    void traverse(ListItem root);
}
