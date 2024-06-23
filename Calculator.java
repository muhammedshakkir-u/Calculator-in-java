import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Calculator implements ActionListener {
JFrame jf;
JLabel displayLabel;
String oldvalue,operator;
JButton
sevenButton,eightButton,nineButton,sixButton,fiveButton,fourButton,
threeButton,twoButton,oneButton,zeroButton;
JButton plusButton,minusButton,mulButton,
divButton,dotButton,equalButton,clearButton;
boolean isOperatorClicked=false;
public Calculator() {
jf=new JFrame("Calculator");
jf.setLayout(null);
jf.setSize(550,700);
jf.setLocation(550,280);
jf.getContentPane().setBackground(Color.lightGray);
displayLabel = new JLabel();
displayLabel.setBounds(40,40,400,50);
displayLabel.setBackground(Color.gray);
displayLabel.setOpaque(true);
displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
displayLabel.setForeground(Color.white);
jf.add(displayLabel);
sevenButton=new JButton("7");
sevenButton.setBounds(30,130,80,80);
sevenButton.addActionListener(this);
sevenButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(sevenButton);

eightButton=new JButton("8");
eightButton.setBounds(130,130,80,80);
eightButton.addActionListener(this);
eightButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(eightButton);

nineButton=new JButton("9");
nineButton.setBounds(230,130,80,80);
nineButton.addActionListener(this);
nineButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(nineButton);

fourButton=new JButton("4");
fourButton.setBounds(30,230,80,80);
fourButton.addActionListener(this);
fourButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(fourButton);

fiveButton=new JButton("5");
fiveButton.setBounds(130,230,80,80);
fiveButton.addActionListener(this);
fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(fiveButton);


sixButton=new JButton("6");
sixButton.setBounds(230,230,80,80);
sixButton.addActionListener(this);
sixButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(sixButton);

oneButton=new JButton("1");
oneButton.setBounds(30,330,80,80);
oneButton.addActionListener(this);
oneButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(oneButton);

twoButton=new JButton("2");
twoButton.setBounds(130,330,80,80);
twoButton.addActionListener(this);
twoButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(twoButton);


threeButton=new JButton("3");
threeButton.setBounds(230,330,80,80);
threeButton.addActionListener(this);
threeButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(threeButton);



dotButton=new JButton(".");
dotButton.setBounds(30,430,80,80);
dotButton.addActionListener(this);
dotButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(dotButton);

zeroButton=new JButton("0");
zeroButton.setBounds(130,430,80,80);
zeroButton.addActionListener(this);
zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(zeroButton);

equalButton=new JButton("=");
equalButton.setBounds(230,430,80,80);
equalButton.addActionListener(this);
equalButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(equalButton);

divButton=new JButton("/");
divButton.setBounds(330,130,80,80);
divButton.addActionListener(this);
divButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(divButton);

mulButton=new JButton("x");
mulButton.setBounds(330,230,80,80);
mulButton.addActionListener(this);
mulButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(mulButton);

minusButton=new JButton("-");
minusButton.setBounds(330,330,80,80);
minusButton.addActionListener(this);
minusButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(minusButton);

plusButton=new JButton("+");
plusButton.setBounds(330,430,80,80);
plusButton.addActionListener(this);
plusButton.setFont(new Font("Arial",Font.PLAIN,30));
jf.add(plusButton);

clearButton=new JButton("clear");
clearButton.setBounds(430,430,80,80);
clearButton.addActionListener(this);
clearButton.setFont(new Font("Arial",Font.PLAIN,20));
jf.add(clearButton);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==sevenButton) {
if(isOperatorClicked) {
displayLabel.setText("7");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"7");
}
}
else if
 (e.getSource()==eightButton){
if(isOperatorClicked) {
displayLabel.setText("8");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"8");
}
}
else if(e.getSource()==nineButton){
if(isOperatorClicked) {
displayLabel.setText("9");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"9");
}
}
else if(e.getSource()==fourButton){
if(isOperatorClicked) {
displayLabel.setText("4");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"4");
}
}
else if(e.getSource()==fiveButton){
if(isOperatorClicked) {
displayLabel.setText("5");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"5");
}
}
else if(e.getSource()==sixButton){
if(isOperatorClicked) {
displayLabel.setText("6");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"6");
}
}
else if(e.getSource()==oneButton){
if(isOperatorClicked) {
displayLabel.setText("1");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"1");
}
}
else if(e.getSource()==twoButton){
if(isOperatorClicked) {
displayLabel.setText("2");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"2");
}
}
else if(e.getSource()==threeButton){
if(isOperatorClicked) {
displayLabel.setText("3");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"3");
}
}
else if(e.getSource()==zeroButton){
if(isOperatorClicked) {
displayLabel.setText("0");
isOperatorClicked=false;
}
else {
displayLabel.setText(displayLabel.getText()+"0");
}
}
else if(e.getSource()==dotButton){
displayLabel.setText(displayLabel.getText()+".");
}
else if(e.getSource()==clearButton) {
displayLabel.setText("");
}
else if(e.getSource()==plusButton){
isOperatorClicked=true;
oldvalue=displayLabel.getText();
operator="+";
}
else if(e.getSource()==minusButton){
isOperatorClicked=true;
oldvalue=displayLabel.getText();
operator="-";
}
else if(e.getSource()==mulButton){
isOperatorClicked=true;
oldvalue=displayLabel.getText();
operator="x";
}
else if(e.getSource()==divButton) {
isOperatorClicked=true;
oldvalue=displayLabel.getText();
operator="/";
}
else if(e.getSource()==equalButton) {
float oldValueF=Float.parseFloat(oldvalue);
float newValue=Float.parseFloat(displayLabel.getText());
if(operator=="+") {
displayLabel.setText((oldValueF+newValue)+"");
}
else if(operator=="-") {
displayLabel.setText((oldValueF-newValue)+"");
}
else if(operator=="x" ) {
displayLabel.setText((oldValueF*newValue)+"");
}
else if(operator=="/") {
if(newValue==0) {
displayLabel.setText("Division by zero notpossible");
}
else {
displayLabel.setText((oldValueF/newValue)+"");
  }
 }
 }
}
}