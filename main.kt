/// ae_2026_Josue_Cruz_clase_4
/// estructura del commit clase_4 {{valor incremental}}
data class Student(
	val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {
	val jorge = Student(
    	id = 1,
        email = "jorge@puce.com",	/// no importa el orden por que se especifica el tipo de dato
        grade = 8,
        isActive = true,
        name = "Jorge"
    )
    
    val ana = Student (1, "Ana","ana@puce.com", 10, true) /// importa el orden por que no se especifica el tipo de dato
    println(jorge)
    println(ana)
}