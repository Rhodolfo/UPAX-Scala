class Rectangle() {
	var x: Int = 1;
	var y: Int = 2;
	def getArea(): Int = {
		return x*y
	}
	def getPerimeter(): Int = {
		return 2*(x+y)
	}
	def printYourself(): Int = {
		println("x = "+x+" | y = "+y)
		return 1
	}
}
