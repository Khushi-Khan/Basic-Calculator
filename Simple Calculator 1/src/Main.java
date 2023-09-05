import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener {
    Frame f;
    Panel p;
    Button b[] = new Button[4];
    String Caption[] = {"+", "-", "*", "/"};
    TextField t1, t2, t3;

    Main() {
        f = new Frame();
        p = new Panel();
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        f.setLayout(new GridLayout(4,1));
        for (int i = 0; i < 4; i++) {
            b[i] = new Button(Caption[i]);
            b[i].setFont(new Font("Arial", 1, 18));
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        f.add(t1);
        f.add(t2);
        f.add(p);
        f.add(t3);

        f.setVisible(true);
        f.setSize(300, 300);
    }

    public static void main(String ar[]) {

        Main e = new Main();
    }

    public void actionPerformed(ActionEvent e) {
        Button bt = (Button)e.getSource();
        int a, b, c;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        if(bt.getLabel()=="+"){
            c=a+b;
            t3.setText(" "+c);
        }
        if(bt.getLabel()=="-"){
            c=a-b;
            t3.setText(" "+c);
        }
        if(bt.getLabel()=="*"){
            c=a*b;
            t3.setText(" "+c);
        }
        if(bt.getLabel()=="/"){
            c=a/b;
            t3.setText(" "+c);
        }
    }
}