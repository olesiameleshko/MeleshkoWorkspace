package Task11;

//Task 11
class MyClass {
    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = value;
    }

    void anotherChange(int value) {

        this.dynamicField = value;
    }
}