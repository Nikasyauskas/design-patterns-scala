package patterns.facade.accessories

class Cpu {

  def freeze(): Unit = println("freeze")

  def jump(position: Long): Unit = println(s"jump position = ${position}")

  def execute(): Unit = println(s"execute")

}
