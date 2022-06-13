package com.tubz.test;

class FanOnCommand implements Command {
    private Fan myFan;

    public FanOnCommand(Fan F) {
        myFan = F;
    }

    public void execute() {
        myFan.startRotate();
    }
}
