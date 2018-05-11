/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.quique.examen.ExamenActionListener"
)
@ActionRegistration(
        iconBase = "com/quique/examen/if_Flow_block_131774.png",
        displayName = "#CTL_ExamenActionListener"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 0)
    ,
  @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_ExamenActionListener=Examen")

public final class ExamenActionListener implements ActionListener {

    @Override

    /**
     * @param outdir Es la direccion donde guardamos el archivo
     * @param outfile nombre del archivo que vamos a crear
     * @param bcategory categoria donde se instalara el archivo en caso de instalarlo
     * @param srcdir direccion del .jar
     * @param srcfiles archivo .jar
     * @param appclass clase de la aplicacion
     * @param nametitle titulo y nombre del archivo
     */
    public void actionPerformed(ActionEvent e) {

        //Pedimos todas las variables        
        String outdir = JOptionPane.showInputDialog("Direccion de salida (outdir)");
        String outfile = JOptionPane.showInputDialog("Nombre del archivo (outfile)");
        String bcategory = JOptionPane.showInputDialog("Categoria (category)");
        String srcdir = JOptionPane.showInputDialog("Direccion del src (srcdir)");
        String srcfiles = JOptionPane.showInputDialog("Archivo .jar (srcfiles)");
        String appclass = JOptionPane.showInputDialog("Clase de la aplicacion (appclass)");
        String nametitle = JOptionPane.showInputDialog("Titulo y nombre de la app");

        //Añadimos todo el comando a un String
        
                    String cmd = "javapackager -deploy -native deb "
                    + "-Bcategory="+bcategory 
                    + " -outdir " +outdir
                    + " -outfile "+ outfile
                    + " -srcdir "+srcdir
                    + " -srcfiles "+srcfiles
                    + " -appclass "+appclass
                    + " -name "+nametitle
                    + " -title "+nametitle;
                    
        try {
            
            //Creamos un objeto de tipo runtime
            
            Runtime rt = Runtime.getRuntime();
            //Le pasamos el comando que tiene que ejecutar
            Process pr = rt.exec(cmd);
            
            //Esto estaba en el ejemplo, si esta ahi es porque algo hace. No tengo ni idea.

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line = null;

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code " + exitVal);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
