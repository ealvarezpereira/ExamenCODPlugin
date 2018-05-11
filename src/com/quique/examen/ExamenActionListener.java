/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.Console;
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
     *
     */
    public void actionPerformed(ActionEvent e) {

        String outdir = JOptionPane.showInputDialog("Direccion de salida (outdir)");
        String outfile = JOptionPane.showInputDialog("Nombre del archivo (outfile)");
        String bcategory = JOptionPane.showInputDialog("Categoria (category)");
        String srcdir = JOptionPane.showInputDialog("Direccion del src (srcdir)");
        String srcfiles = JOptionPane.showInputDialog("Archivo .jar (srcfiles)");
        String appclass = JOptionPane.showInputDialog("Clase de la aplicacion (appclass)");
        String nametitle = JOptionPane.showInputDialog("Titulo y nombre de la app");


    }
}
