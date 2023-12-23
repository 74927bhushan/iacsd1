

class Solution {
public
    int removeDuplicates(vector<int> nums) {
        if (nums.empty()) {
            return 0;
        }
        
        int uniqueCount = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
};
