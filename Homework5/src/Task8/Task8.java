package Task8;

public class Task8 {
    public static void main (String[] args) {
        PrivateFields privateFields = new PrivateFields();
        privateFields.setCode('A');
        System.out.println("The code is: " + privateFields.getCode());
        privateFields.setValue(1);
        System.out.println("The value is: " + privateFields.getValue());
        privateFields.setWeight(123);
        System.out.println("The weight is: " + privateFields.getWeight());
        privateFields.setType("Small");
        System.out.println("The type is: " + privateFields.getType());
        privateFields.setFinished(true);
        System.out.println("Ist it finished:  " + privateFields.isFinished());
    }
}
