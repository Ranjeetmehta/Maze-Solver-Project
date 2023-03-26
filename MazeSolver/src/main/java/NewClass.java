
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ranjeet Kumar
 */
public class NewClass extends JFrame{
    private int[][] maze={
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,1,0,1,0,0,1,1,0,1},
        {1,0,0,0,0,0,1,0,0,0,0,0,1},
        {1,0,0,1,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,1,0,1,1,1,0,1},
        {1,0,1,0,1,0,1,0,0,0,1,0,1},
        {1,0,0,0,0,0,0,0,1,1,0,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    
    
    public ArrayList<Integer> path=new ArrayList<>();
    public NewClass(){
    setSize(600,500);
    setTitle("MAZE SOLVER");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    DepthFirstSearch.searchpath(maze, 1, 1, path);
//    System.out.println(path); 
    }
    
     @Override
   public void paint(Graphics  g){
       g.translate(50, 50);
    for(int i=0;i<maze.length;i++){
        for(int j=0;j<maze[0].length;j++){
            Color color;
            switch(maze[i][j]){
                case 1: color=Color.CYAN;
                break;
                case 9: color=Color.RED;
                break;
                default:color=Color.WHITE;
                break;
            }
        g.setColor(color);
            g.fillRect(30*j,30*i,30,30);
            g.setColor(Color.GREEN);
            g.drawRect(30*j,30*i,30,30);
           
            
        }
    }
    for(int i=0;i<path.size();i+=2){
        int pathx=path.get(i);
        int pathy=path.get(i+1);
        System.out.println("x codinates"+ pathx);
        System.out.println("x codinates"+ pathy);
        g.setColor(Color.YELLOW);
        g.fillRect(30*pathx, 30*pathy, 30, 30);
        
    }
   }
     public static void main(String[] args){
    NewClass view = new NewClass();
    view.setVisible(true);
}
    
}
