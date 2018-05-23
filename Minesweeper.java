/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gagordon
 */
public class Minesweeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Random rand=new Random();
    int[][] _mineField;
    char[][] _PlayingBoard;
    int r;
    int c;
    
    
        _mineField=new int[10][10];
        _PlayingBoard=new char[10][10];
            
    
   
        int boardSize=10;
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                _PlayingBoard[i][j]='_';
            }
        }
    
    //matrix of mines
    //initiated at 0
   
    for(int i=0;i<_mineField.length;i++){
        for(int j=0;j<_mineField.length;j++){
            _mineField[i][j]=0;
            }
        }
       
    //takes the matrix of mines
  
        boolean bool=true;
       
        for(int i=0;i<10;i++){

            do{
                r=rand.nextInt(8)+1;
                c=rand.nextInt(8)+1;
                if(_mineField[r][c]==-1){
                    bool=false;
                }else{
                    bool=true;
                    _mineField[r][c]=-1;
                }
            }while(bool);

        }
     
        
        int count=0;
        for( r=1;r<_mineField.length-2;r++){
            for( c=1;c<_mineField.length-2;c++){
                if((_mineField[r][c]==-1)&&(_mineField[r-1][c-1]!=-1)){
                    _mineField[r-1][c-1]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r][c-1]!=-1)){
                    _mineField[r][c-1]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r+1][c-1]!=-1)){
                    _mineField[r+1][c-1]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r-1][c]!=-1)){
                    _mineField[r-1][c]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r+1][c]!=-1)){
                    _mineField[r+1][c]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r-1][c+1]!=-1)){
                    _mineField[r-1][c+1]++;}
                } if((_mineField[r][c]==-1)&&(_mineField[r][c+1]!=-1)){
                    _mineField[r][c+1]++;
                } if((_mineField[r][c]==-1)&&(_mineField[r+1][c+1]!=-1)){
                    _mineField[r+1][c+1]++;
                }
        }
    
        int Use;
        for(r=0;r<10;r++){
            System.out.println(" ");
            for(c=0;c<10;c++){
                Use=_mineField[r][c];
                System.out.print(Use+"\t");
            }
        }
     
    }
    
}
