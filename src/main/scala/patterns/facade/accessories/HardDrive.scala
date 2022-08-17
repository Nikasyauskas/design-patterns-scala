package patterns.facade.accessories

class HardDrive {

  def read(lba: Long, size: Int): Array[Byte] = {
    println(s"read lba = ${lba}, size = ${size}")
    new Array[Byte](size)
  }

}
