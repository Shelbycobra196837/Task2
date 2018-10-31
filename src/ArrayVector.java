public class ArrayVector {
    private int array[], size;

    public ArrayVector(int lenght) {
        this.size = lenght;
        this.array = new int[lenght];
    }

    public int getEllement(int index) {
        return this.array[index];
    }

    public void setEllement(int index, int value) {
        this.array[index] = value;
    }

    public int getSize() {
        return size;
    }

    public int min() {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public double getNorm() {
        int norm = 0;
        for (int i = 0; i < this.size; i++) {
            norm += array[i] * array[i];
        }
        return Math.sqrt(norm);
    }

    public void mult(int value) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = value * array[i];

        }
    }

    public void add(int value) {
        size++;
        int i = size;
        array[i] = value;
        i++;
    }

    public void sum(int array1[]) {
        if (array1.length == array.length) {
            ArrayVector vector = new ArrayVector(array1.length);
            for (int i = 0; i < array.length; i++) {
                vector.add(array1[i] + array[i]);
            }
        } else
            System.out.println("Длины векторов разные");

    }

    public void scalarMult(int array1[]) {
        if (array1.length == array.length) {
            ArrayVector vector = new ArrayVector(array1.length);
            for (int i = 0; i < array.length; i++) {
                vector.add(array1[i] * array[i]);
            }
        } else
            System.out.println("Длины векторов разные");
    }


}
