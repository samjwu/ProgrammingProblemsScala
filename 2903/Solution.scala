object Solution {
    def findIndices(nums: Array[Int], indexDifference: Int, valueDifference: Int): Array[Int] = {
        var n = nums.length
        
        for (i <- 0 to n-1) {
            for (j <- i+indexDifference to n-1) {
                if (math.abs(nums(i) - nums(j)) >= valueDifference) {
                    return Array(i, j)
                }
            }
        }
        
        return Array(-1, -1)
    }
}
