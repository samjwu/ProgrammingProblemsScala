object Solution {
    def minimumSum(nums: Array[Int]): Int = {
        val n = nums.length
        
        val intMax = math.pow(2, 31) - 1
        var ans = intMax.toInt
        
        for (i <- 0 to n-3) {
            for (j <- i+1 to n-2) {
                for (k <- j+1 to n-1) {
                    if (nums(i) < nums(j) && nums(j) > nums(k)) {
                        ans = math.min(ans, nums(i) + nums(j) + nums(k))
                    }
                }
            }
        }
        
        if (ans == intMax.toInt) {
            return -1
        }
        return ans
    }
}
