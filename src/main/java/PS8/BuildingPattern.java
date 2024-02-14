package PS8;

import java.util.function.Consumer;

public class BuildingPattern {

	 int ram, storage;
	    int battery;
	    int camera;
	    String processor;
	    double screenSize;

	    public BuildingPattern with(Consumer<BuildingPattern> buildFields) {
	        buildFields.accept(this);
	        return this;
	    }

	    public Mobile createMobile() {
	        return new Mobile(this);
	    }

	    public static void main(String[] args) {
	        BuildingPattern mobileBuilder = new BuildingPattern();

	        // Place a mobile order based on parameters
	        Mobile mobile = mobileBuilder
	                .with(builder -> builder.ram = 4)
	                .with(builder -> builder.storage = 0)
	                .with(builder -> builder.battery = 4000)
	                .with(builder -> builder.camera = 0)
	                .with(builder -> builder.processor = "A12 Bionic")
	                .with(builder -> builder.screenSize = 0.0)
	                .createMobile();

	        // Print specifications
	        System.out.println(mobile);
	    }
}
