import Cpu.CPU;
import Harddisk.HardDisk;
public class Test
{
        public static class PC
    {   CPU cpu;
        HardDisk HD;
        void setCPU(CPU cpu)
        { this.cpu = cpu; }
        void setHardDisk(HardDisk HD)
        { this.HD = HD; }
        void show()
        { System.out.println("CPU速度：" + cpu.getSpeed());
          System.out.println("硬盘容量：" + HD.getAmount()); }
    }
        public static void main(String[] args)
        {   CPU cpu = new CPU();
            HardDisk disk = new HardDisk();
            PC pc=new PC();
            cpu.setSpeed(2200);
            disk.setAmount(200);
            pc.setCPU(cpu);
            pc.setHardDisk(disk);
            pc.show();
        }
}

