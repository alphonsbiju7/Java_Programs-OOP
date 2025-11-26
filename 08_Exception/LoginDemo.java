import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginDemo {
    private JLabel l1, l2, l3;
    private JTextField t1;
    private JPasswordField t2;
    private JButton login, reset;

    LoginDemo() {
        JFrame f = new JFrame("Login");
        JPanel p = new JPanel(new GridLayout(3, 2, 10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        l1 = new JLabel("Username:");
        t1 = new JTextField();
        l2 = new JLabel("Password:");
        t2 = new JPasswordField();
        login = new JButton("Login");
        reset = new JButton("Reset");
        l3 = new JLabel("", SwingConstants.CENTER);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial", Font.BOLD, 14));

        p.add(l1); p.add(t1);
        p.add(l2); p.add(t2);
        p.add(login); p.add(reset);

        f.add(p, BorderLayout.CENTER);
        f.add(l3, BorderLayout.SOUTH);

        login.addActionListener(e -> {
            String username = t1.getText();
            String password = new String(t2.getPassword());
            if (username.equals("admin") && password.equals("1234")) {
                l3.setText("Login successful!");
                l3.setForeground(new Color(0, 128, 0)); // Green
            } else {
                l3.setText("Invalid credentials.");
                l3.setForeground(Color.RED);
            }
        });

        reset.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            l3.setText("");
        });

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // Center the frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginDemo::new);
    }
}
