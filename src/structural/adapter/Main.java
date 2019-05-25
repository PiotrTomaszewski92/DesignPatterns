package structural.adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Music from radio: on.");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);
        //=========================
        UKDevice englishRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Music from English radio: on");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(englishRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(englishRadio);
        continentalSocket.plugIn(adapter);
    }
}

