package demo1;

public class O extends Tetromino{
    public O(){
        cells[0] = new Cell(0,4,Tetris.I);
        cells[1] = new Cell(0,5,Tetris.I);
        cells[2] = new Cell(1,4,Tetris.I);
        cells[3] = new Cell(1,5,Tetris.I);
        //共计有0种旋转状态
        states = new State[0];
    }
}
