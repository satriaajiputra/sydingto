/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sydingto.events;

import sydingto.res.Colors;
import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 *
 * @author satmaxt
 */
public interface Buttons {    
    default void onHoverButtonTransparent(MouseEvent evt) {
        evt.getComponent().setForeground(Colors.HEADING_COLOR);
    }
    default void onHoverOutButtonTransparent(MouseEvent evt, Color color) {
        evt.getComponent().setForeground(color);
    }
    
    default void onHoverButtonPrimary(MouseEvent evt) {
        evt.getComponent().setBackground(Colors.PRIMARY_COLOR_HOVER);
    }
    default void onHoverOutButtonPrimary(MouseEvent evt) {
        evt.getComponent().setBackground(Colors.PRIMARY_COLOR);
    }
}
