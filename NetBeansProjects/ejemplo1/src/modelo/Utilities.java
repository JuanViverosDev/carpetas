/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author juan_jose.viveros
 */
public class Utilities {
   public static boolean saveFile(LinkedList<Estudiante> le) throws IOException {
    boolean t = false;
       FileWriter filewriter = new FileWriter("estudiantes.txt");
       PrintWriter printWriter = new PrintWriter(filewriter);
       
       for (Estudiante le1 : le) {
           printWriter.println(bg.toStrin);
       }
   }
}

