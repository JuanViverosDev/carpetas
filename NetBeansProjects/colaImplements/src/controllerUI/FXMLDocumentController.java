/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerUI;

import datos.Productos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import modelo.Cola;
import modelo.OperacionesCola;



/**
 *
 * @author juan_jose.viveros
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField name;
    
    @FXML
    private TextField cantidad;
    
    @FXML
    private TextField precio;
    
    @FXML
    private WebView webView;        
            
    WebEngine webEngine;
    
    Cola<Productos> colaP;
    
    
    @FXML
    private void handleAdd(ActionEvent event) {
        String nombre = name.getText();
        String cant = cantidad.getText();
        String valor = precio.getText();
        
        Productos elemento = new Productos(nombre, Integer.parseInt(cant), Double.parseDouble(valor));
        colaP.encolar(elemento);
        
    }
    
    @FXML
    private void handleRemove(ActionEvent event) {
        colaP.desencolar();
        
    }
    
    public String order(Cola<Productos> laCola){
        String res = "";
        Cola<Productos> Cola = laCola;
        
        Productos elemento = new Productos();
        res  += "<tr>" + "<td>" + elemento.getNombre() + "<td>" + "<td>" + elemento.getCantidad() + "<td>" + "<td>" + elemento.getValor() + "<td>"  + "<td>"+ "</tr>";
     
        return res;
    }
    
    
    @FXML
    private void handleShow(ActionEvent event) {
       Cola<Productos> colaD = OperacionesCola.pilaDuplicada(colaP);
        String table = "<html>"+
                        "<head>" +
                            "<title> Pilas </title>" +
                            "<meta charset='UTF-8'>" +
                        "</head>" +
                        "<table>" + 
                            "<tr>" +
                                "<td>" + "Nombre" + "<td>"+
                                "<td>" + "Cantidad" + "<td>"+
                                "<td>" + "Precio" + "<td>"+ "</tr>"+
                                order(colaD) +
                        "</table>"+
                    "</html>";
        
        webEngine.loadContent(table);
    }
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        webEngine = webView.getEngine();
        colaP = new Cola<>();
        
    }    
    
}
