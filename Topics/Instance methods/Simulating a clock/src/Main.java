class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes++;
        // implement me
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }

        if (hours == 13) {
            minutes = 0;
            hours = 1;
        }
    }
}