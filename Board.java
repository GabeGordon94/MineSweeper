/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gagordon
 */
public class Board {
    Scanner in=new Scanner(System.in);
    Random rand=new Random();
    private int[][] _mineField;
    private char[][] _PlayingBoard;
    private int r;
    private int c;
    
    //constructor
    public Board(){
        _mineField=new int[10][10];
        _PlayingBoard=new char[10][10];
            
    }
    //creates board
    public void PlayingBoard(){
        int boardSize=10;
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                _PlayingBoard[i][j]='_';
            }
        }
    }
    //matrix of mines
    //initiated at 0
    public void MinesBoard(){
    for(int i=0;i<_mineField.length;i++){
        for(int j=0;j<_mineField.length;j++){
            _mineField[i][j]=0;
            }
        }
    }    
    //takes the matrix of mines
    //adds 10 random mines 
    //mines will never be on the edges
    public void randomMines(){
        boolean bool=true;
        int r;
        int c;
        int min=1;
        int max=8;
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
    }
    //Need help adding numbers where bombs are
    public void setPlayingBoard(){
        
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
    
    }
}

    


