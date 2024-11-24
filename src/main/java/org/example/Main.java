package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall northWall = new Wall("north");
        Wall southWall = new Wall("south");
        Wall westWall = new Wall("west");
        Wall eastWall = new Wall("east");
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("double", 2, 2, 2, 2);
        Carpet carpet = new Carpet(2, 2, PaintColor.RED);
        Wardrobe wardrobe = new Wardrobe(3, 3, 30);


        Bedroom bedroom = new Bedroom(northWall, southWall, westWall, eastWall, ceiling, lamp, carpet, "firstBedroom", bed, wardrobe);

        bedroom.createBedroom();
    }
}