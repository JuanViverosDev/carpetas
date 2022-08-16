/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerUI;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import modelo.Punto2D;

/**
 *
 * @author juan_jose.viveros
 */
public class FXMLDocumentController implements Initializable {
    
    LinkedList<Punto2D> losPuntos;
    
    @FXML
    private Label label;
    
    @FXML
    private Canvas idCanvas;
    
    public GraphicsContext graphicContext;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void getCoords(MouseEvent event){
        double x = event.getX();
        double y = event.getY();
        
        Punto2D obj = new Punto2D(x, y);
        losPuntos.add(obj);
        
        System.out.println("x: " + x + " " + "y: " + y);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        graphicContext = idCanvas.getGraphicsContext2D();
        double h = idCanvas.getHeight();
        double w = idCanvas.getWidth();
        graphicContext.strokeRect(0, 0, w, h);
        
        losPuntos = new LinkedList<>();
    }    
    
}
