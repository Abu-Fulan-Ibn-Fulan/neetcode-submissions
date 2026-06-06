class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length())
                .append('#')
                .append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        
    List<String> res = new ArrayList<>();
    int i = 0;

    while (i < s.length()) {

        // 1. read the number
        int numStart = i;
        while (s.charAt(i) != '#') {
            i++;
        }

        int length = Integer.parseInt(s.substring(numStart, i));

        // 2. skip '#'
        i++;

        // 3. read the word using the length
        String word = s.substring(i, i + length);
        res.add(word);

        // 4. move pointer forward
        i += length;
    }

    return res;
}
}
