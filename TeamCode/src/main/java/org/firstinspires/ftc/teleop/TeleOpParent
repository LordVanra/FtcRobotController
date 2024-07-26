package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.core.Bot;
import org.firstinspires.ftc.teamcode.library.DriveStyle;


public class TeleOpParent extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Bot.init(hardwareMap, true);
        GamepadEx driverOp = new GamepadEx(gamepad1);// driver

        waitForStart();

        MecanumDrive drive = new MecanumDrive(
                Bot.frontLeft,
                Bot.frontRight,
                Bot.backLeft,
                Bot.backRight
        );

        while (opModeIsActive()) {
            //code goes here
        }
    }
}
