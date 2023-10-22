import scala.collection.mutable.ArrayBuffer

object Solution {
    def lastVisitedIntegers(words: List[String]): List[Int] = {
        var tracker = ArrayBuffer[Int]()
        var idx = -1
        var ans = ArrayBuffer[Int]()
        
        for (word <- words) {
            if (word != "prev") {
                tracker += word.toInt
                idx = tracker.length - 1
            } else {
                if (idx >= 0) {
                    ans += tracker(idx)
                    idx -= 1
                } else {
                    ans += -1
                }
            }
        }
        
        return ans.toList
    }
}
