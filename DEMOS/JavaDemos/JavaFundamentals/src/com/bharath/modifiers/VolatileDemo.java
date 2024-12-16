package com.bharath.modifiers;

public class VolatileDemo {
	private volatile boolean volatileFlag = true;
	private boolean nonVolatileFlag = true;

	public boolean isVolatileFlag() {
		return volatileFlag;
	}

	public void setVolatileFlag(boolean volatileFlag) {
		this.volatileFlag = volatileFlag;
	}

	public boolean isNonVolatileFlag() {
		return nonVolatileFlag;
	}

	public void setNonVolatileFlag(boolean nonVolatileFlag) {
		this.nonVolatileFlag = nonVolatileFlag;
	}

	public static void main(String[] args) {
		VolatileDemo test = new VolatileDemo();
		Thread writerThread = new Thread(() -> {
			for (int i = 0; i < 1; i++) {
				test.setVolatileFlag(!test.isVolatileFlag());
				test.setNonVolatileFlag(!test.isNonVolatileFlag());
				System.out.println("Writer: VolatileFlag=" + test.isVolatileFlag() + ", NonVolatileFlag="
						+ test.isNonVolatileFlag());
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread readerThread = new Thread(() -> {
			for (int i = 0; i < 1; i++) {

				System.out.println("Reader: VolatileFlag=" + test.isVolatileFlag() + ", NonVolatileFlag="
						+ test.isNonVolatileFlag());
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		writerThread.start();
		readerThread.start();
		try {
			writerThread.join();
			readerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
