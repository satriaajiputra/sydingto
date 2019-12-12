/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sydingto.res;

import java.awt.Font;

/**
 *
 * @author satmaxt
 */
public class Fonts extends java.awt.Font {
    
    public static final String FONT = "Lato";
    public static final Font FONT_BOLD_36 = new Font(FONT, Font.BOLD, 36);
    public static final Font FONT_BOLD_14 = new Font(FONT, Font.BOLD, 14);
    public static final Font FONT_PLAIN_14 = new Font(FONT, Font.PLAIN, 14);
    
    public Fonts() {
        super("Lato", Font.PLAIN, 14);
    }
}
