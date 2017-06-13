/*
Sintaxis para declarar una operacion Regex:

<Objeto Regex> <Operacion> <Argumentos de la Operacion>

Al resultado de estas operaciones las puedes transformar a String con el método mkString

Un objeto Regex puede declararse de dos maneras:
>val r = new Regex(<string>)
>val s = <string>.r

Estas dos son equivalentes, asi que 
>r findfirstIn "Hola"
>s findfirstIn "Hola"
dan el mismo resultado

val r = new Regex("World")
val s = "Hello World"
(r findFirstIn s).mkString


*/

import scala.util.matching.Regex

object D_Regex {
	def main(args: Array[String]): Unit = {
		
		val str = "|Hello World 124 4891"
		val r1 = "World"
		val r2 = "\\d{1,}"
		val r3 = "l|e"
		val r4 = new Regex("W.+?\\d")
		val r5 = new Regex("\\d")
		val s1 = (r1.r findFirstIn str).mkString
		val s2 = (r2.r findFirstIn str).mkString
		val s3 = (r3.r findFirstIn str).mkString
		val s4 = (r4 findFirstIn str).mkString
		val s5 = (r5 findAllIn str).mkString(" | ")
		println("str: "+str)
		println("World: "+s1)
		println("\\\\d{1,}: "+s2)
		println("l|e: "+s3)
		println("W.+?\\\\d: "+s4)
		println("\\\\d: "+s5)
	}
}
