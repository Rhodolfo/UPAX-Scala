object moss {

	// Define rectangle, then print area
	def main(args:Array[String]): Unit = {
		var r = new Rectangle()
		r.x = 2
		r.y = 4
		r.printYourself()
		println("Area = "+r.getArea())
	}

}
