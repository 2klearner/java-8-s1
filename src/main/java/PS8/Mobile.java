package PS8;


class Mobile {
    int ram, storage;
    int battery;
    int camera;
    String processor;
    double screenSize;

    public Mobile(BuildingPattern builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    @Override
    public String toString() {
        return "Specifications - RAM: " + ram +
                " Storage: " + storage +
                " Battery: " + battery +
                " Camera: " + camera +
                " Processor: " + processor +
                " Display: " + screenSize;
    }
}
