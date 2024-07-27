package org.firstinspires.ftc.teamcode.component;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw{

    Servo claw;
    double targetPosition;
    
    @Override
    public void init(){
      claw = hwmap.get(Servo.class(), ¨claw¨);
    }

    public void open(){

    }

    public void close(){

    }

    public void update(){

    }
}
