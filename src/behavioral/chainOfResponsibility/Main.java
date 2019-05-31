package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować!",0,OfficerRank.CAPTAIN);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();
        //set chain of responsibility
        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);
        //send message
        sergeant.processMessage(message);
    }
}
