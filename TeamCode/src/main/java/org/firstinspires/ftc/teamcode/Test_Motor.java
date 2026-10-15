package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Teste Motor")
public class TesteMotor extends OpMode {

    private DcMotor motor;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");

        telemetry.addData("Status", "Inicializado");
        telemetry.update();
    }

    @Override
    public void loop() {
        double potencia = -gamepad1.left_stick_y;

        motor.setPower(potencia);

        telemetry.addData("Potencia", potencia);
        telemetry.update();
    }
}
