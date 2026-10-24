package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MainTeleOp")
public class MainTeleOp extends OpMode {

    private Drivetrain drivetrain;

    @Override
    public void init() {
        drivetrain = new Drivetrain(hardwareMap);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    @Override
    public void loop() {
        double drive = -gamepad1.right_stick_y;
        double turn = gamepad1.left_stick_x;

        drivetrain.arcadeDrive(drive, turn);

        telemetry.addData("Drive", drive);
        telemetry.addData("Turn", turn);
        telemetry.update();
    }

    @Override
    public void stop() {
        drivetrain.stop();
    }
}