package Homework5.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged into the file: " + data);
	}
}
