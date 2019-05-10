package pl.awkwiecin.command.courseCommand.command;

import co.devfoundry.command.courseCommand.Robot;

public class RobotCutCommand implements Command{

    private Robot robot = new Robot();

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
