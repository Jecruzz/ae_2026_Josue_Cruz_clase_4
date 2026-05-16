/// ae_2026_Josue_Cruz_clase_4
/// estructura del commit clase_4 {{valor incremental}}
fun main() {
	val grade: Int = 85 
    
    if (grade > 70){
        println("Aprobado")
    } else {
        print("Reprobado")
    }
    
    val result: String = if (grade > 70){
       "Aprobado"
    } else {
        "Reprobado"
    }
    
    println(result)
}