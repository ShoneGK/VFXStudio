import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

public class App extends JFrame {

    public App() {

        JPanel cp = new JPanel(new BorderLayout());
        
        RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
        
        changeStyleProgrammatically(textArea);

        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea, true, new Color(133, 133, 133));
        cp.add(sp);
        setContentPane(cp);
        setTitle("Text Editor Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        // Start all Swing applications on the EDT.
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }

    // change style programmatically
    private static void changeStyleProgrammatically(RSyntaxTextArea textArea) {
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
        textArea.setCodeFoldingEnabled(true);
        textArea.setAntiAliasingEnabled(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setCaretColor(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setMatchedBracketBGColor(new Color(40, 40, 40));
        textArea.setMatchedBracketBorderColor(Color.LIGHT_GRAY);
        //textArea.setCurrentLineHighlightColor(new Color(40, 40, 40));
        textArea.setCurrentLineHighlightColor(new Color(30, 30, 30));
        textArea.setBackground(new Color(30, 30, 30));
    }
}