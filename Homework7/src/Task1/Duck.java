package Task1;

public class Duck implements Flyable {

    private String species;
    private int weight;

    public Duck(){

    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    @Override
    public void fly() {
        if (species == "Wild Duck") {
            System.out.println("This wild duck can fly");
        } else if (species == "Falkland steamer Duck"){
            System.out.println("This wild duck can't fly");
        } else if (species=="Domestic Duck" && weight<2){
            System.out.println("This domestic duck can fly");
        } else if (species=="Domestic Duck" && weight>=2){
            System.out.println("This domestic duck can't fly");
        } else {
            System.out.println("The species aren't covered");
        }
    }
}