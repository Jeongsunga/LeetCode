class Solution {

    public boolean digitCount(String num) {
        int[] count = new int[10]; // 조건에 따른 배열 크기

        for(char c: num.toCharArray()) {
            count[c - '0']++; // 문자 → 숫자로 변환해서 count 증가
        }

        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0'; // 해당 인덱스의 값이 기대하는 count
            if (count[i] != expectedCount) {
                return false;
            }
        }

        return true;
    }
}