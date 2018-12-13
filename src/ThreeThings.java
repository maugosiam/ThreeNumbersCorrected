import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThreeThings <T> {
    private T firstThing;
    private T secondThing;
    private T thirdThing;
    ArrayList<T> arrayList = new ArrayList<T>();



    public ThreeThings(T firstThing, T secondThing, T thirdThing) {
        this.firstThing = firstThing;
        this.secondThing = secondThing;
        this.thirdThing = thirdThing;
        Collections.addAll(arrayList, this.firstThing, this.secondThing, this.thirdThing);
        }

    public T getFirstThing() {
        return firstThing;
    }

    public T getSecondThing() {
        return secondThing;
    }

    public T getThirdThing() {
        return thirdThing;
    }


    @Override
    public boolean equals(Object o) {
       // if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeThings<?> threeThings = (ThreeThings<?>) o;
        return this.arrayList.containsAll(threeThings.arrayList);
    }

}
