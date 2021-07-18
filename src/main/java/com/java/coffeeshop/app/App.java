package com.java.coffeeshop.app;

import javax.swing.UIManager.LookAndFeelInfo;

import com.java.coffeeshop.frames.MainFrame;
import com.java.coffeeshop.app.init.Initialize;

/**
 *
 * @author sucrilho boladao
 */

public class App extends Initialize {

	public static void main(String[] args) {

		custumerDbStart();

		// MainFrame frame = new MainFrame();

		// frame.setSize(1280, 720);
		// frame.setVisible(false);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String osname = System.getProperty("os.name");

		try {

			if (osname.startsWith("Linux")) {

				for (LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}

				// javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

				// javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");

			} else if (osname.startsWith("Windows")) {

				for (LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}

				// javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
				// UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				// UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			} else if (osname.startsWith("Mac")) {

				for (LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}

				// javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.mac.MacLookAndFeel");

			} else {
				javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});

	}

}