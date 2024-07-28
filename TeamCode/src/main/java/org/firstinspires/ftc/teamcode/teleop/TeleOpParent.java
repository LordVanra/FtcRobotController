package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class TeleOpParent extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Bot.init(hardwareMap, true);
        GamepadEx driverOp = new GamepadEx(gamepad1);// driver

        waitForStart();

        while (opModeIsActive()) {
            //code goes here
        }
    }
}
