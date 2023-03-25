import java.util.Random;

public class Ghost extends GameObject {

    private int direction;
    Random rand = new Random();

    public Ghost() {

    }

    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void mover(int direction) {
        int n = rand.nextInt(100);

        if (n <= 50) {
            int p = rand.nextInt(4) + 1;
        
            System.out.println(p);
        
        if(p == 1){
            direction = 0;
        } else if (p == 2){
            direction = 90;
        }else if (p == 3){
            direction = 180;
        } else {
            direction = 270;
        }
    }

        if (podeMover()) {

            // mover direita
            if (direction == 90)
                setX(getX() + 10);
            // mover esquerda
            else if (direction == 270)
                setX(getX() - 10);
            // mover pra cima
            else if (direction == 0)
                setY(getY() - 10);
            // mover pra baixo
            else
                setY(getY() + 10);
        
        }
    
    }

    public boolean podeMover() {
        // se nao conseguir ir para esquerda falso
        if (getX()  < 0 && getDirection() == 270) {

            return false;
        }
        // se nao conseguir ir para direita falso
        else if (getX() > 590 && getDirection() == 90) {

            return false;
        }
        // se nao conseguir ir para cima falso
        else if (getY() < 0 && getDirection() == 0) {

            return false;
        }
        // se nao conseguir ir para baixo falso
        else if (getY() > 590 && getDirection() == 180) {
            return false;
        }
        return true;
    }

}
