package comp;

import comp.hard.HardDisk;
import comp.hard.HardDiskType;
import comp.keyboard.Illuminate;
import comp.keyboard.Keyboard;
import comp.keyboard.KeyboardType;
import comp.memory.Memory;
import comp.memory.MemoryType;
import comp.monitor.Monitor;
import comp.monitor.MonitorType;
import comp.processor.CoreCount;
import comp.processor.Creator;
import comp.processor.Frequency;
import comp.processor.Processor;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.THREE_THOUSAND, CoreCount.FOUR, Creator.AMD, 500);
        Memory memory = new Memory(MemoryType.DDR4, 16, 500);
        HardDisk hardDisk = new HardDisk(HardDiskType.SSD, 500, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIREDLESS, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, hardDisk, monitor, keyboard, "INTEL", "INSPIRION");
        System.out.println(computer);
        System.out.println(computer.getWeight());
    }
}
