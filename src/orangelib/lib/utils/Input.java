import java.awt.Component; 
import java.awt.event.*;

public class Input implements KeyListener {        
        /** 
         * Assigns the newly created InputHandler to a Component 
         */ 
        public InputHandler(Component c) { 
                c.addKeyListener(this); 
        } 
        
        /** 
         * Checks whether a specific key is down 
         */ 
        public static boolean isKeyDown(int keyCode) { 
                if (keyCode > 0 && keyCode < 256) { 
                        return keys[keyCode]; 
                } 
                
                return false; 
        } 
        
        /** 
         * Called when a key is pressed while the component is focused 
         */ 
        public static void keyPressed(KeyEvent e) { 
                if (e.getKeyCode() > 0 && e.getKeyCode() < 256) { 
                        keys[e.getKeyCode()] = true; 
                } 
        } 

        /** 
         * Called when a key is released while the component is focused 
         * @param e KeyEvent sent by the component 
         */ 
        public void keyReleased(KeyEvent e) { 
                if (e.getKeyCode() > 0 && e.getKeyCode() < 256) { 
                        keys[e.getKeyCode()] = false; 
                } 
        } 
}
