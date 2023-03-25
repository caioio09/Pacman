
public class Player extends GameObject {

    private int direction;
    private int life = 3;
    private boolean invencible = false;

    public Player() {
    }

    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
        getScreenSize();
        System.out.println(this.direction);
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencible() {
        return invencible;
    }

    public void setInvencible(boolean invencible) {
        this.invencible = invencible;
    }

    public void mover() {
        
        if (podeMover()) {

            // mover direita
            if (getDirection() == 90) 
                setX(getX() + 10);
            //mover esquerda
            else if (getDirection() == 270) 
                setX(getX() - 10);
            //mover pra cima
            else if (getDirection() == 0) 
                setY(getY() - 10);
            //mover pra baixo
            else 
                setY(getY() + 10);
        }

    }

    public boolean podeMover() {
        // se nao conseguir ir para esquerda falso
        if (getX() < 10 && getDirection() == 270) {

            return false;
        }
        // se nao conseguir ir para direita falso
        else if (getX() > 590 && getDirection() == 90) {

            return false;
        }
        // se nao conseguir ir para cima falso
        else if (getY() < 10 && getDirection() == 0) {

            return false;
        }
        // se nao conseguir ir para baixo falso
        else if (getY() > 590 && getDirection() == 180) {
            return false;
        }
        return true;
    }

}
