package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues;

import java.util.*;

public class Theatre {
    private final String theatreName;


// #1 More generic  is the Collection interface
// The Collection interface contains methods that perform basic operations
// such as int size(), boolean isEmpty(), boolean contains(Object element), boolean add(E element), boolean remove(Object element), and Iterator<E> iterator().

// #2 The List interface is a ordered collection that may contain duplicates that has operations for:
//Positional access (get), Search (indexOf), Iteration (ListIterator), Range-view (sublist)

// #3 The Set interface is a A collection that contains no duplicate elements.
// For this Set interface places additional stipulations on constructors (no duplicate elements) and on Add, Equals and HashCode

// List interface
// notice how we can interchage the type of list between ArrayList and LinkedList
// This is because both implement the same List Interface
    private List<Seat> seatList = new ArrayList<>();
//    private List<Seat> seatList = new LinkedList<>();

//Set interface
// Notice that when using the HashSet we get the elements in a different order
//    private Collection<Seat> seatList = new HashSet<>();
// Notice that when using the LinkedHashSet we get the elements in correct order
//private Collection<Seat> seatList = new LinkedHashSet<>();

    public Theatre(String theatreName, int numRows, int numColumns) {
        this.theatreName = theatreName;
        char alphabet='A';
        for (int i = 0; i <numRows ; i++) {
            for (int j = 0; j <numColumns ; j++) {
                String identifier=((char)(alphabet+i))+String.valueOf(j+1);
                seatList.add(new Seat(identifier));
            }

        }
    }

    public void printReservations(){
        System.out.println("Theatre reservations for: "+this.theatreName);
        for (Seat s:seatList){
            System.out.println(s.toString());
        }

    }

//For use with List interface
//    public boolean reserveSeat(String seatNumber){
//        int index = seatList.indexOf(new Seat(seatNumber));
//        if(index!=-1){
//            Seat seat = seatList.get(index);
//            seat.setReserved(true);
//            System.out.println("Reserved the seat"+seat);
//            return true;
//        }
//        else System.out.println("Seat: "+seatNumber +" was not found");
//        return false;
//    }


//For use with Collection interface
//    public boolean reserveSeat(String seatNumber){
//        for (Seat s:seatList){
//            if(s.getIdentifier().equals(seatNumber)){
//                s.setReserved(true);
//                System.out.println("Reserved the seat"+s);
//                return true;
//            }
//        }
//        System.out.println("Seat: "+seatNumber +" was not found");
//        return false;
//    }



    //The List class can use a binary search which is more efficient
    //But for this the element has to implement the interface IComparable

    public boolean reserveSeat(String seatNumber){
        Seat reserveSeat = new Seat(seatNumber);

        //The binarySearch algorithm searches for a specified element in a sorted List.
        // {@link https://docs.oracle.com/javase/tutorial/collections/algorithms/index.html#searching }
        int reserveSeatIndex = Collections.binarySearch(seatList,reserveSeat,null);
        for (Seat s:seatList){
            if(s.getIdentifier().equals(seatNumber)){
                s.setReserved(true);
                System.out.println("Reserved the seat"+s);
                return true;
            }
        }
        System.out.println("Seat: "+seatNumber +" was not found");
        return false;
    }

    //Notice that T element implements the Comparable<T> interface
    private class Seat implements Comparable<Seat>{
        private final String identifier;
        private boolean isReserved;

        public String getIdentifier() {
            return identifier;
        }

        public Seat(String identifier) {
            this.identifier = identifier;
            isReserved=false;
        }

        public void setReserved(boolean reserved) {
            isReserved = reserved;
        }

        public boolean isReserved() {
            return isReserved;
        }

        @Override
        public String toString() {
            return "ID='" + identifier + '\'' +
                    ", RSV=" + isReserved ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Seat seat = (Seat) o;
            return Objects.equals(identifier, seat.identifier);
        }

        @Override
        public int hashCode() {
            return Objects.hash(identifier);
        }

        @Override
        public int compareTo(Seat o) {
            return this.identifier.compareToIgnoreCase(o.identifier);
        }
    }
}
