package com.Section7.OOP2_Composition_Encapsulation_Polymorphism;

public class Main {
    public static void main(String[] args) {
        testRoom();
    }

    private static void testRoom(){
        Dimension bedRoomDimension = new Dimension(2,14,10,0);
        Dimension bedRoomWindowDimension = new Dimension(1.5,1.2,0,0);
        Window bedRoomwindow = new Window(bedRoomWindowDimension,false);
        Dimension bedRoomDoorDimension = new Dimension(1.8,0.6,0,0);
        Door bedRoomDoor = new Door(bedRoomDoorDimension,false);
        Dimension bedDimension = new Dimension(0.5,1.8,0,2.0);
        Dimension bedSheetsDimension = new Dimension(0,2.5,0,2.5);
        BedSheets sheets = new BedSheets(bedSheetsDimension,"Cotton","Blue");
        Bed bed = new Bed(bedDimension,"Wood",sheets);
        NightLamp lamp = new NightLamp("White");
        Dimension closetDimension = new Dimension(2.0,3.0,1,0);
        Dimension closetBedRoomDoorDimension = new Dimension(2.0,1,0.05,0);
        Door closetBedRoomDoor = new Door(closetBedRoomDoorDimension,false);
        Closet closet = new Closet(closetDimension,closetBedRoomDoor);
        Bedroom bedRoom = new Bedroom(bedRoomDimension, bedRoomwindow, bedRoomDoor, bed, lamp, closet);

        bedRoom.getCloset().getClosetDoor().setOpen(true);
        bedRoom.getLamp().setOn(true);
        bedRoom.getTheWindow().setOpen(true);

    }
}
