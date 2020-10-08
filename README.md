# Java-
Java课程作业项目仓库

#阅读程序

##实验目的
完成教材p100第四题关于PC、内存等模拟的程序


##实验过程
①构造PC类、CPU类、HardDisk类
②将CPU类、HardDisk类装包
③构造Test主类,并调用出CPU类的变量speed,HardDisk类的变量amount然后分别存储，并按书里要求构造Test类的主函数，分别给speed、disk赋值，接着输出它们

##核心方法
1.方法1  
    public class CPU
{   private int speed;
    public int getSpeed()
    { return speed; }
    public void setSpeed(int speed)
    { this.speed = speed; }
}
2.方法2 
       public static class PC
    {   CPU cpu;
        HardDisk HD;
        void setCPU(CPU cpu)
        { this.cpu = cpu; }
        void setHardDisk(HardDisk HD)
        { this.HD = HD; }
3.方法3
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

##实验结果
输出了
CPU速度：2200
硬盘容量：200


##实验感想
  经过第一次的实验历练，我感慨万千，因为这次试验是我第一个java程序的构建，我感觉java与c相比，大有所异。我把本实验分为三步，其中第一步就是按照书中所引，构造了PC类、CPU类、HardDisk类。这几类相较于主类来说比较简单，所以我按图索骥很快完成了构建。
  第二步就是构建主类了，在构建主类时，我遇到了很多麻烦，比如，把多个类分出在不同的包中，用public private等修饰符修饰。这个问题使我定义的几个变量没有亮起来，后来我经过网上搜索，学会了调用包，private调用当类的变量，还有public把变量公共的方法，解决了我的问题。
  第三步是写主类里的main()函数，再写main函数时我又遇到了难以解决的问题，我定义的void型主函数里，主函数又没亮，编译器指出要用static...(String[] args),正当我用完后，发现它无法从静态中引用非静态的变量，于是我网上不断寻找方法，有人建议PC= newPC()，把新变量声明在类外等等，可这对于我的问题根本解决不了。我不断地试错，最终明白了要改变我的前类，也要加static,这样就使前后变量一致了。
  这次实验对于我这个萌新来说真的太费时费力，但我也能解决我的问题。我想，有了第一次编程的经验应该也能为后面铺一些路了，这样能避免我再犯许多错误！


