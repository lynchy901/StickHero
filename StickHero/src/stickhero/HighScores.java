package stickhero;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HighScores extends JPanel implements ActionListener
{
    private JLabel title = new JLabel("High Scores"); 
    private JLabel score1, score2,  score3 ,score4, score5;
    private JTextField text = new JTextField();
    private ArrayList<Integer> scoreList = new ArrayList();
    private int[] top5 = new int[5];
    public JButton mainMenu;
    
    MainFrame parentMainFrame;
    
    public HighScores(MainFrame parentMainFrame)
    {
        this.parentMainFrame = parentMainFrame;
        this.setLayout(null);
        this.add(title);
        title.setBounds(300,100,200,50);
        
//        this.add(text);
        this.add(mainMenu = new JButton("Main Menu"));
        mainMenu.setBounds(300,500,100,100);
        mainMenu.addActionListener(this);
        
        this.add(score1 = new JLabel("Score1 = " +top5[0]));
        score1.setBounds(200,200,400,50);
        
        this.add(score2 = new JLabel("Score2 = " +top5[1]));
        score2.setBounds(200,250,400,50);
        
        this.add(score3 = new JLabel("Score3 = " +top5[2]));
        score3.setBounds(200,300,400,50);
        
        this.add(score4 = new JLabel("Score4 = "+top5[3]));
        score4.setBounds(200,350,400,50);
        
        this.add(score5 = new JLabel("Score5 = "+top5[4]));
        score5.setBounds(200,400,400,50);
        
    }
    
    public void readScores() throws IOException {
        System.out.println("Read scores has been called");
        try 
            {
                FileReader in = new FileReader("scores.txt");
        	BufferedReader inStream = new BufferedReader(in); 
        	String line = inStream.readLine();

        	while (line != null && line != "") 
        	{   
                    line = inStream.readLine();
                    scoreList.add(Integer.parseInt(line));
                    System.out.println(line);
                    System.out.println(line);
                    
        	}

         inStream.close();  
         
         displayHighestScores();

     	} 
     	catch (FileNotFoundException e) 
     	{
                System.out.println("errer");
        	 System.err.println("IOERROR: File NOT Found: \n");
        	 e.printStackTrace();
        }
    }
    
    public void displayHighestScores() {
        int highest = scoreList.get(0);
        int counter = 0;
        int index = 0;
        
//        if (scoreList.size() < 5) {
//            counter = scoreList.size();
//        } else {
//            counter = 5;
//        }
//        
//        for (int i = 0; i < counter; i++) {
//            for (int x = i + 1; x < scoreList.size(); x++) {
//                if (Integer.parseInt(scoreList.get(i)) > highest) {
//                    highest = Integer.parseInt(scoreList.get(i));
//                }
//            }
                int temp;
        
        for(int i=0;i<scoreList.size()-1;i++)
        {
            for(int j = 1;j<scoreList.size()-i;j++)
            {
                if(scoreList.get(j-1) > scoreList.get(j))
                {
                    temp = scoreList.get(j-1);
                    scoreList.set((j-1),(scoreList.get(j)));
                    scoreList.set((j),temp);
                }
            }  
        }
        

    score1.setText("Score1 = "+top5[0]);
    score2.setText("Score2 = "+top5[1]);
    score3.setText("Score3 = "+top5[2]);
    score4.setText("Score4 = "+top5[3]);
    score5.setText("Score5 = "+top5[4]);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    Object event = e.getSource();
    if (event == mainMenu)
    {
        parentMainFrame.switchPanel(this,parentMainFrame.getMainMenuPanel());        
    }
    }
}