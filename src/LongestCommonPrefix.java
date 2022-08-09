public class LongestCommonPrefix {
    
    private static String longestCommonPrefix(String[] strs){

        int shortestLength = strs[0].length();
        int idxShortest = 0;
        for (int i = 1; i < strs.length; i++) {
            if(shortestLength > strs[i].length()) {
                idxShortest = i;
                shortestLength = strs[i].length();
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if(idxShortest == i || strs[i].equals(strs[idxShortest])) continue;

            while(shortestLength > 0){
                if(strs[i].startsWith(strs[idxShortest])) break;
                shortestLength--;
                strs[idxShortest] = strs[idxShortest].substring(0, shortestLength);
            }
        }

        if(shortestLength == 0) return "";
        return strs[idxShortest];
    }

    public static void main(String[] args) {
        String[] array = new String[]{"dog","racecar","car"};

        System.out.println(longestCommonPrefix(array));
    }
}
