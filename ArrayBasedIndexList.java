public class ArrayBasedIndexList<E> implements IndexList<E> {

    private E[] arr;
    private int n;
    private static final int N = 10;

    public ArrayBasedIndexList() {
        this.arr = (E[]) (new Object[N]);
        this.n = 0;
    }

    @Override
    public void insert(int index, E e) {
        if(isFull()) {
            doubleArraySize();
        }
        this.arr[index] = e;
        this.n++;
    }

    private boolean isFull() {
        return getSize() == this.arr.length;
    }

    private void doubleArraySize() {
        E[] arr2 = (E[]) (new Object[this.n * 2]);
        for(int i = 0; i < this.arr.length; i++) {
            arr2[i] = this.arr[i];
        }
        this.arr = arr2;
    }

    @Override
    public void remove(int index) {
        if(isEmpty()) {
            throw new IllegalArgumentException("Cannot remove an element from an empty list !");
        }
        else {
            E removedElement = this.arr[index];
            for(int i = index; i < getSize() - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.n--;
        }
    }

    private boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= getSize()) {
            throw new ArrayIndexOutOfBoundsException(); // or IllegalArgumentException
        }
        return this.arr[index];
    }

    @Override
    public int getSize() {
        return this.n;
    }
}


