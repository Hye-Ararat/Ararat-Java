package gg.hye.arraratJava.desktop.app;

import net.skylix.elixor.desktop.window.Window;
import net.skylix.elixor.desktop.unit.Size;
import net.skylix.elixor.desktop.generic.Div;
import net.skylix.elixor.desktop.renderer.color.Color;

public class App {
    private static final Window win;
    
    public static void main(String[] args) {
        System.out.println("Desktop application is loading...");
        
        win = new Window("Hye Arrarat");
        
        win.setSize(new Size(1000, 600));
        win.moveToCenter();
        
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            final Div titleBar = win.getWindowsTitleBar();
            
            titleBar.setButtonCloseMouseOverColor(new Color(232, 97, 92, 255));
            titleBar.setButtonSizeMouseOverColor(new Color(232, 97, 92, 255));
            titleBar.setButtonMinimizeMouseOverColor(new Color(232, 97, 92, 255));
        }
        
        win.run();
    }
    
    public static Window getWindow() {
        return win;
    }
}
