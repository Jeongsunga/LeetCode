class Solution {
    public boolean hasAllCodes(String s, int k) {

        Set<String> seen = new HashSet<>();
        int total = 1 << k;  // 2^k
        
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            seen.add(sub);
            
            // 모든 조합이 이미 모였으면 바로 true 반환
            if (seen.size() == total) {
                return true;
            }
        }
        
        // 다 모이지 못했다면 false
        return false;
        
    }
}