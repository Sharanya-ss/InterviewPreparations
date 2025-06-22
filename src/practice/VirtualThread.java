package practice;

import java.util.stream.IntStream;

public class VirtualThread {
	public static void main(String[] args) {
		/*
		 * Thread vt = Thread.ofPlatform().start(() -> {
		 * System.out.println(Thread.currentThread()); });
		 */
		 
		//creating 10000 virual threads
		IntStream.rangeClosed(0, 1).forEach(i->{
			Thread.ofVirtual().start(()->{
				System.out.println(Thread.currentThread());
			}
			);
		});
		
		 
	}

}
