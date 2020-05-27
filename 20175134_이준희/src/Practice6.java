import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame {
	public Practice6() {
		setTitle("������Frame�׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		ImageIcon cherry = new ImageIcon("cherry.jpg");
		String [] month = { "January", "February", "March", "April", "May", "June" };
		SpinnerListModel mmonth = new SpinnerListModel(month);
		String [] fruit = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry" };
		String [] name = { "kitae", "junhui", "mirae" };
		ImageIcon [] images = { new ImageIcon("home.png"), new ImageIcon("scope.png"), new ImageIcon("wifi.png"),
				new ImageIcon("key.png") };
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new Button("��ư"));
		c.add(new JCheckBox("���"));
		c.add(new JCheckBox("��", true));
		c.add(new JCheckBox("ü��", cherry));
		c.add(new JRadioButton("���"));
		c.add(new JRadioButton("��", true));
		c.add(new JRadioButton("ü��", cherry));
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		c.add(new JLabel(" �̸�:"));
		c.add(new JTextField("\t\t"));
		c.add(new JLabel(" �а�:"));
		c.add(new JTextField("\t\t"));
		c.add(new JLabel(" �ּ�:"));
		c.add(new JTextField("\t\t"));
		c.add(new JLabel(" Enter the password:"));
		c.add(new JPasswordField("1111"));
		c.add(new JLabel(" Month:"));
		c.add(new JSpinner(mmonth));
		c.add(new JTextArea("hello", 7, 20));
		c.add(new JComboBox<String>(fruit));
		c.add(new JComboBox<String>(name));
		JList<String> frt = new JList<String>(fruit);
		c.add(frt);
		c.add(new JList(images));
		JList<String> scr = new JList<String>(fruit);
		c.add(new JScrollPane(scr));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Practice6();

	}

}
