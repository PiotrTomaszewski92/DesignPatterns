package structural.flyweight;

import structural.flyweight.units.Destroyer;
import structural.flyweight.units.Rifleman;
import structural.flyweight.units.TeslTank;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        for(int i = 9; i<1000; i++){
            activeUnits.add(new TeslTank("Tesla Tank",200,100,50,25,0,0,500));
            activeUnits.add(new Rifleman("Rifleman",25,5,20,25,0,0,50));
            activeUnits.add(new Destroyer("Destroyer",500,250,70,10,0,0,800));
        }
    }
}

