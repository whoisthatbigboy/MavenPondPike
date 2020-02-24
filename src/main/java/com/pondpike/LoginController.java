package com.pondpike;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class LoginController {

    private Stage LoginStage;


    @FXML
    private void signUpClicked() throws IOException {
        App.setRoot("PondPikeSignUp");
    }
}
