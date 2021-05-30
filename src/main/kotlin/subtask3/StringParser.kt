package subtask3

class StringParser {

    private val stringBuilder = kotlin.text.StringBuilder()
    private val res = arrayListOf<String>()

    fun getResult(inputString: String): Array<String>{
        for (i in inputString.indices){
            if(inputString[i] =='<'){
                var j = i+1
                while(inputString[j]!='>'){
                    stringBuilder.append(inputString[j])
                    j+=1
                }
                res.add(stringBuilder.toString())
                stringBuilder.clear()
            }
            if(inputString[i] =='('){
                var j = i+1
                while(inputString[j]!=')'){
                    stringBuilder.append(inputString[j])
                    j+=1
                }
                res.add(stringBuilder.toString())
                stringBuilder.clear()
            }
            if(inputString[i] =='['){
                var j = i+1
                while(inputString[j]!=']'){
                    stringBuilder.append(inputString[j])
                    j+=1
                }
                res.add(stringBuilder.toString())
                stringBuilder.clear()
            }
        }
        return res.toTypedArray()
    }
}
