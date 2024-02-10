package app.controller;

import app.exception.InputException;
import app.exception.UnreachableHeightException;
import app.model.AppModel;
import app.util.InputValidator;
import app.view.AppView;

public class AppController {

    private final AppView appView = new AppView();
    private final InputValidator inputValidator = new InputValidator();
    private final AppModel appModel = new AppModel();

    public void startApp(){
        String data = appView.getInput();
        try{
            appView.printOutput(
                    appModel.takeAirReadings(Integer.parseInt(inputValidator.validate(data)))
            );
        }catch (InputException | UnreachableHeightException e){
            appView.printOutput("Error:\n" + e.getMessage());
        }catch (Exception e){
            appView.printOutput("An unexpected exception occurred: " + e.getMessage());
        }
    }

}
