package herramientas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class ImageImplement extends JPanel {

	private Image img;
	private int x;
	private int y;

	public ImageImplement(Image img, int x, int y) {
		this.x = x;
		this.y = y;
		this.img = img;

		Dimension size = new Dimension(750, 550);

		this.setPreferredSize(size);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setSize(size);
		this.setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, x, y, null);
	}

}
