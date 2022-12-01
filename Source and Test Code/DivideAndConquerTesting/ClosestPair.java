package DivideAndConquerTesting;

public class ClosestPair {
    int numberPoints;
    public Location[] array;
    Location point1 = null;
    Location point2 = null;
    private static double minNum = Double.MAX_VALUE;

    public static void setMinNum(double minNum) {
        ClosestPair.minNum = minNum;
    }

    public static void setSecondCount(int secondCount) {
        ClosestPair.secondCount = secondCount;
    }

    private static int secondCount = 0;

    ClosestPair(int points) {
        numberPoints = points;
        array = new Location[numberPoints];
    }

    public static class Location {
        double x;
        double y;
        Location(final double xpar, final double ypar) { // Save x, y coordinates
            this.x = xpar;
            this.y = ypar;
        }
    }

    public Location[] createLocation(int numberValues) {
        return new Location[numberValues];
    }

    public Location buildLocation(double x, double y) {
        return new Location(x, y);
    }
    
    public int xPartition(final Location[] a, final int first, final int last) {
        Location pivot = a[last]; // pivot
        int i = first - 1;
        Location temp; // Temporarily store value for position transformation
        for (int j = first; j <= last - 1; j++) {
            if (a[j].x <= pivot.x) { // Less than or less than pivot
                i++;
                temp = a[i]; // array[i] <-> array[j]
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        temp = a[i]; // array[pivot] <-> array[i]
        a[i] = a[last];
        a[last] = temp;
        return i; // pivot index
    }

    public int yPartition(final Location[] a, final int first, final int last) {
        Location pivot = a[last]; // pivot
        int i = first - 1;
        Location temp; // Temporarily store value for position transformation
        for (int j = first; j <= last - 1; j++) {
            if (a[j].y <= pivot.y) { // Less than or less than pivot
                i++;
                temp = a[i]; // array[i] <-> array[j]
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        temp = a[i]; // array[pivot] <-> array[i]
        a[i] = a[last];
        a[last] = temp;
        return i; // pivot index
    }

    public void xQuickSort(
        final Location[] a,
        final int first,
        final int last
    ) {
        if (first < last) {
            int q = xPartition(a, first, last); // pivot
            xQuickSort(a, first, q - 1); // Left
            xQuickSort(a, q + 1, last); // Right
        }
    }

    public void yQuickSort(
        final Location[] a,
        final int first,
        final int last
    ) {
        if (first < last) {
            int q = yPartition(a, first, last); // pivot
            yQuickSort(a, first, q - 1); // Left
            yQuickSort(a, q + 1, last); // Right
        }
    }

    public double closestPair(final Location[] a, final int indexNum) {
        Location[] divideArray = new Location[indexNum];
        System.arraycopy(a, 0, divideArray, 0, indexNum); // Copy previous array
        int divideX = indexNum / 2; // Intermediate value for divide
        Location[] leftArray = new Location[divideX]; // divide - left array
        Location[] rightArray = new Location[indexNum - divideX];
        if (indexNum <= 3) { // If the number of coordinates is 3 or less
            return bruteForce(divideArray);
        }
        System.arraycopy(divideArray, 0, leftArray, 0, divideX);
        System.arraycopy(
            divideArray,
            divideX,
            rightArray,
            0,
            indexNum - divideX
        );

        double minLeftArea; // Minimum length of left array
        double minRightArea; // Minimum length of right array
        double minValue; // Minimum lengt

        minLeftArea = closestPair(leftArray, divideX); // recursive closestPair
        minRightArea = closestPair(rightArray, indexNum - divideX);
        minValue = Math.min(minLeftArea, minRightArea);
        for (int i = 0; i < indexNum; i++) {
            double xGap = Math.abs(divideArray[divideX].x - divideArray[i].x);
            if (xGap < minValue) {
                ClosestPair.setSecondCount(secondCount + 1); // size of the array
            } else {
                if (divideArray[i].x > divideArray[divideX].x) {
                    break;
                }
            }
        }
        Location[] firstWindow = new Location[secondCount];
        int k = 0;
        for (int i = 0; i < indexNum; i++) {
            double xGap = Math.abs(divideArray[divideX].x - divideArray[i].x);
            if (xGap < minValue) { // if it's inside a window
                firstWindow[k] = divideArray[i]; // put in an array
                k++;
            } else {
                if (divideArray[i].x > divideArray[divideX].x) {
                    break;
                }
            }
        }
        yQuickSort(firstWindow, 0, secondCount - 1); // Sort by y coordinates

        double length;
        for (int i = 0; i < secondCount - 1; i++) {
            for (int j = (i + 1); j < secondCount; j++) {
                double xGap = Math.abs(firstWindow[i].x - firstWindow[j].x);
                double yGap = Math.abs(firstWindow[i].y - firstWindow[j].y);
                if (yGap < minValue) {
                    length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
                    if (length < minValue) {
                        minValue = length;
                        if (length < minNum) {
                            ClosestPair.setMinNum(length);
                            point1 = firstWindow[i];
                            point2 = firstWindow[j];
                        }
                    }
                } else {
                    break;
                }
            }
        }
        ClosestPair.setSecondCount(0);
        return minValue;
    }
    
    public double bruteForce(final Location[] arrayParam) {
        double minValue = Double.MAX_VALUE; // minimum distance
        double length;
        double xGap; // Difference between x coordinates
        double yGap; // Difference between y coordinates
        double result = 0;

        if (arrayParam.length == 2) {
            xGap = (arrayParam[0].x - arrayParam[1].x);
            yGap = (arrayParam[0].y - arrayParam[1].y);
            length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
            if (length < minNum) {
                ClosestPair.setMinNum(length);
            }
            point1 = arrayParam[0];
            point2 = arrayParam[1];
            result = length;
        }
        if (arrayParam.length == 3) {
            for (int i = 0; i < arrayParam.length - 1; i++) {
                for (int j = (i + 1); j < arrayParam.length; j++) {
                    xGap = (arrayParam[i].x - arrayParam[j].x);
                    yGap = (arrayParam[i].y - arrayParam[j].y);
                    length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
                    if (length < minValue) {
                        minValue = length;
                        if (length < minNum) {
                            ClosestPair.setMinNum(length);
                            point1 = arrayParam[i];
                            point2 = arrayParam[j];
                        }
                    }
                }
            }
            result = minValue;
        }
        return result; 
    }
}
