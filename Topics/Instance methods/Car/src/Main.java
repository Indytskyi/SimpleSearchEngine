class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed+=5;
    }

    void brake() {
      //  speed = Math.min(speed - 5, 0);
        speed-=5;
        if (speed < 0) {
            speed = 0;
        }
    }

}