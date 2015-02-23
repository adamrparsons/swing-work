import javax.swing.*;

public class nope extends javax.swing.JFrame {
	
	public void nopeGUI () {
		initComponents();
	}

	private void initComponents() {
		JTextField text1 = new javax.swing.JTextField();
		JLabel nopeLabel = new javax.swing.JLabel();
		JLabel nopeLabel2 = new javax.swing.JLabel();
		JButton button1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("shit window system");
		
		nopeLabel.setText ("nope label 1");

		button1.setText("Action");
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonOneAction(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		     layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nopeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nopeLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
 
        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button1, text1});
 
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nopeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(nopeLabel2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
		

		pack();
		setVisible(true);

	}

	private void buttonOneAction(java.awt.event.ActionEvent evt) {
		System.out.println("Button 1 pressed");
	}

	public static void main (String [] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new nope().nopeGUI();
			}
		});
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new nope().nopeGUI();
			}
		});
	}
}