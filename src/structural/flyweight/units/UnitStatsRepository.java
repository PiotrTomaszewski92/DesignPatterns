package structural.flyweight.units;

public class UnitStatsRepository {

    private static UnitStats destroyerStats
            = new UnitStats("Destroyer",500,250,70,10,800);
    private static UnitStats teslaTankStats
            = new UnitStats("Tesla Tank",200,100,50,25,500);
    private static UnitStats riflemanStats
            = new UnitStats("Rifleman",25,5,20,25,50);

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getTeslaTankStats(){
        return teslaTankStats;
    }

    public static UnitStats getRiflemanStats(){
        return riflemanStats;
    }
}


