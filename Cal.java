import java.awt.*; import
java.awt.event.*;import
java.applet.*;
public class Cal extends Applet implements ActionListener
{
    String msg=" ";int
        v1,v2,result;
    TextField t1;
    Button b[]=new Button[10];
    Button add,sub,mul,div,clear,mod,EQ;char
        OP;
    public void init()
    {
        Color k=new Color(160, 10, 16);
        setBackground(k);
        t1=new TextField(10);
        GridLayout gl=new GridLayout(4,5);
        setLayout(gl);
        for(int i=0;i<10;i++)
        {
            b[i]=new Button(""+i);
        }
        add=new Button("add");
        sub=new Button("sub");
        mul=new Button("mul");
        div=new Button("div");
        mod=new Button("mod");
        clear=new Button("clear");
        EQ=new Button("EQ");
        t1.addActionListener(this);
        add(t1);
        for(int i=0;i<10;i++)
        {
            add(b[i]);}
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQ);
        for(int i=0;i<10;i++)
        {
            b[i].addActionListener(this);
        }
        add.addActionListener(this);

        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand(); char ch=str.charAt(0); if (
            Character.isDigit(ch)) t1.setText(t1.getText()+str); else
    if(str.equals("add"))
    {
        v1=Integer.parseInt(t1.getText());
        OP='+';
        t1.setText("");
    }
    else if(str.equals("sub"))
    {
        v1=Integer.parseInt(t1.getText()); OP='-';t1.setText("");
    } else if(str.equals("mul"))
    {
        v1=Integer.parseInt(t1.getText());
        OP='*';
        t1.setText("");
    }
    else if(str.equals("div"))
    {
        v1=Integer.parseInt(t1.getText());
        OP='/';
        t1.setText("");
    }
    else if(str.equals("mod"))
    {
        v1=Integer.parseInt(t1.getText());
        OP='%';
        t1.setText("");
    }
       
