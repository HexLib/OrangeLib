package orangelib.lib.window;

import java.util.ArrayList;
import javac.swing.*;

public class ComponentManager {
    private ArrayList<Component> comps = new ArrayList<>();
    
    /**
     * ComponentManager.createComponent(Component comp);
     * 
     * uses the component specified to use it.
     */
    public static void createComponent(Component comp) {
        comps.add(comp);
    }
    
    public static boolean getComponent(Component comp) {
        if (comps.contains(comp)) {
            return true;
        } else {
            return false;
        }
    }
}
