package Lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int opt = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");

        @SuppressWarnings("unused")
        int opt1 = JOptionPane.showOptionDialog(
            null,                                  
            "Do you want to change to the first class ticket?", 
            "Main",                                // Title
            JOptionPane.DEFAULT_OPTION,                  // Option type
            JOptionPane.QUESTION_MESSAGE,                // Message type
            null,                                   // Icon
            new Object[]{"I do", "I don't"},             // Options
            "Yes"                           // Initial selection value
        );
        JOptionPane.showMessageDialog(null, "You've chosen: " + (opt == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
/*
1. What happens if users choose “Cancel”? -> System will print "You've chosen: No" because in the coditional command if the users don't choose Yes, it will return No
2. How to customize the options to users, e.g. only two options: “Yes” and “No”, OR “I do” and “I don’t”:
-> Use JOptionPane.showOptionDialog instead of JOptionPane.showConfirmDialog and change the Options value to new Object[]{"I do", "I dont"}*/ 
}
