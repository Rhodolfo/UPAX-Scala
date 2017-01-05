object C_Class {

	// Define rectangle, then print area
	def main(args:Array[String]): Unit = {
		var r = new Rectangle()
		r.x = 6
		r.y = 4
		r.printYourself()
		println("Area = "+r.getArea())
	}

}
