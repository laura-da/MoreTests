public class UniqueChars {
    private String seq;
    public UniqueChars(String s) {
        seq = s;
    }

    public boolean isUniqueSequence() {

        int MAX_CHAR = 255;
        if (seq.length()>MAX_CHAR)
            return false;

        boolean[] posArr = new boolean[MAX_CHAR];
        for (int i=0; i<MAX_CHAR; i++)
            posArr[i] = false;
        for (int i = 0; i < seq.length(); i++) {
            if (posArr[seq.charAt(i)])
                return false;
            posArr[seq.charAt(i)] = true;
        }

        return true;
    }
}
