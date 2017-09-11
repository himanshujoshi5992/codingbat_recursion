public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start >= nums.length && target != 0)
    return false;
  else if(start >= nums.length && target == 0)
    return true;
  if(groupNoAdj(start+2,nums,target-nums[start]))
    return true;
  else if(groupNoAdj(start+1,nums,target))
    return true;
  return false;
} 
