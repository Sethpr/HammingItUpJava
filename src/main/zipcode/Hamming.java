package zipcode;

public class Hamming {
    String left;
    String right;
    public Hamming(String left, String right) {
        if(left.length()!= right.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.left = left;
        this.right = right;
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            count = (left.charAt(i) != right.charAt(i)) ? count + 1: count;
        }
        return count;
    }
}
