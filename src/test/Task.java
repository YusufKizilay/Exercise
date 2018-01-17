package test;

public class Task implements Runnable {

	int time;

	String name;

	public Task(int time, String name) {
		super();
		this.time = time;
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println("just for test....");

		System.out.println(name + " running....");

		for (int i = 0; i < time; i++) {
			if (i == time - 1) {
				System.out.println(name + " completed....");
			}
		}

		System.out.println(name + " ended....");

	}

}
