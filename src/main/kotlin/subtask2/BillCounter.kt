package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var half: Int = (bill.sum() - bill[k]) / 2
        if(half!=b){
            var debt:Int = b - half
            return debt.toString()
        }
        else{
            return "Bon Appetit"
        }
    }
}
