public class FindMin<E> implements Compare<E> {

    private Compare<E> comp;
    private E minimum;
    private int count;

    public FindMin(Compare<E> comp) {
        this.comp = comp;
        this.minimum = 0;
        this.count = 0;
    }

    public void reset() {
        this.comp = null;
        this.minimum = 0;
        this.count = 0;
    }

    public void add(E e) {

    }

    @Override
    public boolean smaller(E e, E f) {
        if(e < f) {
            return true;
        }
        else {
            return false;
        }
    }

    public E getMinimum() {
        for(E e in comp) {
            if(comp.smaller(e, this.minimum)) {
                this.minimum = e;
                return this.minimum;
            }
        }
        else {
            return this.minimum;
        }
    }

    @Override
    public boolean equal(E e, E f) {
        return e == f;
    }

    public int getMinimumCount() {
        for(E e in comp) {
            if(comp.equal(e, this.minimum)){
                this.count++
            }
        }
        return this.count;
    }
}
