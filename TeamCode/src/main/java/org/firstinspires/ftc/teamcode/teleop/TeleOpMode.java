package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.core.Bot;

@TeleOp(name = "insert name here")
public class TeleOpMode extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Bot.init(hardwareMap);
        GamepadEx driverOp = new GamepadEx(gamepad1); // driver

        waitForStart();

        while (opModeIsActive()) {
            //code goes here
        }
    }
}
