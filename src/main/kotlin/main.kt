fun main(){
    val amount = 350000
    val minimumCommission = 35
    val percent = 0.75
    val commission = amount /100 *percent
    val result = if(commission > minimumCommission) "коммисcия составляет: ${commission.toInt()} рублей"
    else "коммиссии нет"
    println(result)
}