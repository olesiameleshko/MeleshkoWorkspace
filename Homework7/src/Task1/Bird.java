package Task1;

public class Bird implements Flyable{
    private int dayOfBirth;
    private boolean fright;

    public double getDayOfBirth(){
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth=dayOfBirth;
    }

    public boolean getFright(){
        return fright;
    }

    public void setFright(boolean fright){
        this.fright=fright;
    }

    @Override
    public void fly() {
        if (this.dayOfBirth <= 20 && fright == false){
        System.out.println("The bird is newborn and can't fly");
        } else if (this.dayOfBirth >= 10 && fright == true) {
            System.out.println("The bird is newborn but can fly due to fright");
        } else {
            System.out.println("The bird is grown up and can fly");
        }
    }
}
