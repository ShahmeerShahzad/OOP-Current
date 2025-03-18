public class SystemUnit {
	private String CpuName;
	private int ramSize;
	private int diskSize;
	private String systemID;
	private String LCDmodel;
	public static int count = 0;

	SystemUnit(String CpuName, int ramSize, int diskSize, String systemID, String LCDmodel) {
		this.CpuName = CpuName;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.systemID = String.format( "C + %02d", ++count);
		this.LCDmodel = LCDmodel;
	}

	public String getCpuName() {
		return CpuName;
	}
	
	public void setCpuName(String CpuName) {
		this.CpuName = CpuName;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}
	
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public String getLCDmodel() {
		return LCDmodel;
	}
	
	public void setLCDmodel(String LCDmodel) {
		this.LCDmodel = LCDmodel;
	}

	public String toString() {
		return String.format("\nSystem Details: \nCPU Name: %s\nRAM Size: %s\nDisk Size: %s\nSystem ID: %s\nLCD Model: %s\n", CpuName, ramSize, 		diskSize, systemID, LCDmodel);
	}
	
}