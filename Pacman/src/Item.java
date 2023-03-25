public class Item extends GameObject {
    
    private boolean visible;

    public Item() {
    }

    public Item(int x, int y ) {
        super(x, y);
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    
}
