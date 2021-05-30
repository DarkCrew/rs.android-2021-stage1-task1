package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        val happyArr: ArrayList<Int> = sadArray.toList() as ArrayList<Int>
        var i = 1
        if (happyArr.size >= 2) {
            while (i <= happyArr.size - 1) {
                if (i == 0) {
                    i++
                }
                if (i == happyArr.size - 1) {
                    break
                }
                if (happyArr.get(i) > happyArr.get(i - 1) + happyArr.get(i + 1)) {
                    happyArr.removeAt(i)
                    i--
                    continue
                }
                i++
            }
        }
        return happyArr.toIntArray()
    }
}
