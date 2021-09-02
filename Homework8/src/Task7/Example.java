package Task7;

import java.awt.*;
import java.util.Objects;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    //1-st equals
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Example)) return false;
        Example c = (Example) o;
        return this.first == c.getFirst() && this.last == c.getLast();
    }

    //2-nd equals
    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Example ex = (Example) obj;
        if (first != ex.first)
            return false;
        if (last != ex.last)
            return false;
        return true;
    }*/

    //1-st hashcode method
    /*
    @Override
    public int hashCode() {
        return (7 * first.hashCode() + 11 * last.hashCode());
    }*/

    //2-nd hashcode method
    /*
    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(first)
                + 11 * Objects.hashCode(last);
    }*/

    //3-rd hashcode method
    @Override
    public int hashCode(){
        return Objects.hash(first, last);
    }
}
