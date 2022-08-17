package patterns.facade.accessories

class Memmory {

  def load(position: Long, data: Array[Byte]): Unit =
    println(s"load position = ${position}, date = ${data}")

}
