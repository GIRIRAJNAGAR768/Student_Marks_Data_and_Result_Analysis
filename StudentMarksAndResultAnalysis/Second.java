import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Second extends Frame 
{
	protected static final Component RootPaneContainer = null;
	private Label lname,lfname,lmname,lroll,welcome,year,date,branch,dobhint,l1;
	private Button next,back;
	private TextField t1,t2,t3,t4,dd,mm,yy,enroll;
	private String name,fname,mname,id,yearget,branchget,s1,ddget,mmget,yyget;
	private Choice ch2,ch3;
	
	public Second()
	{
                 final Frame frame= new Frame("SDCA -NEW STUDENTS");
		 Image icon = Toolkit.getDefaultToolkit().getImage("E:\\java\\icon.png");
		 welcome = new Label("NEW STUDENT REGISTRATION FORM",Label.CENTER);
                 welcome.setBounds(0,20,600,100);
		 welcome.setFont(new Font("DIALOG",Font.BOLD,20));
		 welcome.setBackground(Color.GRAY);
		 
		 l1 = new Label("ENROLLMENT N0:",Label.CENTER);
		 l1.setFont(new Font("DIALOG",Font.BOLD,16));
		 l1.setBounds(80,150,150,50);
		 
		 enroll= new TextField();
		 enroll.setBounds(250,160,250,30);
		 enroll.setFont(new Font("DIALOG",Font.BOLD , 16));
		 enroll.setBackground(Color.WHITE);
		 
		 lname = new Label("ST.NAME :",Label.CENTER);
		 lname.setFont(new Font("DIALOG",Font.BOLD,16));
		 lname.setBounds(80,200,100,50);
		 
		 branch = new Label("BRANCH :",Label.CENTER);
		 branch.setFont(new Font("DIALOG",Font.BOLD,16));
		 branch.setBounds(130,490,100,50);
		 
		 ch2 = new Choice();
		 ch2.add("COMPUTER SCIENCE");
		 ch2.add("INFORMATION TECHNOLOGY");
		 ch2.add("ELECTRONIC COMMNUCATION");
		 ch2.add("MECHANICAL ENGINEERING");
		 ch2.add("CIVIL ENGINEERING");
		 ch2.add("CHEMICAL ENGINEERING");
		 ch2.setBounds(250,500,250,60);
		 ch2.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 
		 lfname = new Label("FATHER NAME :",Label.CENTER);
		 lfname.setFont(new Font("DIALOG",Font.BOLD,16));
		 lfname.setBounds(80,250,150,50);
		 lmname = new Label("MOTHER NAME :",Label.CENTER);
		 lmname.setFont(new Font("DIALOG",Font.BOLD,16));
		 lmname.setBounds(80,300,150,50);
		 
		 lroll = new Label("COLLEGE ID :");
		 lroll.setBounds(100,350,150,50);
		 lroll.setFont(new Font("DIALOG",Font.BOLD,16));
	     
		 year = new Label("SELECT YOUR 	SEM : ");
		 year.setFont(new Font("DIALOG",Font.BOLD , 15));
		 year.setBounds(50,400,200,50);
		 
		 t1= new TextField();
                 t1.setBounds(250,210,250,30);
                 t1.setFont(new Font("DIALOG",Font.BOLD , 16));
		 t1.setBackground(Color.WHITE);
		 
		 t2= new TextField();
                 t2.setBounds(250,260,250,30);
		 t2.setBackground(Color.WHITE);
		 t2.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 t3= new TextField();
                 t3.setBounds(250,310,250,30);
		 t3.setBackground(Color.WHITE);
		 t3.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 t4= new TextField();
                 t4.setBounds(250,360,250,30);
		 t4.setBackground(Color.WHITE);
		 t4.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 ch3 = new Choice();
	
		 ch3.add("1ST SEM");
		 ch3.add("2ND SEM");
		 ch3.add("3RD SEM");
		 ch3.add("4TH SEM");
		 ch3.add("5TH SEM");
		 ch3.add("6TH SEM");
		 ch3.add("7TH SEM");
		 ch3.add("8TH SEM");
		 ch3.setBounds(250,410,250,60);
		 ch3.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 date = new Label("DATE OF BIRTH :");
		 date.setFont(new Font("Dialog",Font.BOLD,15));
		 date.setBounds(90,440,150,50);
		 
		 dd = new TextField("");
		 dd.setBounds(250,450,30,30);
		 dd.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 mm = new TextField("");
		 mm.setBounds(290,450,30,30);
		 mm.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 yy = new TextField("");
		 yy.setBounds(330,450,50,30);
		 yy.setFont(new Font("DIALOG",Font.BOLD , 16));
		 
		 dobhint=new Label("DD  MM  YYYY");
		 dobhint.setFont(new Font("Dialog",Font.BOLD,15));
		 dobhint.setBounds(390,450,120,30);
		 
	    
		 next = new Button("NEXT");
		 next.setBounds(260,570,100,50);
		 next.setFont(new Font("DIALOG",Font.BOLD,25));
		 
		 back=new Button("BACK");
		 back.setBounds(150,570,100,50);
		 back.setFont(new Font("DIALOG",Font.BOLD,25));
		 
		 frame.add(l1);
		 frame.add(enroll);
		 frame.add(lfname);
                 frame.add(lname);
		 frame.add(t2);
		 frame.add(ch2);
		 frame.add(ch3);
		 frame.add(year);
		 frame.add(lmname);
		 frame.add(t3);
	 	 frame.add(welcome);
		 frame.add(next);
		 frame.add(t1);
		 frame.add(lroll);
		 frame.add(t4);
		 frame.add(branch);
		 frame.add(date);
		 frame.add(dd);
		 frame.add(mm);
		 frame.add(yy);
		 frame.add(dobhint);
		 frame.add(back);
		
                frame.setSize(600,700);
                frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null);
                frame.setVisible(true);
		frame.setResizable(false);
                frame.addWindowListener(new WindowAdapter()
                {
                  public void windowClosing(WindowEvent e)
                  {
                   System.exit(0);
                  }
               });
         
              next.addActionListener(new ActionListener()
              {
		 public void actionPerformed(ActionEvent e)
		 {
		          s1=enroll.getText().toString();
			  name=t1.getText().toString();
			  fname=t2.getText().toString();
			  mname=t3.getText().toString();
			  id=t4.getText().toString();
			  yearget=ch3.getSelectedItem().toString();
			  ddget=dd.getText().toString();
			  mmget=mm.getText().toString();
			  yyget=yy.getText().toString();
			  branchget=ch2.getSelectedItem().toString();
				 
				
			 if(s1.isEmpty())
			 {
				 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Enrollment no.");
			 }
			 else
			 {	 
				 if(name.isEmpty())
				 {
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Student Name");
				 }
				 else
				 {
					 if(fname.isEmpty())
					 {
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Father Name");
						 
					 }
					 else
					 {
						 if(mname.isEmpty())
						 {
							 
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Mother Name");
						 } 
						 else
						 {
							 if(id.isEmpty())
							 {
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Student Id");
								 
							 }
							 else
							 {
								 if(yearget.isEmpty())
								 {
									 
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Select Valid Year");
								 } 
								 else
								 {
									  if(ddget.isEmpty())
									 {
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Date"); 
									 }
									  else if( Integer.parseInt(ddget)<=0 ||  Integer.parseInt(ddget)>=32)
									 {
										 
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid Date");
									 } 
									
									else
									{
										 if(mmget.isEmpty())
										 {
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter month"); 
										 }
										else if( Integer.parseInt(mmget)<=0 ||  Integer.parseInt(mmget)>=13)
										 {
											 
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid Month");
										 }
										 
										else
										{
											 if(yyget.isEmpty())
											 {
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter year"); 
											 }
											 else if( Integer.parseInt(yyget)<1990 ||  Integer.parseInt(yyget)>=2004)
											 {
												 
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid Year");
											 }
											
											else
											{
												if(branchget.isEmpty())
												{
													JOptionPane.showMessageDialog(RootPaneContainer, "please Select Branch");
												}
												else
												{
													try
													{
									 					 
								                   	BufferedWriter fw=new BufferedWriter(new FileWriter("SDCA DATA\\" + s1 +".txt"));
													BufferedWriter temp=new BufferedWriter(new FileWriter("SDCA DATA\\temp.txt"));
													BufferedWriter sem=new BufferedWriter(new FileWriter("SDCA DATA\\sem.txt"));
											        
													fw.write(s1);
										            fw. write("\r\n");
													fw.write(name);
										            fw. write("\r\n");
										            
										            fw.write(fname);
										            fw. write("\r\n");
										            fw.write(mname);
										            fw. write("\r\n");
										            fw.write(id);
										            fw. write("\r\n");
										            fw.write(yearget);
										            fw. write("\r\n");
										            fw.write(ddget+"\r\n"+mmget+"\r\n"+yyget);
										            fw. write("\r\n");
										            fw.write(branchget);
										            fw. write("\r\n");
										            temp.write(s1);
										            sem.write(yearget);
										            temp.close();
										            sem.close();
										            fw.close();

										        } catch (IOException iox){
										            iox.printStackTrace();
										        }
												    	frame.dispose(); 
														SecondNext secondNext=new SecondNext();	
												         secondNext.data();		
												}
											}
										}
									}
								 }
							 }
							 
						 }
					 }
					 
				 }
					 
			 }
					 
				 
			
			
				 }
				
			  
		     

			
			});
       //end of next button
         //start of back button
         
         back.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
		      frame.dispose(); 
		     
	         @SuppressWarnings("unused")
			First first=new First();

		     }
			});  //end of back button 
     }
	 //end of resister
	
	
	



	
}
