interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default void getHeightInKm() {
        System.out.println(getHeight()/ 60.0);
    }

}