import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bill extends JFrame 
{
	public static int total=0;
	JLabel lamount,bimage;
	Font b;
	bill()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\Bill1.jpeg");
		bimage=new JLabel(i);
		b=new Font("Serif",Font.BOLD,30);
		lamount = new JLabel();
		add(bimage);
		lamount.setFont(b);
		lamount.setBounds(250,350,300,50);
		lamount.setText("Your bill is "+total);
		bimage.add(lamount);
		bimage.setBounds(0,0,1000,650);
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Drink extends JFrame implements ActionListener
{
	JLabel c1,cimage;
	JCheckBox c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
	JButton prev;
	
	Font c;
	Drink()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\st2.jpeg");
		cimage=new JLabel(i);
		c1=new JLabel("Colddrinks & Cocktails");
		c1.setForeground(Color.white);
		prev= new JButton("<PREVIOUS");
		c=new Font("Verdana",Font.BOLD|Font.ITALIC,15);
		c1.setFont(c);
		c1.setBounds(100,50,300,50);
		c2=new JCheckBox("Diet Coke---Rs 270");
		c3=new JCheckBox("Lemon Iced Tea---Rs 250");
		c4=new JCheckBox("Flavoured Iced Tea---Rs 300");
		c5=new JCheckBox("Virgin Mojito---Rs 330");
		c6=new JCheckBox("Svami Cucumber Indian Tonic---Rs 270");
		c7=new JCheckBox("Svami Tonic---Rs 200");
		c8=new JCheckBox("Svami Ginger Ale---Rs 290");
		c8=new JCheckBox("Svami Soda---Rs 240");
		c9=new JCheckBox("FRESH LIME SODA---Rs 280");
		c10=new JCheckBox("GREEN APPLE SODA---Rs 180");
		c11=new JCheckBox("RED OCEAN LIME SODA---Rs 200");
		String qty[]={" ","1","2","3","4"};
		cb1= new JComboBox(qty);
		cb2= new JComboBox(qty);
		cb3= new JComboBox(qty);
		cb4= new JComboBox(qty);
		cb5= new JComboBox(qty);
		cb6= new JComboBox(qty);
		cb7= new JComboBox(qty);
		cb8= new JComboBox(qty);
		cb9= new JComboBox(qty);
		cb10= new JComboBox(qty);
		prev.addActionListener(this);
		c2.setBounds(100,120,400,30);
		c3.setBounds(100,170,400,30);
		c4.setBounds(100,220,400,30);
		c5.setBounds(100,270,400,30);
		c6.setBounds(100,320,400,30);
		c7.setBounds(100,370,400,30);
		c8.setBounds(100,420,400,30);
		c9.setBounds(100,470,400,30);
		c10.setBounds(100,520,400,30);
		c11.setBounds(100,570,400,30);
		cb1.setBounds(520,120,50,30);
		cb2.setBounds(520,170,50,30);
		cb3.setBounds(520,220,50,30);
		cb4.setBounds(520,270,50,30);
		cb5.setBounds(520,320,50,30);
		cb6.setBounds(520,370,50,30);
		cb7.setBounds(520,420,50,30);
		cb8.setBounds(520,470,50,30);
		cb9.setBounds(520,520,50,30);
		cb10.setBounds(520,570,50,30);
		prev.setBounds(650,570,150,30);
		cimage.setBounds(0,0,1000,650);
		add(cimage);
		cimage.add(c1);
		cimage.add(c2);
		cimage.add(c3);
		cimage.add(c4);
		cimage.add(c5);
		cimage.add(c6);
		cimage.add(c7);
		cimage.add(c8);
		cimage.add(c9);
		cimage.add(c10);
		cimage.add(c11);
		cimage.add(cb1);
		cimage.add(cb2);
		cimage.add(cb3);
		cimage.add(cb4);
		cimage.add(cb5);
		cimage.add(cb6);
		cimage.add(cb7);
		cimage.add(cb8);
		cimage.add(cb9);
		cimage.add(cb10);
		cimage.add(prev);
		
		
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{   String s;
		int x;
	    if(e.getActionCommand().equals("<PREVIOUS"))
		{	this.setVisible(false);
	        List l=new List();
			    
		}
		
		if(c2.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(c3.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+250*x;
		}
		if(c4.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+300*x;
			}
		if(c5.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+330*x;
		}
		if(c6.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(c7.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
		if(c8.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+240*x;
		}
		if(c9.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+280*x;
		}
		if(c10.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+180*x;
		}
		if(c11.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
	
	}
}
class Dessert extends JFrame implements ActionListener
{
	JLabel d1,dimage;
	JCheckBox d2,d3,d4,d5,d6,d7,d8,d9,d10,d11;
	JComboBox db1,db2,db3,db4,db5,db6,db7,db8,db9,db10;
	JButton prev;
	
	Font d;
	Dessert()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\st2.jpeg");
		dimage=new JLabel(i);
		d1=new JLabel("DESSERTS");
		d1.setForeground(Color.white);
		prev= new JButton("<PREVIOUS");
		d=new Font("Verdana",Font.BOLD|Font.ITALIC,15);
		d1.setFont(d);
		d1.setBounds(100,50,300,50);
		d2=new JCheckBox("Chocolate Tres Leches---Rs 270");
		d3=new JCheckBox("Coffee Panacotta---Rs 250");
		d4=new JCheckBox("Salted Caramel Mousse---Rs 300");
		d5=new JCheckBox("Mumbai Kulfi Falooda---Rs 330");
		d6=new JCheckBox("Anjeer Badam Halwa Baklawa Roll---Rs 270");
		d7=new JCheckBox("Kitkat Pancakes---Rs 200");
		d8=new JCheckBox("Chocolate Brownie---Rs 290");
		d8=new JCheckBox("Molten Chocolate With Vanilla Ice Cream---Rs 240");
		d9=new JCheckBox("Caramel Custard---Rs 280");
		d10=new JCheckBox("Butterscotch Ribbon---Rs 180");
		d11=new JCheckBox("Oreo Truffles---Rs 200");
		String qty[]={" ","1","2","3","4"};
		db1= new JComboBox(qty);
		db2= new JComboBox(qty);
		db3= new JComboBox(qty);
		db4= new JComboBox(qty);
		db5= new JComboBox(qty);
		db6= new JComboBox(qty);
		db7= new JComboBox(qty);
		db8= new JComboBox(qty);
		db9= new JComboBox(qty);
		db10= new JComboBox(qty);
		prev.addActionListener(this);
		d2.setBounds(100,120,400,30);
		d3.setBounds(100,170,400,30);
		d4.setBounds(100,220,400,30);
		d5.setBounds(100,270,400,30);
		d6.setBounds(100,320,400,30);
		d7.setBounds(100,370,400,30);
		d8.setBounds(100,420,400,30);
		d9.setBounds(100,470,400,30);
		d10.setBounds(100,520,400,30);
		d11.setBounds(100,570,400,30);
		db1.setBounds(520,120,50,30);
		db2.setBounds(520,170,50,30);
		db3.setBounds(520,220,50,30);
		db4.setBounds(520,270,50,30);
		db5.setBounds(520,320,50,30);
		db6.setBounds(520,370,50,30);
		db7.setBounds(520,420,50,30);
		db8.setBounds(520,470,50,30);
		db9.setBounds(520,520,50,30);
		db10.setBounds(520,570,50,30);
		prev.setBounds(650,570,150,30);
		dimage.setBounds(0,0,1000,650);
		add(dimage);
		dimage.add(d1);
		dimage.add(d2);
		dimage.add(d3);
		dimage.add(d4);
		dimage.add(d5);
		dimage.add(d6);
		dimage.add(d7);
		dimage.add(d8);
		dimage.add(d9);
		dimage.add(d10);
		dimage.add(d11);
		dimage.add(db1);
		dimage.add(db2);
		dimage.add(db3);
		dimage.add(db4);
		dimage.add(db5);
		dimage.add(db6);
		dimage.add(db7);
		dimage.add(db8);
		dimage.add(db9);
		dimage.add(db10);
		dimage.add(prev);
		
		
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{   String s;
		int x;
	    if(e.getActionCommand().equals("<PREVIOUS"))
		{	this.setVisible(false);
	        List l=new List();
			    
		}
		
		if(d2.isSelected())
		{
			s=db1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(d3.isSelected())
		{
			s=db2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+250*x;
		}
		if(d4.isSelected())
		{
			s=db3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+300*x;
			}
		if(d5.isSelected())
		{
			s=db4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+330*x;
		}
		if(d6.isSelected())
		{
			s=db5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(d7.isSelected())
		{
			s=db6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
		if(d8.isSelected())
		{
			s=db7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+240*x;
		}
		if(d9.isSelected())
		{
			s=db8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+280*x;
		}
		if(d10.isSelected())
		{
			s=db9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+180*x;
		}
		if(d11.isSelected())
		{
			s=db10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
	
	}
}
	
class MCourse extends JFrame implements ActionListener
{
	JLabel m1,mimage;
	JCheckBox m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
	JComboBox mb1,mb2,mb3,mb4,mb5,mb6,mb7,mb8,mb9,mb10;
	JButton prev;
	
	Font m;
	MCourse()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\st2.jpeg");
		mimage=new JLabel(i);
		m1=new JLabel("MAIN COURSE");
		m1.setForeground(Color.white);
		prev= new JButton("<PREVIOUS");
		m=new Font("Verdana",Font.BOLD|Font.ITALIC,15);
		m1.setFont(m);
		m1.setBounds(100,50,300,50);
		m2=new JCheckBox("Dal Makhani---Rs 270");
		m3=new JCheckBox("Paneer Butter Masala---Rs 250");
		m4=new JCheckBox("Paneer Lazeez---Rs 300");
		m5=new JCheckBox("Mushroom Hyderabadi---Rs 330");
		m6=new JCheckBox("Paneer Kaju Masala---Rs 270");
		m7=new JCheckBox("Paneer With Mushroom Handi---Rs 200");
		m8=new JCheckBox("Mushroom Kaju Masala---Rs 290");
		m8=new JCheckBox("Veg 65 Gravy---Rs 240");
		m9=new JCheckBox("Veg Manchurian Gravy---Rs 280");
		m10=new JCheckBox("Veg Shanghai Roll---Rs 180");
		m11=new JCheckBox("Baby Corn Tangy---Rs 200");
		String qty[]={" ","1","2","3","4"};
		mb1= new JComboBox(qty);
		mb2= new JComboBox(qty);
		mb3= new JComboBox(qty);
		mb4= new JComboBox(qty);
		mb5= new JComboBox(qty);
		mb6= new JComboBox(qty);
		mb7= new JComboBox(qty);
		mb8= new JComboBox(qty);
		mb9= new JComboBox(qty);
		mb10= new JComboBox(qty);
		prev.addActionListener(this);
		m2.setBounds(100,120,400,30);
		m3.setBounds(100,170,400,30);
		m4.setBounds(100,220,400,30);
		m5.setBounds(100,270,400,30);
		m6.setBounds(100,320,400,30);
		m7.setBounds(100,370,400,30);
		m8.setBounds(100,420,400,30);
		m9.setBounds(100,470,400,30);
		m10.setBounds(100,520,400,30);
		m11.setBounds(100,570,400,30);
		mb1.setBounds(520,120,50,30);
		mb2.setBounds(520,170,50,30);
		mb3.setBounds(520,220,50,30);
		mb4.setBounds(520,270,50,30);
		mb5.setBounds(520,320,50,30);
		mb6.setBounds(520,370,50,30);
		mb7.setBounds(520,420,50,30);
		mb8.setBounds(520,470,50,30);
		mb9.setBounds(520,520,50,30);
		mb10.setBounds(520,570,50,30);
		prev.setBounds(650,570,150,30);
		mimage.setBounds(0,0,1000,650);
		add(mimage);
		mimage.add(m1);
		mimage.add(m2);
		mimage.add(m3);
		mimage.add(m4);
		mimage.add(m5);
		mimage.add(m6);
		mimage.add(m7);
		mimage.add(m8);
		mimage.add(m9);
		mimage.add(m10);
		mimage.add(m11);
		mimage.add(mb1);
		mimage.add(mb2);
		mimage.add(mb3);
		mimage.add(mb4);
		mimage.add(mb5);
		mimage.add(mb6);
		mimage.add(mb7);
		mimage.add(mb8);
		mimage.add(mb9);
		mimage.add(mb10);
		mimage.add(prev);
		
		
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{   String s;
		int x;
	    if(e.getActionCommand().equals("<PREVIOUS"))
		{	this.setVisible(false);
	        List l=new List();
			    
		}
		
		if(m2.isSelected())
		{
			s=mb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(m3.isSelected())
		{
			s=mb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+250*x;
		}
		if(m4.isSelected())
		{
			s=mb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+300*x;
			}
		if(m5.isSelected())
		{
			s=mb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+330*x;
		}
		if(m6.isSelected())
		{
			s=mb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(m7.isSelected())
		{
			s=mb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
		if(m8.isSelected())
		{
			s=mb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+240*x;
		}
		if(m9.isSelected())
		{
			s=mb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+280*x;
		}
		if(m10.isSelected())
		{
			s=mb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+180*x;
		}
		if(m11.isSelected())
		{
			s=mb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
	
	}
}

		
class Starters extends JFrame implements ActionListener
{
	JLabel s1,simage;
	JCheckBox s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
	JComboBox sb1,sb2,sb3,sb4,sb5,sb6,sb7,sb8,sb9,sb10;
	JButton prev;
	
	Font h;
	Starters()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\st2.jpeg");
		simage=new JLabel(i);
		s1=new JLabel("SALTT'S SPECIAL SNACKS");
		s1.setForeground(Color.white);
		prev= new JButton("<PREVIOUS");
		h=new Font("Verdana",Font.BOLD|Font.ITALIC,15);
		s1.setFont(h);
		s1.setBounds(100,50,300,50);
		s2=new JCheckBox("Paneer Makhmali---Rs 270");
		s3=new JCheckBox("Mushroom Dhamaka---Rs 250");
		s4=new JCheckBox("Cheese Tukdi---Rs 300");
		s5=new JCheckBox("Veg Casino---Rs 330");
		s6=new JCheckBox("Soya Cocktaill Tandoori---Rs 270");
		s7=new JCheckBox("American Corn Cheese Balls---Rs 200");
		s8=new JCheckBox("Spinach In Thai Sauce---Rs 290");
		s8=new JCheckBox("Paneer Mangolian---Rs 240");
		s9=new JCheckBox("Cheese Pizza---Rs 280");
		s10=new JCheckBox("Cheese Chili Momos---Rs 180");
		s11=new JCheckBox("Mushroom Barbeque Sauce---Rs 200");
		String qty[]={" ","1","2","3","4"};
		sb1= new JComboBox(qty);
		sb2= new JComboBox(qty);
		sb3= new JComboBox(qty);
		sb4= new JComboBox(qty);
		sb5= new JComboBox(qty);
		sb6= new JComboBox(qty);
		sb7= new JComboBox(qty);
		sb8= new JComboBox(qty);
		sb9= new JComboBox(qty);
		sb10= new JComboBox(qty);
		prev.addActionListener(this);
		s2.setBounds(100,120,400,30);
		s3.setBounds(100,170,400,30);
		s4.setBounds(100,220,400,30);
		s5.setBounds(100,270,400,30);
		s6.setBounds(100,320,400,30);
		s7.setBounds(100,370,400,30);
		s8.setBounds(100,420,400,30);
		s9.setBounds(100,470,400,30);
		s10.setBounds(100,520,400,30);
		s11.setBounds(100,570,400,30);
		sb1.setBounds(520,120,50,30);
		sb2.setBounds(520,170,50,30);
		sb3.setBounds(520,220,50,30);
		sb4.setBounds(520,270,50,30);
		sb5.setBounds(520,320,50,30);
		sb6.setBounds(520,370,50,30);
		sb7.setBounds(520,420,50,30);
		sb8.setBounds(520,470,50,30);
		sb9.setBounds(520,520,50,30);
		sb10.setBounds(520,570,50,30);
		prev.setBounds(650,570,150,30);
		simage.setBounds(0,0,1000,650);
		add(simage);
		simage.add(s1);
		simage.add(s2);
		simage.add(s3);
		simage.add(s4);
		simage.add(s5);
		simage.add(s6);
		simage.add(s7);
		simage.add(s8);
		simage.add(s9);
		simage.add(s10);
		simage.add(s11);
		simage.add(sb1);
		simage.add(sb2);
		simage.add(sb3);
		simage.add(sb4);
		simage.add(sb5);
		simage.add(sb6);
		simage.add(sb7);
		simage.add(sb8);
		simage.add(sb9);
		simage.add(sb10);
		simage.add(prev);
		
		
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{   String s;
		int x;
	    if(e.getActionCommand().equals("<PREVIOUS"))
		{	this.setVisible(false);
	        List l=new List();
			    
		}
		
		if(s2.isSelected())
		{
			s=sb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(s3.isSelected())
		{
			s=sb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+250*x;
		}
		if(s4.isSelected())
		{
			s=sb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+300*x;
			}
		if(s5.isSelected())
		{
			s=sb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+330*x;
		}
		if(s6.isSelected())
		{
			s=sb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+270*x;
		}
		if(s7.isSelected())
		{
			s=sb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
		if(s8.isSelected())
		{
			s=sb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+240*x;
		}
		if(s9.isSelected())
		{
			s=sb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+280*x;
		}
		if(s10.isSelected())
		{
			s=sb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+180*x;
		}
		if(s11.isSelected())
		{
			s=sb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
				x=Integer.parseInt(s);
			bill.total= bill.total+200*x;
		}
	
	}
		
}
		
		
class List extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	JLabel listi;
	List()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\list.jpeg");
		listi=new JLabel(i);
		b1=new JButton("Saltt's Special Starters");
		b2=new JButton("Main Course");
		b3=new JButton("Deserts");
		b4=new JButton("Colddrinks & Cocktails");
		b5=new JButton("Bill>");
		b1.setBounds(350,100,200,50);
		b2.setBounds(350,200,200,50);
		b3.setBounds(350,300,200,50);
		b4.setBounds(350,400,200,50);
		b5.setBounds(550,550,200,50);
		listi.setBounds(0,0,1000,650);
		add(listi);
		listi.add(b1);
		listi.add(b2);
		listi.add(b3);
		listi.add(b4);
		listi.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Saltt's Special Starters"))
		{
			this.setVisible(false);
			Starters s=new Starters();
		}
		if(e.getActionCommand().equals("Main Course"))
		{
			this.setVisible(false);
			MCourse m=new MCourse();
		}
		if(e.getActionCommand().equals("Deserts"))
		{
			this.setVisible(false);
			Dessert d=new Dessert();
		}
		if(e.getActionCommand().equals("Colddrinks & Cocktails"))
		{
			this.setVisible(false);
			Drink c=new Drink();
		}
		
		if(e.getActionCommand().equals("Bill>"))
		{
			bill b=new bill();
		}
		
	}
		
}
		
class Food extends JFrame implements ActionListener
{
	JLabel l1,rname,u1,p1,limage;
	JTextField tf;
	JPasswordField pf;
	JButton login;
	Font f,f1;
	Food()
	{
		ImageIcon i=new ImageIcon("C:\\java programs\\r1.jpeg");
		limage=new JLabel(i); 
		rname=new JLabel("-----*SALTT*-----");
		f=new Font("Verdana",Font.BOLD,20);
		rname.setFont(f);
        u1=new JLabel("USERNAME");
		l1=new JLabel("FASTFOOD & RESTAURANT               PURE VEG");
		f1=new Font("Verdana",Font.BOLD|Font.ITALIC,15);
		l1.setFont(f1);
		p1=new JLabel("PASSWORD");
		tf=new JTextField("Enter Username");
		pf=new JPasswordField();
		login=new JButton("LOGIN");
		rname.setBounds(400,100,200,50);
		l1.setBounds(230,120,500,50);
		limage.setBounds(0,0,1000,650);
		u1.setBounds(350,250,100,30);
		p1.setBounds(350,300,100,30);
		tf.setBounds(470,250,100,30);
		pf.setBounds(470,300,100,30);
		login.setBounds(420,400,100,30);
		login.addActionListener(this);
		add(limage);
		limage.add(rname);
		limage.add(l1);
		limage.add(u1);
		limage.add(p1);
		limage.add(tf);
		limage.add(pf);	
		limage.add(login);	
		
		this.setLayout(null);
		this.setSize(1000,650);
		this.setLocation(150,20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}
	public void actionPerformed(ActionEvent e)
	{

		if(tf.getText().equals("Foodie")&&pf.getText().equals("123"))
		{
			this.setVisible(false);
			List l = new List();
			
		}
	}
		
		
	public static void main(String args[])
	{
		Food f=new Food();
		
	}
}
		
	