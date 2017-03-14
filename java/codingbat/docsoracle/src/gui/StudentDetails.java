// http://www.dailyfreecode.com/code/gui-application-java-which-enter-2052.aspx
package gui;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class StudentDetails extends Frame implements ActionListener
{
    String msg="";
    Button btnNew,btnSubmit,btnView;
    Label lblName,lblAge,lblAddr,lblGender,lblQua;
    TextField txtName,txtAge;
    TextArea txtAddr,txtAns;
    CheckboxGroup ChkGrp;
    Checkbox chkMale,chkFemale;
    Checkbox chkMca,chkBca,chkBba,chkMba;
 
    StudentDetails(String name)
    {    
        super(name);
        setLayout(new GridLayout(3,2));

        lblName = new Label("Name: ");
        lblAge = new Label("Age: ");
        lblAddr = new Label("Address : ");
        lblGender = new Label("Gender: ");
        lblQua = new Label("Qualification: ");
        txtName = new TextField(20);
        txtAge = new TextField(20);
        txtAddr = new TextArea();
        ChkGrp = new CheckboxGroup();
        chkMale = new Checkbox("Male",ChkGrp,false);
        chkFemale = new Checkbox("Female",ChkGrp,false); 
        chkMca = new Checkbox("MCA");
        chkBca = new Checkbox("BCA");
        chkMba = new Checkbox("MBA");
        chkBba = new Checkbox("BBA");
        btnNew = new Button("NEW");
        btnSubmit = new Button("SUBMIT");
        btnView = new Button("VIEW");
        
        btnNew.addActionListener(this);
        btnSubmit.addActionListener(this);
        btnView.addActionListener(this);

        add(lblName);
        add(txtName);
        add(lblAge);
        add(txtAge);
        add(lblAddr);
        add(txtAddr);
        add(lblGender);
        add(chkMale);
        add(chkFemale);
        add(lblQua);
        add(chkBca);
        add(chkBba); 
        add(chkMca);
        add(chkMba); 
    
        add(btnNew);
        add(btnSubmit);
        add(btnView);
        
        txtAns = new TextArea();
        add(txtAns);
        
    }    
        
    public void actionPerformed(ActionEvent ae)
    {
        String s="";
        boolean b;
        FileInputStream Fin;
        DataInputStream dis;
        FileOutputStream Fout;
        DataOutputStream dos;
        
        try
        {
            Fout = new FileOutputStream("Biodata.txt",true);
            dos = new DataOutputStream(Fout);
        
            String str = ae.getActionCommand();
            if(str.equals("SUBMIT"))
            {
            
                s=txtName.getText().trim();
                dos.writeUTF(s);
            
                dos.writeInt(Integer.parseInt(txtAge.getText()));

                s=txtAddr.getText();
                
                dos.writeUTF(s);
                if(chkMale.getState())
                    dos.writeUTF("Male ");
                if(chkFemale.getState())
                    dos.writeUTF("Female ");

                s="";                    
                if(chkMca.getState())
                    s="MCA ";    
                                
                if(chkBca.getState())
                    s+="BCA ";                        

                if(chkBba.getState())
                    s+="BBA ";    
                    
                if(chkMba.getState())
                    s+="MBA ";    
                    
                s+="!";
                dos.writeUTF(s);
                Fout.close();
            } 
            
            if(str.equals("VIEW"))
            {
                String tmp,name,addr,gender,qual;
                int age;
                Fin = new FileInputStream("Biodata.txt");
                dis = new DataInputStream(Fin);

        
                int i=0,j;
                
                while(Fin.available()>0)
                {
                    name = dis.readUTF();
                    age  = dis.readInt();
                    addr = dis.readUTF();
                    gender = dis.readUTF();
                    qual = dis.readUTF();

                    if(name.equals(txtName.getText().trim()))
                      {
                        txtAge.setText(age+"");                    
                        txtAddr.setText(addr);
                        if(gender.equals("Male "))
                            chkMale.setState(true);
                        else
                            chkFemale.setState(true);
                        while(qual.charAt(i)!='!')
                        {
                            j=qual.indexOf(' ');
                            tmp = qual.substring(i,j);
    
                            if(tmp.equals("MCA"))
                                chkMca.setState(true);                    

                            if(tmp.equals("BCA"))
                                chkBca.setState(true);                    

                            if(tmp.equals("BBA"))
                                chkBba.setState(true);                    

                            if(tmp.equals("MBA"))
                                chkMba.setState(true);
                            i=j+1;
                        }
                        break;
                    }
                }
                Fin.close();    
            }

            if(str.equals("NEW"))
            {
                txtName.setText("");
                txtAge.setText("");                    
                txtAddr.setText("");
                chkMale.setState(false);
                chkFemale.setState(false);
                chkMca.setState(false);                    
                chkBca.setState(false);                    
                chkBba.setState(false);                    
                chkMba.setState(false);
            }
        }
        catch(Exception e)
        {
            System.out.println("The Exception Is : " +e);
        }

    }

}

class Bio2
{

    public static void main(String args[])
    {
        try{
            StudentDetails F = new StudentDetails("Biodata");
            F.setSize(400,400);
            F.show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    

}