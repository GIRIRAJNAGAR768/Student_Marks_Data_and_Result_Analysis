import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class SecondNext extends Frame {
	
    protected static final Component RootPaneUI = null;
	protected static final Component RowSetWarning = null;
	protected static final Component RootPaneContainer = null;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,welcome,sub,marks;
    private TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	private int total;
	private float per;
	//private int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
	private String result,sem;
	private Button b1,b2;
	String[] data;
	Label data1[]= {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12};
    public void data() 
	{
    	try {
			BufferedReader br = new BufferedReader(new FileReader("SDCA DATA\\sem.txt"));
			try {
			 sem=br.readLine();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		try {
					
					BufferedReader br2 = new BufferedReader(new FileReader("Sem_Subject\\"+sem+".txt"));
					String line = br2.readLine();
					
					int i=0;
					while(line!=null)
					{
						 data1[i]=new Label(line,Label.RIGHT);
						 System.out.println(data1[i]);
						 line = br2.readLine();
						 
						  i++;
					}
						  br2.close();
					
					
					
					} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
			
			l1=data1[0];
			l2=data1[1];
			l3=data1[2];
			l4=data1[3];
			l5=data1[4];
			l6=data1[5];
			l7=data1[6];
			l8=data1[7];
			l9=data1[8];
			l10=data1[9];
			l11=data1[10];
			l12=data1[11];
		
		final Frame frame3;
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\java\\icon.png");
        frame3 = new Frame("STUDENT MARKS DETAILS");
			
			
			 welcome = new Label("FIELD STUDENT MARKS",Label.CENTER);
	         welcome.setBounds(0,20,600,70);
			 welcome.setFont(new Font("DIALOG",Font.BOLD,20));
			 welcome.setBackground(Color.GRAY);
		
			 sub = new Label("SUBJECT :",Label.RIGHT);
			 sub.setFont(new Font("DIALOG",Font.BOLD,13));
			 sub.setBounds(110,100,200,35);
			 sub.setBackground(Color.GRAY);
			 
			 marks = new Label("MARKS(OBT.MARKS) :",Label.RIGHT);
			 marks.setFont(new Font("DIALOG",Font.BOLD,13));
			 marks.setBounds(310,100,220,35);
			 marks.setBackground(Color.GRAY);
			 
			 
	    
			 l1.setFont(new Font("DIALOG",Font.BOLD,16));
			l1.setBounds(110,150,250,40);
	         t1= new TextField();
             t1.setBounds(380,150,35,30);
		     t1.setBackground(Color.WHITE);   t1.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		 
		 l2.setFont(new Font("DIALOG",Font.BOLD,16));
		 l2.setBounds(110,190,250,40);
	     t2= new TextField();
         t2.setBounds(380,190,35,30);
		 t2.setBackground(Color.WHITE);   t2.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
	
		 l3.setFont(new Font("DIALOG",Font.BOLD,16));
		 l3.setBounds(110,230,250,40);
	     t3= new TextField();
         t3.setBounds(380,230,35,30);
		 t3.setBackground(Color.WHITE);   t3.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		
		 l4.setFont(new Font("DIALOG",Font.BOLD,16));
		 l4.setBounds(110,270,250,40);
	     t4= new TextField();
         t4.setBounds(380,270,35,30);
		 t4.setBackground(Color.WHITE);   t4.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		 
		 l5.setFont(new Font("DIALOG",Font.BOLD,16));
		 l5.setBounds(110,310,250,40);
	     t5= new TextField();
         t5.setBounds(380,310,35,30);
		 t5.setBackground(Color.WHITE);   t5.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		
		 l6.setFont(new Font("DIALOG",Font.BOLD,16));
		 l6.setBounds(110,350,250,40);
	     t6= new TextField();
         t6.setBounds(380,350,35,30);
		 t6.setBackground(Color.WHITE);   t6.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		
		 l7.setFont(new Font("DIALOG",Font.BOLD,16));
		 l7.setBounds(110,390,250,40);
	     t7= new TextField();
         t7.setBounds(380,390,35,30);
		 t7.setBackground(Color.WHITE);   t7.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		
		 l8.setFont(new Font("DIALOG",Font.BOLD,16));
		 l8.setBounds(110,430,250,40);
	     t8= new TextField();
         t8.setBounds(380,430,35,30);
		 t8.setBackground(Color.WHITE);   t8.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		 
		 //l9 = new Label("",Label.CENTER);
		  l9.setFont(new Font("DIALOG",Font.BOLD,16));
		 l9.setBounds(110,470,250,40);
	     t9= new TextField();
         t9.setBounds(380,470,35,30);
		 t9.setBackground(Color.WHITE);   t9.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		 l10.setFont(new Font("DIALOG",Font.BOLD,16));
		 l10.setBounds(110,510,250,40);
	     t10= new TextField();
         t10.setBounds(380,510,35,30);
		 t10.setBackground(Color.WHITE);   t10.setFont(new Font("DIALOG",Font.BOLD,16)); 
		
			 
	     if(sem.equals("3RD SEM")|| sem.equals("6TH SEM") ||  sem.equals("7TH SEM"))
		 {
		 l11.setFont(new Font("DIALOG",Font.BOLD,16));
		 l11.setBounds(110,550,250,40);
	     t11= new TextField();
         t11.setBounds(380,550,35,30);
		 t11.setBackground(Color.WHITE);   t11.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 

		 l12.setFont(new Font("DIALOG",Font.BOLD,16));
		 l12.setBounds(110,590,250,40);
	     t12= new TextField();
         t12.setBounds(380,590,35,30);
		 t12.setBackground(Color.WHITE);   t12.setFont(new Font("DIALOG",Font.BOLD,16)); 
		 
		 }
		if(sem.equals("1ST SEM")|| sem.equals("2ND SEM") ||  sem.equals("4TH SEM") ||  sem.equals("5TH SEM"))
	  
			 {
			 l11.setFont(new Font("DIALOG",Font.BOLD,16));
			 l11.setBounds(110,550,250,40);
		     t11= new TextField();
	         t11.setBounds(380,550,35,30);
			 t11.setBackground(Color.WHITE);   t11.setFont(new Font("DIALOG",Font.BOLD,16)); 
			 
		 }
		 
		 
	   	 b1 = new Button("SUBMIT");
		 b1.setFont(new Font("DIALOG",Font.BOLD,20));
		 b1.setBounds(250,650,110,50);
	     b1.setBackground(Color.GRAY);    
		
	     b2 = new Button("BACK");
		 b2.setFont(new Font("DIALOG",Font.BOLD,20));
		 b2.setBounds(150,650,110,50);
	     b2.setBackground(Color.GRAY);    
	     
	     frame3.add(l1);
		 frame3.add(t1);
		 frame3.add(l2);
		 frame3.add(t2);
		 frame3.add(l3);frame3.add(t3);frame3.add(l4);frame3.add(t4);frame3.add(l5);frame3.add(t5);frame3.add(l6);
		 frame3.add(t6);frame3.add(l7);frame3.add(t7);frame3.add(l8);frame3.add(t1);frame3.add(t8);frame3.add(l9);
		 frame3.add(t9);frame3.add(l10);frame3.add(t10);
	     
	     
		
	     
	     if(sem.equals("1ST SEM") || sem.equals("2ND SEM") || sem.equals("4TH SEM") || sem.equals("5TH SEM"))
	     {
	    	frame3.add(l11);frame3.add(t11); 
	     }
	     if(sem.equals("3RD SEM") || sem.equals("6TH SEM") || sem.equals("7TH SEM"))
	     {
	    	 frame3.add(l11);frame3.add(t11); frame3.add(l12);
			 frame3.add(t12);
	     }
	    
		 frame3.add(welcome);
		 frame3.add(sub);
		 frame3.add(marks);
		 frame3.add(b1);frame3.add(b2);
		 frame3.setSize(600,750);
         frame3.setBackground(Color.LIGHT_GRAY);
		 frame3.setLayout(null);
         frame3.setVisible(true);
		 frame3.setResizable(true);
         
		 frame3.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e)
         {
        	 System.exit(0);}
         });
         //start submit button
	      b1.addActionListener(new ActionListener(){
			 @SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e){
				
				 String ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11,ss12;
				 int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
				 s1=Integer.parseInt(t1.getText().toString());
				 s2=Integer.parseInt(t2.getText().toString());
				 s3=Integer.parseInt(t3.getText().toString());
				 s4=Integer.parseInt(t4.getText().toString());
				 s5=Integer.parseInt(t5.getText().toString());
				 s6=Integer.parseInt(t6.getText().toString());
				 s7=Integer.parseInt(t7.getText().toString());
				 s8=Integer.parseInt(t8.getText().toString());
				 s9=Integer.parseInt(t9.getText().toString());
				 s10=Integer.parseInt(t10.getText().toString());
				 
					ss1=t1.getText().toString();
					ss2=t2.getText().toString();
					ss3=t3.getText().toString();
					ss4=t4.getText().toString();
					ss5=t5.getText().toString();
					ss6=t6.getText().toString();
					ss7=t7.getText().toString();
					ss8=t8.getText().toString();
					ss9=t9.getText().toString();
					ss10=t10.getText().toString();
			
			if(sem.equals("3RD SEM") || sem.equals("6TH SEM") || sem.equals("7TH SEM"))
		    {
				ss11=t11.getText().toString();
				ss12=t12.getText().toString();
				 
				 if(ss1.isEmpty())
				 {
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CT Mrks"); 
				 }
				  else if(Integer.parseInt(ss1)<0 ||Integer.parseInt(ss1)>100)
				 {
					 
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CT Marks");
				 } 
				
				else
				{
					 if(ss2.isEmpty())
					 {
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM-I Marks"); 
					 }
					 else if(Integer.parseInt(ss2)<0 ||Integer.parseInt(ss2)>100)
					 {
						 
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM-I Marks");
					 }
					 
					else
					{
						 if(ss3.isEmpty())
						 {
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP Marks"); 
						 }
						 else if(Integer.parseInt(ss3)<0 ||Integer.parseInt(ss3)>100)
						 {
							 
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP Marks");
						 }
						
						else
						{
							 if(ss4.isEmpty())
							 {
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE Mrks"); 
							 }
							 else if(Integer.parseInt(ss4)<0 ||Integer.parseInt(ss4)>100)
							 {
								 
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE Marks");
							 } 
							
							else
							{
								 if(ss5.isEmpty())
								 {
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM Marks"); 
								 }
								 else if(Integer.parseInt(ss5)<0 ||Integer.parseInt(ss5)>100)
								 {
									 
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM Marks");
								 }
								 
								else
								{
									 if(ss6.isEmpty())
									 {
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP Marks"); 
									 }
									 else if(Integer.parseInt(ss6)<0 ||Integer.parseInt(ss6)>100)
									 {
										 
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP Marks");
									 }
									
									else
									{
										
										
										 if(ss7.isEmpty())
										 {
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP-LAB Mrks"); 
										 }
										 else if(Integer.parseInt(ss7)<0 ||Integer.parseInt(ss7)>100)
										 {
											 
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP-LAB Marks");
										 } 
										
										else
										{
											 if(ss8.isEmpty())
											 {
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE-LAB Marks"); 
											 }
											 else if(Integer.parseInt(ss8)<0 ||Integer.parseInt(ss8)>100)
											 {
												 
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE-LAB Marks");
											 }
											 
											else
											{
												 if(ss9.isEmpty())
												 {
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP-LAB Marks"); 
												 }
												 else if(Integer.parseInt(ss9)<0 ||Integer.parseInt(ss9)>100)
												 {
													 
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP-LAB Marks");
												 }
												
												else
												{
													 if(ss10.isEmpty())
													 {
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter MD Mrks"); 
													 }
													 else if(Integer.parseInt(ss10)<0 ||Integer.parseInt(ss10)>100)
													 {
														 
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid MD Marks");
													 } 
													
													else
													{
														 if(ss11.isEmpty())
														 {
															 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CT-LAB Marks"); 
														 }
														 else if(Integer.parseInt(ss11)<0 ||Integer.parseInt(ss11)>100)
														 {
															 
															 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CT-LAB Marks");
														 }
														 
														else
														{
															 if(ss12.isEmpty())
															 {
																 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter DECA Marks"); 
															 }
															 else if(Integer.parseInt(ss12)<0 ||Integer.parseInt(ss12)>100)
															 {
																 
																 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid DECA Marks");
															 }
															
															else
															{
																 s11=Integer.parseInt(t11.getText().toString());
																 s12=Integer.parseInt(t12.getText().toString());
																
																  try {
																 	   BufferedReader br=new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
																       String id=br.readLine();	
																       BufferedWriter fw=new BufferedWriter(new FileWriter("SDCA DATA\\" + id +".txt",true));
																     
															            fw.write(ss1);
															            fw. write("\r\n");
															            fw.write(ss2);
															            fw. write("\r\n");
															            fw.write(ss3);
															            fw. write("\r\n");
															            fw.write(ss4);
															            fw. write("\r\n");
															            fw.write(ss5);
															            fw. write("\r\n");
															            fw.write(ss6);
															            fw. write("\r\n");
															            fw.write(ss7);
															            fw. write("\r\n");
															            fw.write(ss8);
															            fw. write("\r\n");
															            fw.write(ss9);
															            fw. write("\r\n");
															            fw.write(ss10);
															            fw. write("\r\n");
															            fw.write(ss11);
															            fw. write("\r\n");
															            fw.write(ss12);
															            fw. write("\r\n");
															            
															            total=(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12);
															            per=total*100/1000f;
															            if(total<400)
															            {
															            	result="FAIL";
															            }
															            else
															            {
															            	result="PASS";
															            }
															            String total1= String.valueOf(total);
															            String per1= String.valueOf(per);
															            fw.write(total1);
															            fw. write("\r\n");
															            fw.write(per1);
															            fw. write("\r\n");
															            fw.write(result);
															            
															            br.close();
															            fw.close();
															           
															        } catch (IOException iox) {
															            //do stuff with exception
															            iox.printStackTrace();
															        }
															      	frame3.dispose(); 
															      	JOptionPane.showMessageDialog(RootPaneContainer, "Student Data Have Been Saved.");
																    First f=new First();
																
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
			 }
			}//end of if
				 
			 else if(sem.equals("1ST SEM") || sem.equals("2ND SEM") || sem.equals("4TH SEM") || sem.equals("5TH SEM"))
				 {
				 ss11=t11.getText().toString();
				 if(ss1.isEmpty())
				 {
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CT Mrks"); 
				 }
				  else if(Integer.parseInt(ss1)<0 ||Integer.parseInt(ss1)>100)
				 {
					 
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CT Marks");
				 } 
				
				else
				{
					 if(ss2.isEmpty())
					 {
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM-I Marks"); 
					 }
					 else if(Integer.parseInt(ss2)<0 ||Integer.parseInt(ss2)>100)
					 {
						 
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM-I Marks");
					 }
					 
					else
					{
						 if(ss3.isEmpty())
						 {
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP Marks"); 
						 }
						 else if(Integer.parseInt(ss3)<0 ||Integer.parseInt(ss3)>100)
						 {
							 
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP Marks");
						 }
						
						else
						{
							 if(ss4.isEmpty())
							 {
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE Mrks"); 
							 }
							 else if(Integer.parseInt(ss4)<0 ||Integer.parseInt(ss4)>100)
							 {
								 
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE Marks");
							 } 
							
							else
							{
								 if(ss5.isEmpty())
								 {
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM Marks"); 
								 }
								 else if(Integer.parseInt(ss5)<0 ||Integer.parseInt(ss5)>100)
								 {
									 
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM Marks");
								 }
								 
								else
								{
									 if(ss6.isEmpty())
									 {
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP Marks"); 
									 }
									 else if(Integer.parseInt(ss6)<0 ||Integer.parseInt(ss6)>100)
									 {
										 
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP Marks");
									 }
									
									else
									{
										
										
										 if(ss7.isEmpty())
										 {
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP-LAB Mrks"); 
										 }
										 else if(Integer.parseInt(ss7)<0 ||Integer.parseInt(ss7)>100)
										 {
											 
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP-LAB Marks");
										 } 
										
										else
										{
											 if(ss8.isEmpty())
											 {
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE-LAB Marks"); 
											 }
											 else if(Integer.parseInt(ss8)<0 ||Integer.parseInt(ss8)>100)
											 {
												 
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE-LAB Marks");
											 }
											 
											else
											{
												 if(ss9.isEmpty())
												 {
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP-LAB Marks"); 
												 }
												 else if(Integer.parseInt(ss9)<0 ||Integer.parseInt(ss9)>100)
												 {
													 
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP-LAB Marks");
												 }
												
												else
												{
													 if(ss10.isEmpty())
													 {
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter MD Mrks"); 
													 }
													 else if(Integer.parseInt(ss10)<0 ||Integer.parseInt(ss10)>100)
													 {
														 
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid MD Marks");
													 } 
													
													else
													{
														 if(ss11.isEmpty())
														 {
															 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CT-LAB Marks"); 
														 }
														 else if(Integer.parseInt(ss11)<0 ||Integer.parseInt(ss11)>100)
														 {
															 
															 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CT-LAB Marks");
														 }
														 
														else
														{
																
																 s11=Integer.parseInt(t11.getText().toString());
														
																
																  try {
																 	   BufferedReader br=new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
																       String id=br.readLine();	
																       BufferedWriter fw=new BufferedWriter(new FileWriter("SDCA DATA\\" + id +".txt",true));
																     
															            fw.write(ss1);
															            fw. write("\r\n");
															            fw.write(ss2);
															            fw. write("\r\n");
															            fw.write(ss3);
															            fw. write("\r\n");
															            fw.write(ss4);
															            fw. write("\r\n");
															            fw.write(ss5);
															            fw. write("\r\n");
															            fw.write(ss6);
															            fw. write("\r\n");
															            fw.write(ss7);
															            fw. write("\r\n");
															            fw.write(ss8);
															            fw. write("\r\n");
															            fw.write(ss9);
															            fw. write("\r\n");
															            fw.write(ss10);
															            fw. write("\r\n");
															            fw.write(ss11);
															            fw. write("\r\n");
															           
															            
															            total=(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11);
															            per=total*100/1000f;
															            if(total<400)
															            {
															            	result="FAIL";
															            }
															            else
															            {
															            	result="PASS";
															            }
															            String total1= String.valueOf(total);
															            String per1= String.valueOf(per);
															            fw.write(total1);
															            fw. write("\r\n");
															            fw.write(per1);
															            fw. write("\r\n");
															            fw.write(result);
															            
															            br.close();
															            fw.close();
															           
															        } catch (IOException iox) {
															            //do stuff with exception
															            iox.printStackTrace();
															        }
																 
																     
															      	frame3.dispose(); 
															      	JOptionPane.showMessageDialog(RootPaneContainer, "Student Data Have Been Saved.");
																    First f=new First();
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
				 }//end of else if
			 else
			 {
				 if(ss1.isEmpty())
				 {
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CT Mrks"); 
				 }
				  else if(Integer.parseInt(ss1)<0 ||Integer.parseInt(ss1)>100)
				 {
					 
					 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CT Marks");
				 } 
				
				else
				{
					 if(ss2.isEmpty())
					 {
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM-I Marks"); 
					 }
					 else if(Integer.parseInt(ss2)<0 ||Integer.parseInt(ss2)>100)
					 {
						 
						 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM-I Marks");
					 }
					 
					else
					{
						 if(ss3.isEmpty())
						 {
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP Marks"); 
						 }
						 else if(Integer.parseInt(ss3)<0 ||Integer.parseInt(ss3)>100)
						 {
							 
							 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP Marks");
						 }
						
						else
						{
							 if(ss4.isEmpty())
							 {
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE Mrks"); 
							 }
							 else if(Integer.parseInt(ss4)<0 ||Integer.parseInt(ss4)>100)
							 {
								 
								 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE Marks");
							 } 
							
							else
							{
								 if(ss5.isEmpty())
								 {
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EM Marks"); 
								 }
								 else if(Integer.parseInt(ss5)<0 ||Integer.parseInt(ss5)>100)
								 {
									 
									 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EM Marks");
								 }
								 
								else
								{
									 if(ss6.isEmpty())
									 {
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP Marks"); 
									 }
									 else if(Integer.parseInt(ss6)<0 ||Integer.parseInt(ss6)>100)
									 {
										 
										 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP Marks");
									 }
									
									else
									{
										
										
										 if(ss7.isEmpty())
										 {
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter EP-LAB Mrks"); 
										 }
										 else if(Integer.parseInt(ss7)<0 ||Integer.parseInt(ss7)>100)
										 {
											 
											 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid EP-LAB Marks");
										 } 
										
										else
										{
											 if(ss8.isEmpty())
											 {
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter CEE-LAB Marks"); 
											 }
											 else if(Integer.parseInt(ss8)<0 ||Integer.parseInt(ss8)>100)
											 {
												 
												 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid CEE-LAB Marks");
											 }
											 
											else
											{
												 if(ss9.isEmpty())
												 {
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter FOCP-LAB Marks"); 
												 }
												 else if(Integer.parseInt(ss9)<0 ||Integer.parseInt(ss9)>100)
												 {
													 
													 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid FOCP-LAB Marks");
												 }
												
												else
												{
													 if(ss10.isEmpty())
													 {
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter MD Mrks"); 
													 }
													 else if(Integer.parseInt(ss10)<0 ||Integer.parseInt(ss10)>100)
													 {
														 
														 JOptionPane.showMessageDialog(RootPaneContainer, "please Enter Valid MD Marks");
													 } 
													
													else
													{
														try {
																 	   BufferedReader br=new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
																       String id=br.readLine();	
																       BufferedWriter fw=new BufferedWriter(new FileWriter("SDCA DATA\\" + id +".txt",true));
																     
															            fw.write(ss1);
															            fw. write("\r\n");
															            fw.write(ss2);
															            fw. write("\r\n");
															            fw.write(ss3);
															            fw. write("\r\n");
															            fw.write(ss4);
															            fw. write("\r\n");
															            fw.write(ss5);
															            fw. write("\r\n");
															            fw.write(ss6);
															            fw. write("\r\n");
															            fw.write(ss7);
															            fw. write("\r\n");
															            fw.write(ss8);
															            fw. write("\r\n");
															            fw.write(ss9);
															            fw. write("\r\n");
															            fw.write(ss10);
															            fw. write("\r\n");
															         
															            
															            total=(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10);
															            per=total*100/1000f;
															            if(total<400)
															            {
															            	result="FAIL";
															            }
															            else
															            {
															            	result="PASS";
															            }
															            String total1= String.valueOf(total);
															            String per1= String.valueOf(per);
															            fw.write(total1);
															            fw. write("\r\n");
															            fw.write(per1);
															            fw. write("\r\n");
															            fw.write(result);
															            
															            br.close();
															            fw.close();
															           
															        } catch (IOException iox) {
															            //do stuff with exception
															            iox.printStackTrace();
															        }
																 
																     
															      	frame3.dispose(); 
															      	JOptionPane.showMessageDialog(RootPaneContainer, "Student Data Have Been Saved.");
																    First f=new First();
																
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
			 }//end of else
		 
			 }
			}
         );
        //end of submit button
         
             //start back button
	     b2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
		      frame3.dispose(); 
		      Second second=new Second();
		     }
			});  //end of back button  
	     }
}