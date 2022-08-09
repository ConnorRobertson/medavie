public class CeilingFan {
    private int speed = 0; //How fast is the fan spinning 3 speeds and off.
    private boolean isReversed = false; //Is the fan's direction reversed.

    public boolean isReversed(){ //Checks if it is reversed
        return this.isReversed;
    }
    public int getSpeed(){ //Checks how fast it is
        return this.speed;
    }
    public void pullSpeedCord(){  //Lets you pull the speed cord
        this.speed++;
        if(this.speed == 4){
            this.speed = 0;
        }
    }
    public void pullDirectionCord(){ //Lets you change fan's direction
        this.isReversed = !this.isReversed;
    }

    @Override
    public String toString(){ //Changes how the class is print
        String direction ="";
        if(this.isReversed) direction = "reversed!";
        if(!this.isReversed) direction = "not reversed!";
        return "The fan is currently on speed " + this.speed + " and its direction is currently " + direction;
    }
}
