/// ae_2026_Josue_Cruz_clase_4
/// estructura del commit clase_4 {{valor incremental}}
data class Student(
	val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudents(): List<Student>{
    val sebas = Student(
    	id = 1,
        email = "sebas@puce.com",	/// no importa el orden por que se especifica el tipo de dato
        grade = 9,
        isActive = true,
        name = "Sebas"
    ) 
    
    val diego = Student(
    	id = 2,
        email = "diego@puce.com",	
        grade = 0,
        isActive = true,
        name = "Diego"
    ) 
    
    val david = Student(
    	id = 3,
        email = "david@puce.com",	
        grade = 6,
        isActive = true,
        name = "David"
    )
    return listOf (sebas, diego, david)
}

fun getResult(grade: Int): String {  /// firma de la funcion
    return if(grade>7) "Aprobado" else "Reprobado"
}

fun main() {
    for (student in getStudents()){
        println("${student.name} esta ${getResult(student.grade)}")
    }
}