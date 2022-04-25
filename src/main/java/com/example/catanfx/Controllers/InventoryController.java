package com.example.catanfx.Controllers;

import com.example.catanfx.GamePieces.Cards.ResourceCard;
import com.example.catanfx.GamePieces.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class InventoryController {

    @FXML
    private Button X;

    @FXML
    private AnchorPane pane;

    @FXML
    private GridPane IVpics;

    Stage stage;

    public void exitInventory(ActionEvent e) throws IOException {
        stage = (Stage)pane.getScene().getWindow();
        stage.close();
    }

    public void updateInventory(Player p){
        LinkedList<ResourceCard> hand = p.getRC();
        int index = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(hand.get(index).getFront() != null) {
                    IVpics.add(hand.get(index).getFront(), i, j);
                    index++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("bruh");



    }

}
