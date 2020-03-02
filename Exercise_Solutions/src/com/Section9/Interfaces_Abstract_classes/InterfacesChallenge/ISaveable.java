package com.Section9.Interfaces_Abstract_classes.InterfacesChallenge;



// This interface allows an object to be saved to some sort of storage medium.
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).

import java.util.List;

public interface ISaveable<T> {
    List<T> readData();
       void      writeData(List<T> toWrite);
}
