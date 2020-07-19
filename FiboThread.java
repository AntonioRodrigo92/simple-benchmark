package coisas;

import java.util.concurrent.TimeUnit;

public class FiboThread extends Thread {
	private String nome;
	private int num;
	
	public FiboThread (String nome, int num) {
		this.nome = nome;
		this.num = num;
	}
	
	public void run() {
		for (int i = 0; i <= num; i++) {
			System.out.println(nome + " " + i + ": " + fibo.fibonacciRecu(i));
		}
		System.out.println(nome + " acabou!");
	}
	
	public static void main (String[] args) {
		long st = System.nanoTime();
		
		
		FiboThread ta = new FiboThread ("Thread A", 48);
		FiboThread tb = new FiboThread ("Thread B", 48);
		FiboThread tc = new FiboThread ("Thread C", 48);
		FiboThread td = new FiboThread ("Thread D", 48);
		FiboThread te = new FiboThread ("Thread E", 48);
		FiboThread tf = new FiboThread ("Thread F", 48);
		FiboThread tg = new FiboThread ("Thread G", 48);
		FiboThread th = new FiboThread ("Thread H", 48);
		
		ta.start();
		tb.start();
		tc.start();
		td.start();
		te.start();
		tf.start();
		tg.start();
		th.start();
		
		
		try {
			ta.join();
			tb.join();
			tc.join();
			td.join();
			te.join();
			tf.join();
			tg.join();
			th.join();
			
		} catch (InterruptedException e) {}
		long time = System.nanoTime() - st;
		System.out.println(TimeUnit.SECONDS.convert(time, TimeUnit.NANOSECONDS));
	}

}
