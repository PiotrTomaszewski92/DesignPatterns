package creational.factory;

import creational.factory.units.Unit;
import creational.factory.units.UnitFactory;
import creational.factory.units.UnitType;

public class Main {

    UnitFactory unitFactory = new UnitFactory();
    Unit tank = unitFactory.createUnit(UnitType.TANK);
    Unit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);

}
