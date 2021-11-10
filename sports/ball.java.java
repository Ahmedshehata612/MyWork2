package sports;

public class ball implements tossable {
    String brandName;

    public ball() {
    }

    public ball(String brandName) {
        this.brandName = brandName;
    }
    
    @Override
    public void toss()
    {
        
        
    }

    public void ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void bounce()
    {
        
    }
    
}
