package frc.team10505.robot;

public class Constants {
    public class HardwareConstants{
        //Can ids. Id's 40-51 are used in the drivetrain.
         /*Robo Rio ports/channels */
    public final static int DRIVETRAIN_BLINKY_LIGHT_CHANNEL = 0;

    /*CAN IDS */
    public final static int CORAL_LEFT_MOTOR_ID = 2;
    public final static int CORAL_RIGHT_MOTOR_ID = 3;

    public final static int ALGAE_INTAKE_MOTOR_ID = 7;
    public final static int ALGAE_PIVOT_MOTOR_ID = 8;

    public final static int ELEVATOR_MOTOR_ID = 10;
    public final static int ELEVATOR_FOLLOWER_MOTOR_ID = 11;

    /*40-51 can ids are used in the drivetrain */

    public final static int DRIVETRAIN_RIGHT_LASER_ID = 52;
    public final static int DRIVETRAIN_LEFT_LASER_ID = 53;
   
    public final static int CORAL_IN_LASER_ID = 60;
    public final static int CORAL_OUT_LASER_ID = 61;

    /*Current Limits */   
    public final static int ALGAE_PIVOT_MOTOR_CURRENT_LIMIT = 15;
    public final static int ALGAE_INTAKE_MOTOR_CURRENT_LIMIT = 25;

    public final static int CORAL_MOTOR_CURRENT_LIMIT = 15;

    public final static int ELEVATOR_MOTOR_CURRENT_LIMIT = 40;

    /*Encoder Offsets */
    public final static double ALGAE_PIVOT_ENCODER_OFFSET = 0;
    public final static double ALGAE_PIVOT_ENCODER_SCALE = 360;

    /*Gearstacks */
    public final static double ELEVATOR_GEARSTACK = 12;
    public final static double ALGAE_PIVOT_GEARSTACK = 80;
    }

    public class AlgaeConstants{
        //TODO burgle speed and angles from season code
    }

    public class CoralConstants{
       public final static double kIntakeSpeed = 0.37;
       public final static double kOutakeSpeed = 0.25;
       public final static double kLeftL1Speed = 0.5;
       public final static double kRightL1Speed = 0.25;
       public final static double kOutakeTopSpeed = 0.2;
       public final static double kTroughSpeed = 0.30;
       
    }

    public class ElevatorConstants{
    }   //TODO burgle heights from season code


}
