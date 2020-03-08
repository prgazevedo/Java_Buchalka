package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets.EqualsOverrideProblem;

public class DogMain {

    public static void main(String[] args) {
        Dog tejo = new Dog("Tejo");
        Labrador tejo2 = new Labrador("Tejo");

        System.out.println(tejo.equals(tejo2));
        System.out.println(tejo2.equals(tejo));
    }
}
