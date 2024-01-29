package org.example.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import org.example.Client.Client;

public class ClientFormController {

    public JFXButton btnSend;
    public JFXTextField txtField;
    public javafx.scene.layout.VBox VBox;
    public ImageView imgSelection;
    public Label lblUsername;
    private Client client;

    public ClientFormController() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void btnSendOnAction(ActionEvent actionEvent) {

    }

    public void imgChooseOnAction(MouseEvent mouseEvent) {

    }
}
