package app.model;

import app.exception.UnreachableHeightException;

public class AppModel {

    public String takeAirReadings(int height) throws UnreachableHeightException{
        if (height < 120 || height > 355){
            throw new UnreachableHeightException(
                    "Air condition indicators can be taken at a height of 120 to 355 meters!"
            );
        }
        return "Air readings were successfully taken at an altitude of %d meters".formatted(height);
    }
}
