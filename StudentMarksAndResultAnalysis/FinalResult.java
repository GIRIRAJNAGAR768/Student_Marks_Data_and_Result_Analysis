import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FinalResult extends Frame  {
	private static final long serialVersionUID = 1L;
	private Label welcome,marksleb,sub,marks,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,
	l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,t1,t2,t3,t4,t5,t6,t7,t8,t9,
	t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,l0,t0;
    Button submit,next,clear,b1,b2,back;
    public String name,fname,mname,id,l5get,l7get,namech,roll_no,data,sem;
	Choice ch,ch2,ch3;
	Label[] data1 = {l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19};
	
	public FinalResult()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
				try {
					String enroll=br.readLine();
					br.close();
					BufferedReader br2 = new BufferedReader(new FileReader("SDCA DATA\\"+enroll+".txt"));
					String line = br2.readLine();
					int i=0;
					while(i<=5)
					{
						 data=line;
						 line = br2.readLine();
						  i++;
					}
					     System.out.println(data);
						  br2.close();
					} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		   try {
					BufferedReader br2 = new BufferedReader(new FileReader("Sem_Subject\\"+data+".txt"));
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
			
		    l8 = data1[0];
			l9 = data1[1];
			l10 = data1[2];
			l11 = data1[3];
			l12 = data1[4];
			l13 = data1[5];
			l14 = data1[6];
			l15 = data1[7];
			l16 = data1[8];
			l17 = data1[9];
			l18 = data1[10];
			l19 = data1[11];
	 final Frame frame4= new Frame("FINAL RESULT");
	 Image icon = Toolkit.getDefaultToolkit().getImage("E:\\java\\icon.png");
	 welcome = new Label("STUDENT FINAL RESULT PAGE",Label.CENTER);
     welcome.setBounds(0,20,1500,80);
	 welcome.setFont(new Font("DIALOG",Font.BOLD,20));
	 welcome.setBackground(Color.GRAY);
	
	 l0 = new Label("ENROLLMENT NO:",Label.CENTER);
	 l0.setFont(new Font("DIALOG",Font.BOLD,16));
	 l0.setBounds(30,120,150,50);
	 
	 l1 = new Label("ST.NAME :",Label.CENTER);
	 l1.setFont(new Font("DIALOG",Font.BOLD,16));
	 l1.setBounds(30,170,130,50);
	 
	 l2 = new Label("FATHER NAME :",Label.CENTER);
	 l2.setFont(new Font("DIALOG",Font.BOLD,16));
	 l2.setBounds(30,220,130,50);
	 
	 l3 = new Label("MOTHER NAME :",Label.CENTER);
	 l3.setFont(new Font("DIALOG",Font.BOLD,16));
	 l3.setBounds(30,270,130,50);
	 
	 l4 = new Label("COLLEGE ID :");
	 l4.setBounds(500,120,130,50);
	 l4.setFont(new Font("DIALOG",Font.BOLD,16));
     
	 l5 = new Label("SELECT YEAR : ");
	 l5.setFont(new Font("DIALOG",Font.BOLD , 15));
	 l5.setBounds(500,170,130,50);
	 
	 l6 = new Label("DATE OF BIRTH :");
	 l6.setFont(new Font("Dialog",Font.BOLD,15));
	 l6.setBounds(500,220,130,50);
	 
	 l7 = new Label("BRANCH :",Label.CENTER);
	 l7.setFont(new Font("DIALOG",Font.BOLD,16));
	 l7.setBounds(500,270,130,50);
	 
	 marksleb = new Label("MARKS AND RESULT DETAILS",Label.CENTER);
	 marksleb.setBounds(0,320,1500,50);
	 marksleb.setFont(new Font("DIALOG",Font.BOLD,20));
	 marksleb.setBackground(Color.GRAY);

	 sub = new Label("SUBJECT :",Label.RIGHT);
	 sub.setFont(new Font("DIALOG",Font.BOLD,15));
	 sub.setBounds(110,380,220,45);
	 sub.setBackground(Color.GRAY);
	 
	 marks = new Label("MARKS(OBT.MARKS) :",Label.RIGHT);
	 marks.setFont(new Font("DIALOG",Font.BOLD,15));
	 marks.setBounds(340,380,220,45);
	 marks.setBackground(Color.GRAY);
	 
      //l8 = new Label("CT(100) :",Label.CENTER);
      l8.setFont(new Font("DIALOG",Font.BOLD,16));
      l8.setBounds(110,430,220,40);
      t10= new Label("");
      t10.setBounds(340,435,35,30);
      t10.setBackground(Color.WHITE);  
      t10.setFont(new Font("DIALOG",Font.BOLD,16)); 
 
      l9.setFont(new Font("DIALOG",Font.BOLD,16));
      l9.setBounds(130,470,190,40);
      t11= new Label();
      t11.setBounds(340,475,35,30);
      t11.setBackground(Color.WHITE);   
      t11.setFont(new Font("DIALOG",Font.BOLD,16)); 
 
     l10.setFont(new Font("DIALOG",Font.BOLD,16));
     l10.setBounds(130,510,190,40);
     t12= new Label("");
     t12.setBounds(340,515,35,30);
     t12.setBackground(Color.WHITE);  
     t12.setFont(new Font("DIALOG",Font.BOLD,16)); 
 
     l11.setFont(new Font("DIALOG",Font.BOLD,16));
     l11.setBounds(130,550,190,40);
     t13= new Label("");
     t13.setBounds(340,555,35,30);
     t13.setBackground(Color.WHITE);  
     t13.setFont(new Font("DIALOG",Font.BOLD,16)); 
 
     l12.setFont(new Font("DIALOG",Font.BOLD,16));
     l12.setBounds(80,590,240,40);
     t14= new Label("");
     t14.setBounds(340,595,35,30);
     t14.setBackground(Color.WHITE);   
     t14.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l13.setFont(new Font("DIALOG",Font.BOLD,16));
     l13.setBounds(130,630,190,40);
     t15= new Label("");
     t15.setBounds(340,635,35,30);
     t15.setBackground(Color.WHITE);  
     t15.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l14.setFont(new Font("DIALOG",Font.BOLD,16));
     l14.setBounds(500,430,250,40);
     t16= new Label("");
     t16.setBounds(770,435,35,30);
     t16.setBackground(Color.WHITE);   
     t16.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l15.setFont(new Font("DIALOG",Font.BOLD,16));
     l15.setBounds(500,470,250,40);
     t17= new Label("");
     t17.setBounds(770,475,35,30);
     t17.setBackground(Color.WHITE);  
     t17.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l16.setFont(new Font("DIALOG",Font.BOLD,16));
     l16.setBounds(500,510,250,40);
     t18= new Label("");
     t18.setBounds(770,515,35,30);
     t18.setBackground(Color.WHITE);   
     t18.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l17.setFont(new Font("DIALOG",Font.BOLD,16));
     l17.setBounds(500,550,250,40);
     t19= new Label("");
     t19.setBounds(770,555,35,30);
     t19.setBackground(Color.WHITE); 
     t19.setFont(new Font("DIALOG",Font.BOLD,16)); 

     if(data.equals("3RD SEM")|| data.equals("6TH SEM") ||  data.equals("7TH SEM"))
     {
     l18.setFont(new Font("DIALOG",Font.BOLD,16));
     l18.setBounds(500,590,250,40);
     t20= new Label("");
     t20.setBounds(770,595,35,30);
     t20.setBackground(Color.WHITE);  
     t20.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l19.setFont(new Font("DIALOG",Font.BOLD,16));
     l19.setBounds(500,630,250,40);
     t21= new Label("");
     t21.setBounds(770,635,35,30);
     t21.setBackground(Color.WHITE);   
     t21.setFont(new Font("DIALOG",Font.BOLD,16));
     
     }
     if(data.equals("1ST SEM")|| data.equals("2ND SEM") ||  data.equals("4TH SEM") ||  data.equals("5TH SEM"))
     {
    	 l18.setFont(new Font("DIALOG",Font.BOLD,16));
         l18.setBounds(500,590,250,40);
         t20= new Label("");
         t20.setBounds(770,595,35,30);
         t20.setBackground(Color.WHITE);  
         t20.setFont(new Font("DIALOG",Font.BOLD,16));  
     }
     
     l20 = new Label("TOTAL : ",Label.RIGHT);
     l20.setFont(new Font("DIALOG",Font.BOLD,16));
     l20.setBounds(800,430,190,40);
     t25= new Label("1000");
     t25.setBounds(1010,435,60,30);
     t25.setBackground(Color.WHITE);   
     t25.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l21 = new Label("OBT.MARKS : ",Label.RIGHT);
     l21.setFont(new Font("DIALOG",Font.BOLD,16));
     l21.setBounds(800,470,190,40);
     t22= new Label("");
     t22.setBounds(1010,475,60,30);
     t22.setBackground(Color.WHITE);  
     t22.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     
     l22 = new Label("PERCENT : ",Label.RIGHT);
     l22.setFont(new Font("DIALOG",Font.BOLD,16));
     l22.setBounds(800,510,190,40);
     t23= new Label("");
     t23.setBounds(1010,515,60,30);
     t23.setBackground(Color.WHITE);   
     t23.setFont(new Font("DIALOG",Font.BOLD,16)); 
     
     l23 = new Label("RESULT : ",Label.RIGHT);
     l23.setFont(new Font("DIALOG",Font.BOLD,16));
     l23.setBounds(800,550,190,40);
     t24= new Label("");
     t24.setBounds(1010,555,60,30);
     t24.setBackground(Color.WHITE); 
     t24.setFont(new Font("DIALOG",Font.BOLD,16)); 

     t0= new Label("");
     t0.setBounds(180,130,250,30);
     t0.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t0.setBackground(Color.WHITE); 

     t1= new Label("");
     t1.setBounds(180,180,250,30);
     t1.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t1.setBackground(Color.WHITE);
	 
	 t2= new Label("");
     t2.setBounds(180,230,250,30);
     t2.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t2.setBackground(Color.WHITE);
	 
	 t3= new Label("");
     t3.setBounds(180,280,250,30);
     t3.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t3.setBackground(Color.WHITE);
	 
	 t4= new Label("");
     t4.setBounds(640,130,200,30);
     t4.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t4.setBackground(Color.WHITE);
	 
	 t5= new Label("");
     t5.setBackground(Color.WHITE);
     t5.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t5.setBounds(640,180,200,30);
	 
	 t6 = new Label("");
	 t6.setBackground(Color.WHITE);
     t6.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t6.setBounds(640,230,30,30);
	 
	 t7 = new Label("");
	 t7.setBackground(Color.WHITE);
     t7.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t7.setBounds(680,230,30,30);
	 
	 t8 = new Label("");
	 t8.setBackground(Color.WHITE);
     t8.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t8.setBounds(720,230,50,30);
	 
	 t9= new Label("");
     t9.setBackground(Color.WHITE);
     t9.setFont(new Font("DIALOG",Font.BOLD , 16));
	 t9.setBounds(640,280,200,30);
	
	 next = new Button("NEXT");
	 next.setBounds(950,650,100,50);
	 next.setFont(new Font("DIALOG",Font.BOLD,25));
	 back=new Button("BACK");
	 back.setBounds(850,650,100,50);
	 back.setFont(new Font("DIALOG",Font.BOLD,25));
	 
	 frame4.add(l0);
	 frame4.add(l1);
	 frame4.add(l2);
     frame4.add(l5);
	 frame4.add(l3);
	 frame4.add(l4);
	 frame4.add(l6);
	 frame4.add(l7);
	 frame4.add(l8);
	 frame4.add(l9);
     frame4.add(l10);
	 frame4.add(l11);
	 frame4.add(l12);
	 frame4.add(l13);
	 frame4.add(l14);
	 frame4.add(l15);
	 frame4.add(l16);
     frame4.add(l17);
	 
     frame4.add(l20);
     frame4.add(l21);
	 frame4.add(l22);
	 frame4.add(l23);
	 
	 frame4.add(t22);
	 frame4.add(t23);
	 frame4.add(t24);
	 frame4.add(t25);


	 frame4.add(t0);
	 frame4.add(t1);
	 frame4.add(t2);
	 frame4.add(t3);
	 frame4.add(t4);
	 frame4.add(t5);
	 frame4.add(t6);
	 frame4.add(t7);
	 frame4.add(t8);
	 frame4.add(t9);
	 frame4.add(t10);
	 frame4.add(t11);
	 frame4.add(t12);
	 frame4.add(t13);
	 frame4.add(t14);
	 frame4.add(t15);
	 frame4.add(t16);
	 frame4.add(t17);
	 frame4.add(t18);
	 frame4.add(t19);
	
	 if(data.equals("1ST SEM") || data.equals("2ND SEM") || data.equals("4TH SEM") || data.equals("5TH SEM"))
	 {
		 frame4.add(l18);
		 frame4.add(t20);
	 }
	 else if(data.equals("3RD SEM") || data.equals("6TH SEM") || data.equals("7TH SEM"))
	 {
        frame4.add(l18);
		frame4.add(t20);
		frame4.add(l19);
		frame4.add(t21);
	}
	
	 frame4.add(welcome);
	 frame4.add(marksleb);
	 frame4.add(marks);
	 frame4.add(sub);
	 frame4.setIconImage(icon);
	 frame4.add(back);
	 frame4.add(next);
	 frame4.setSize(1500,730);
     frame4.setBackground(Color.LIGHT_GRAY);
	 frame4.setLayout(null);
     frame4.setVisible(true);
	 frame4.setResizable(false);
     frame4.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){System.exit(0);}
         
       
	 });
      
     if(data.equals("8TH SEM"))
     {
	try {
	BufferedReader br = new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
	Label data[]={t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t22,t23,t24};
	int i=0;
		try {
			String enroll=br.readLine();
			br.close();
			BufferedReader br2 = new BufferedReader(new FileReader("SDCA DATA\\"+enroll+".txt"));
			String line = br2.readLine();
			
			while(line!=null)
			{
				 data[i].setText(line);
				 line = br2.readLine();
				 
				  i++;
			}
				  br2.close();
			
			
			
			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 }
    	 else if(data.equals("1ST SEM") || data.equals("2ND SEM") || data.equals("4TH SEM") || data.equals("5TH SEM"))
	 {
		 try {
				BufferedReader br = new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
				Label data[]={t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t22,t23,t24};
				int i=0;
					try {
						String enroll=br.readLine();
						br.close();
						BufferedReader br2 = new BufferedReader(new FileReader("SDCA DATA\\"+enroll+".txt"));
						String line = br2.readLine();
						while(line!=null)
						{
							 data[i].setText(line);
							 line = br2.readLine();
							  i++;
						}
							  br2.close();
						} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	 
	 }
     else
	 {
		 try {
				BufferedReader br = new BufferedReader(new FileReader("SDCA DATA\\temp.txt"));
				Label data[]={t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24};
				int i=0;
					try {
						String enroll=br.readLine();
						br.close();
						BufferedReader br2 = new BufferedReader(new FileReader("SDCA DATA\\"+enroll+".txt"));
						String line = br2.readLine();
						while(line!=null)
						{
							 data[i].setText(line);
							 line = br2.readLine();
						  i++;
						}
							  br2.close();
						} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	 }
	
	  back.addActionListener(new ActionListener(){
	 @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e){
     frame4.dispose(); 
	 Result result=new Result();
	 
    }
	}); 
    next.addActionListener(new ActionListener(){
	  @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e){
		  frame4.dispose();
        First first=new First();
        
         }
});

}
	}