public class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }else if (needle.length() > haystack.length()) {
            return -1;
        }
        String word = "";
        int r = needle.length(),i=0;
        while(r != haystack.length()+1) {
            word = haystack.substring(i, r);
            if (word.equals(needle)) {
                return i;
            } else {
                i++;
                r++;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        IndexOfFirstOccurance h = new IndexOfFirstOccurance();
        int i = h.strStr("sadbutsad", "sad");
        System.out.println(i);
    }
}
