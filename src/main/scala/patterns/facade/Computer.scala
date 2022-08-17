package patterns.facade

import patterns.facade.accessories.{Cpu,Memmory,HardDrive}

class Computer {

  private val BOOT_ADDRESS: Long = 1L
  private val BOOT_SECTOR: Long = 2L
  private val SECTOR_SIZE: Int = 3

  private val cpu = new Cpu
  private val mem = new Memmory
  private val hard = new HardDrive

  def startComputer(): Unit = {
    cpu.freeze()
    mem.load(BOOT_ADDRESS, hard.read(BOOT_SECTOR, SECTOR_SIZE))
    cpu.jump(BOOT_ADDRESS)
    cpu.execute()
  }

}
