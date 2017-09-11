public boolean groupSum6(int start, int[] nums, int target) {
  int len = start + 1;
  if(start == nums.length && target != 0) 
    return false;
  else if(start == nums.length && target == 0)
    return true;
  if(groupSum6(len,nums,target-nums[start]))
    return true;
  else if(nums[start] != 6 && groupSum6(++start,nums,target))
    return true;
    
  return false;
}
