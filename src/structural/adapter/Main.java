package structural.adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Music from radio: on.");
            }
        };
        UKDevice englishRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Music from English radio: on");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        TwoWayAdapter adapter = new TwoWayAdapter(englishRadio,continentalRadio);
        continentalSocket.plugIn(adapter); //odpalamy radio angielskie
        ukSocket.plugIn(adapter); //odpalamy polskie radio

    }
}

