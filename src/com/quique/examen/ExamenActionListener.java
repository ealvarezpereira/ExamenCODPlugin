/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
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
    public void actionPerformed(ActionEvent e) {
        
        
        
        
        
    }
}
