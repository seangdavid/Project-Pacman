package game;

public abstract  class Character implements Movable {

    public int x,y;
    public char symbol;
    public String name;




    @Override
    public void moveDown() {
        this.x++;
    }

    @Override
    public void moveLeft() {
        this.y--;
        
    }

    @Override
    public void moveRight() {
        this.y++;
        
    }

    @Override
    public void moveUp() {
        this.x--;
        
    }


}
