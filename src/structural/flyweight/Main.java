package structural.flyweight;

import structural.flyweight.units.Destroyer;
import structural.flyweight.units.Rifleman;
import structural.flyweight.units.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        for(int i = 1; i<1000; i++){
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Rifleman(0,0));
            activeUnits.add(new Destroyer(0,0));
        }
    }
}

