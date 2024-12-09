package sec01.exam07;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메소드
		this.memory = memory; // 매개값을 memory 필드에 저장하는 역할입니다.
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {} // try ~ catch() 까지의 코드는 스레드를 2초간 일시적으로 정지 시킵니다.
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory); //Thread.currentThread().getName()는 스레드 이름을 얻기 위한 코드이며 this.memory는 메모리 값을 나타내기 위한 코드 입니다.
	}
}

