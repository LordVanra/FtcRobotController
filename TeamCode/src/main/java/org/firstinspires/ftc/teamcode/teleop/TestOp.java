package org.firstinspires.ftc.teamcode.teleop;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@Config // This allows you to use the FTC Dashboard to monitor information easily
@TeleOp(name = "TestOp") // the name is what shows up on your phone/driver hub
public class TestOp extends LinearOpMode {

    //Initial Settings: DO NOT TOUCH
    public static double P, I, D;
    public static int targetPos = 0;
    public static int error = 50;
    PIDController armController = new PIDController(P, I, D);


    @Override
    public void runOpMode() throws InterruptedException {

        //Motor to PID
        DcMotor leftSlides = hardwareMap.get(DcMotor.class, "leftVert");
        //Use line below if you have 2 opposite motors that you need to PID
        //DcMotor rightSlides = hardwareMap.get(DcMotor.class, "rightVert");

        waitForStart();

        while (opModeIsActive()) {
            //Setup PID with each input value
            armController.setPID(P, I, D);

            //Calculate error
            error = targetPos+leftSlides.getCurrentPosition();

            //Use PID system to calculate power
            leftSlides.setPower( Range.clip(armController.calculate(0, error), -1, 1));
            //Use line below if you have 2 opposite motors that you need to PID
            //rightSlides.setPower( Range.clip(armController.calculate(0, -error), -1, 1));

            //Output and graph information
            telemetry.addData("power", Range.clip(armController.calculate(0, error), -1, 1));
            telemetry.addData("error", error);
            telemetry.update();
            telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        }
    }
}