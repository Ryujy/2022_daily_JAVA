package chap10.ex09.buffer;

import chap10.ex01.sysio.SysOutput;

public class TimeChecker {
	
	long start;
	long end;
	
	public void timeStart() {
		start = System.currentTimeMillis();
	}
	
	public long timeStop() {
		end = System.currentTimeMillis();
		return end-start;
	}
}
