import java.awt.*;
import java.awt.event.*;
import java.swing.*;

public class Counter implements ActionListener{

Jlabel Leftlabel;
Jlabel Rightlabel;

int leftcounter;
int rightcounter;

Counter(){
Jframe frame=new Jframe("Let's Count");
frame.setlayout(new Flowlayout());
frame.setsize(200,110);

JButton left=new JButton("Left");
JButton right=new JButton("Right");

leftcounter=0;
rightcounter=0;

left.addActionListener(this);
right.addActionListener(this);

frame.add(left);
frame.add(right);

leftlabel="Count: " + leftcounter;
Rightlabel="Count: " + rightcounter;

frame.add(leftlabel);
frame.add(rightlabel);

Jbutton Reset= new Jbutton("Reset");
Reset.addActionListener(this);
frame.add(Reset);

frame.setVisible(true);
}

public void actionperformed(ActionEvent ae) {
if(ae.getActionCommand().equals("Left")){
  leftcounter++;
  leftlabel.setText("Count"+Integer.toString(leftCount));
}
else if(ae.getActionCommand().equals("Right")){
  rightcounter++;
  leftlabel.setText("Count"+Integer.toString(rightrCount));
}
else if (ae.getActionCommand().equals("Reset")){
  rightcounter=0;
  rightcounter=0;
}
}


}





