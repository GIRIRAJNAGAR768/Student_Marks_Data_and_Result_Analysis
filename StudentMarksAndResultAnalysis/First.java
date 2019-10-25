import java.awt.*;
import java.awt.event.*; 

public class First extends Frame{
	private static final long serialVersionUID = 1L;
	Label lname,lfname,lmname,lroll,welcome,year,date,base,branch;
	String name1;
        Button ns,sr,rank,ed;
        TextField t1,t2,t3,t4,dd,mm,yy;
        String name,fname,mname,roll_no;
	Choice ch,ch2;
		
	    public First()
	    {
		 final Frame frame1 = new Frame("STUDENT DATA COLLECTOR AND ANALYSIS");
		 Image icon = Toolkit.getDefaultToolkit().getImage("E:\\java\\icon.png");
		
		 ns = new Button("NEW STUDENT");
		 ns.setBounds(135,250,300,50);
		 ns.setFont(new Font("DIALOG",Font.BOLD,30));
		 ns.setBackground(Color.WHITE);
		 
		 sr = new Button("SHOW RESULT");
		 sr.setBounds(135,310,300,50);
		 sr.setFont(new Font("DIALOG",Font.BOLD,30));
		 sr.setBackground(Color.WHITE);
		 
		
		 frame1.add(ns);
		 frame1.add(sr);
		 frame1.setIconImage(icon);
		 frame1.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){System.exit(0);}
		 });
		 ns.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
		      frame1.dispose(); 
			 Second second=new Second();
		     }
			}); 
       	        sr.addActionListener(new ActionListener(){
			  @SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e){
				  frame1.dispose();
		         Result result=new Result();
		          }
		 });
	  	 frame1.add(ns);
		 frame1.setSize(600,600);
		 frame1.setResizable(false);
		 frame1.setLayout(null);
		 frame1.setVisible(true);
                 frame1.setBackground(Color.LIGHT_GRAY); 
		 }   
	    //end of resister
    		//main method
		
       public static void main(String[] args){
			First first=new First();
    }
} 