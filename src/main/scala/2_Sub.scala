object B_Subroutine {
	
	// Constante = 2
	val const = 2

	def main(args: Array[String]): Unit = {
		System.out.println(const+"*"+const+"="+square(const))
	}
	
	// Rutina que 
	def square(int: Int): Int = {
		return int*int
	}

}
