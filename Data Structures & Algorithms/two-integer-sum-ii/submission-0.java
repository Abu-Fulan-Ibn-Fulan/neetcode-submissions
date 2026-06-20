class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];

for (int i = 0; i < numbers.length; i++) {
    for (int j = numbers.length - 1; j >= 0; j--) {

        if (i == j) {
            continue;
        }

        if (numbers[i] + numbers[j] == target) {
            result[0] = i+1;
            result[1] = j+1;
            return result;
        }
    }
}
return result;
}
}


    // not only adjacent pair, 
    // array out of bound during first if
    // the indexing used is 0-indexing I have to add 1 to the value for it to be 1 indexing
