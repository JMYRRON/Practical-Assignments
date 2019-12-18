package com.epam.model;

import com.epam.model.entities.*;

public class Generator{
    public static Toy[] generateToys(){
        Toy[] toys = new Toy[12];
        toys[0] = new AnimalDoll("Teady",4,10);
        toys[1] = new HumanDoll("Suzy",7,15);
        toys[2] = new Car("BMW",10,20);
        toys[3] = new Robot("Terminator",8,12);
        toys[4] = new AnimalDoll("Piggy",2,18);
        toys[5] = new HumanDoll("Bella",1,3);
        toys[6] = new Car("Ford",13,27);
        toys[7] = new Robot("RoboCop",5,9);
        toys[8] = new AnimalDoll("Zebra",1,11);
        toys[9] = new HumanDoll("Cinderella",1,10);
        toys[10] = new Car("Ferrari",10,22);
        toys[11] = new Robot("BamblBe",8,16);

        return toys;
    }


}




/*AnimalDoll[] toys1 = new AnimalDoll[]{
        new AnimalDoll("Piggy",2,18),
        new AnimalDoll("Zebra",1,11),
        new AnimalDoll("Teady",4,10),
        new AnimalDoll("Leo",2,18),
    };
    HumanDoll[] toys2 = new HumanDoll[]{
            new HumanDoll("Suzy",7,15),
            new HumanDoll("Bella",1,3),
            new HumanDoll("Cinderella",1,10),
            new HumanDoll("Lilly",4,10)
    };
    Car[] toys3 = new Car[] {
            new Car("BMW",10,20),
            new Car("Ford",13,27),
            new Car("Ferrari",10,22),
            new Car("UAZ",10,25)
    };
    Robot[] toys4 = new Robot[4];*/