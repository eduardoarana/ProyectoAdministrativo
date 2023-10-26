/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventTable;

import Vista.VistaAjustesES;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.w3c.dom.events.Event;

/**
 *
 * @author earana
 */
public class RowListiner implements ListSelectionListener ,KeyListener{

    Vista.VistaAjustesES vista;

    public RowListiner(VistaAjustesES vista) {
        this.vista = vista;
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {

        if (event.getValueIsAdjusting()) {
            return;
        }
           
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
   
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
