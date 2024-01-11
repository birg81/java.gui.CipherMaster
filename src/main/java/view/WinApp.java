package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import model.Cipher;
public class WinApp {
	private static final JFrame win = new JFrame("Cipher (Unkown)");
	private static final Container mainPane = new Container();
	private static final JPanel
		toolPane = new JPanel(),
		textPane = new JPanel();
	private static final JTextArea
		originalTxt = new JTextArea(),
		encrytedTxt = new JTextArea();
	private static final JTextField keyTxt = new JTextField("@");
	private static final JButton btnResetKey = new JButton("", new ImageIcon("img/eraser.png"));
	private static void reset(boolean resetText) {
		win.setTitle("Cipher (Unkown)");
		keyTxt.setText("");
		if (resetText) {
			originalTxt.setText("");
			encrytedTxt.setText("");
		}
	}
	private static void encrypting(boolean resetText) {
		if (keyTxt.getText().trim().length() > 0)
			win.setTitle("Cipher (key: " + keyTxt.getText().trim() + ")");
		else
			reset(resetText);
		if (keyTxt.getText().trim().length() > 0 && originalTxt.getText().trim().length() > 0)
			encrytedTxt.setText(
				Cipher.vigenere(
					originalTxt.getText(),
					keyTxt.getText().trim(), true
				)
			);
	}
	private static void drawWindow() {
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		win.setIconImage(Toolkit.getDefaultToolkit().getImage("img/key.png"));
		win.setBounds(100, 100, 350, 200);
		win.setResizable(false);
		btnResetKey.addActionListener(evt -> reset(true));
		btnResetKey.setBackground(new Color(0x4ba8de));
		keyTxt.setBackground(new Color(0xf1f7fc));
		keyTxt.setForeground(new Color(0x085387));
		keyTxt.setFont(new Font("Arial", Font.BOLD, 14));
		keyTxt.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				encrypting(true);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				encrypting(true);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				encrypting(true);
			}
		});
		encrytedTxt.setBackground(new Color(0x195d82));
		encrytedTxt.setForeground(new Color(0xdfeaf0));
		encrytedTxt.setFont(new Font("Arial", Font.BOLD, 16));

		originalTxt.setBackground(new Color(0xdfeaf0));
		originalTxt.setForeground(new Color(0x195d82));
		originalTxt.setFont(new Font("Arial", Font.BOLD, 16));
		originalTxt.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				encrypting(false);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				encrypting(false);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				encrypting(false);
			}
		});
		toolPane.setLayout(new BorderLayout());
		toolPane.add(btnResetKey, BorderLayout.WEST);
		toolPane.add(keyTxt, BorderLayout.CENTER);
		textPane.setLayout(new GridLayout(2, 1));
		textPane.add(originalTxt);
		textPane.add(encrytedTxt);
		mainPane.setLayout(new BorderLayout());
		mainPane.add(toolPane, BorderLayout.NORTH);
		mainPane.add(textPane, BorderLayout.CENTER);
		win.add(mainPane);
		win.setVisible(true);
	}
	public WinApp() {
		drawWindow();
	}
}