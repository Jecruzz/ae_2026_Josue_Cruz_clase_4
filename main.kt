/// ae_2026_Josue_Cruz_clase_4
/// estructura del commit clase_4 {{valor incremental}}
fun main() {
   val name: String = "Ana"
   val email:String = "ana@gmail.com"
   val number: Int = 67
   // Ana - ana@gmail.com
   
   println(name + " - " + email) /// nunca hacer esto
   println("$name - $email") /// siempre usar string templates en log
   println("Te faltan ${100 - number} para llegar a 100")
}