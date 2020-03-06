package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private final int numRows,numColumns;

/*
 #1 More generic  is the Collection interface
 The Collection interface contains methods that perform basic operations
 such as int size(), boolean isEmpty(), boolean contains(Object element), boolean add(E element), boolean remove(Object element), and Iterator<E> iterator().
 #2 The List interface is a ordered collection that may contain duplicates that has operations for:
Positional access (get), Search (indexOf), Iteration (ListIterator), Range-view (sublist)
 #3 The Set interface is a A collection that contains no duplicate elements.
 For this Set interface places additional stipulations on constructors (no duplicate elements) and on Add, Equals and HashCode
*/

/*
 List interface
 notice how we can interchage the type of list between ArrayList and LinkedList
 This is because both implement the same List Interface
*/
private List<Seat> seatList = new ArrayList<>();
 //private List<Seat> seatList = new LinkedList<>();
/*
    Set interface
 Notice that when using the HashSet we get the elements in a different order
    private Collection<Seat> seatList = new HashSet<>();
 Notice that when using the LinkedHashSet we get the elements in correct order
private Collection<Seat> seatList = new LinkedHashSet<>();
*/

    public Theatre(String theatreName, int numRows, int numColumns) {

        this.theatreName = theatreName;
        this.numRows=numRows;
        this.numColumns=numColumns;
        char alphabet='A';
        for (int i = 0; i <numRows ; i++) {
            for (int j = 0; j <numColumns ; j++) {
                String identifier=((char)(alphabet+i))+String.valueOf(j+1);
                seatList.add(new Seat(identifier));
            }

        }
    }



    public void printTheatreReservations() {
        System.out.println("Theatre "+this.theatreName+" seat list is: ");
        printSeatList(this.seatList);
    }

    public List<Seat> getSeatList(){
        return seatList;
    }

    // the collections bulk constructor only makes shallow copies (shared objects)
    public List<Seat> makeShallowCopy(){
        return new ArrayList<>(seatList);
    }

    public List<Seat> reverseSeatList(){
        Collections.reverse(seatList);
        return seatList;
    }

    public List<Seat> shuffleSeatList(){
        Collections.shuffle(seatList);
        return seatList;
    }

    public void prettyPrintSeatList(List<Seat> seatList){
        int index=0;
        System.out.println("-------------------------------------------");
        for(int i=0; i< numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(seatList.get(index).getIdentifier());
                if(seatList.get(index).isReserved()) System.out.print("X");
                else System.out.print("V");
                System.out.print(" ");
                index++;
            }
            System.out.println();
        }
        //printMinMax();
        System.out.println("-------------------------------------------");
    }

    public void printSeatList(List<Seat> seatList){
        for (Seat s:seatList){
            System.out.println(s.toString());
        }
    }

    private void printMinMax(){
        System.out.println("Min of seat list: " +Collections.min(seatList));
        System.out.println("Max of seat list: " +Collections.max(seatList));
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
        /*
        The binarySearch algorithm searches for a specified element in a sorted List.
         binary search is the fastest way to search in a sorted list O(log n)
         {@link https://docs.oracle.com/javase/tutorial/collections/algorithms/index.html#searching }
        */
        int reserveSeatIndex = Collections.binarySearch(seatList,reserveSeat,null);
        if(reserveSeatIndex>=0){
            System.out.println("Reserved the seat"+ seatNumber);
            return seatList.get(reserveSeatIndex).setReserved();

        }
        else System.out.println("Seat: "+seatNumber +" was not found");
        return false;
    }



    //Notice that T element implements the Comparable<T> interface
    class Seat implements Comparable<Seat>{
        private final String identifier;
        private boolean isReserved;

        public String getIdentifier() {
            return identifier;
        }

        public Seat(String identifier) {
            this.identifier = identifier;
            isReserved=false;
        }

        public boolean setReserved() {
           return isReserved = true;
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
