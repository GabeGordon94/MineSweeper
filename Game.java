/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author gagordon
 */
public class Game {
   private Board board;
   boolean finish=false;
   boolean win=false;
   int turns=0;

   public void Playing(){
       board=new Board();
       Play(board);
   }
}
