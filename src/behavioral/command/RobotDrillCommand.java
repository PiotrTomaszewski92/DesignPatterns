package behavioral.command;

public class RobotDrillCommand implements Command {
    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {
        //some impl.
    }
}

