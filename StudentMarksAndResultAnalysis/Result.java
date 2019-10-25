import java.awt.*;
import java.awt.event.*;
import java.io.*;


import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class Result extends Frame {
	
	private Label welcome,roll;
	private Button next,back;
	private TextField t1;
   
	protected static final Component RootPaneContainer = null;
	
       	//constructor
	      @SuppressWarnings("unused")
		public Result() {
	
         final Frame frame2= new Frame("STUDENT RESULT PAGE");
		 Image icon = Toolkit.getDefaultToolkit().getImage("E:\\java\\icon.png");
		 welcome = new Label("STUDENT RESULT PAGE",Label.CENTER);
         welcome.setBounds(0,20,600,100);
		 welcome.setFont(new Font("DIALOG",Font.BOLD,20));
		 welcome.setBackground(Color.GRAY);
		 
		 roll = new Label("ENROLLMENT NO:",Label.CENTER);
		 roll.setFont(new Font("DIALOG",Font.BOLD,16));
		 roll.setBounds(130,200,150,50);
		 
		 t1= new TextField();
         t1.setBounds(280,210,150,30);
		 t1.setBackground(Color.WHITE);
		 t1.setFont(new Font("DIALOG",Font.BOLD,16));
		 
		 next = new Button("NEXT");
		 next.setBounds(260,300,100,50);
		 next.setFont(new Font("DIALOG",Font.BOLD,25));
		 back=new Button("BACK");
		 back.setBounds(150,300,100,50);
		 back.setFont(new Font("DIALOG",Font.BOLD,25));
		 
	     frame2.add(welcome);
	     frame2.add(next);
		 frame2.add(t1);
		 frame2.add(roll);
		 frame2.add(back);
         frame2.setSize(600,600);
         frame2.setBackground(Color.LIGHT_GRAY);
		 frame2.setLayout(null);
         frame2.setVisible(true);
		 frame2.setResizable(false);
         frame2.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e){System.exit(0);}
             });
         
         next.addActionListener(new ActionListener(){
			 @SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e){
				 String s1=t1.getText().toString();
				 s1.toUpperCase();
				 if(s1.isEmpty())
				 {
					 JOptionPane.showMessageDialog(RootPaneContainer, "Please Enter Your Enrollment No.");
				 }
				 else
				 {
				int i=0;
				  try {
					 
				 	
					 BufferedReader br;
					br=new BufferedReader(new FileReader("D:\\SDCA DATA\\"+s1+".txt"));
					
					try {
						BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\SDCA DATA\\tempresult.txt"));
						bw.write(s1);
						 bw.close();
					
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}
					 
				 
				 
				 
				 } catch (FileNotFoundException e2) {
					 i=1;
				
				}
			   if(i==0)
			   {
				   frame2.dispose(); 												
		         FinalResult finalresult=new FinalResult();
			   }
			   else
			   {
				   JOptionPane.showMessageDialog(RootPaneContainer, "no result found for this roll number."); 
			   }
				 }
				 
				 
				 }});
       //end of next button
         //start of back button
         
         back.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
		      frame2.dispose(); 
		      First f=new First();

		     }
			});  //end of back button 
     }
	 //end of result constructor

}	//end of class
