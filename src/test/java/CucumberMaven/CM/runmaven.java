package CucumberMaven.CM;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class runmaven {

	public static void main(String[] args) throws IOException, InterruptedException {

		Process p = null;

		try {
			p = Runtime.getRuntime()
					.exec("D:\\sws\\apache-maven-3.3.9-bin\\apache-maven-3.3.9\\bin\\mvn.cmd clean install");
		} catch (IOException e) {
			System.err.println("Error");
			e.printStackTrace();
		}

		copy(p.getInputStream(), System.out);
		p.waitFor();

	}

	static void copy(InputStream in, OutputStream out) throws IOException {
		while (true) {
			int c = in.read();
			if (c == -1)
				break;
			out.write((char) c);
		}
	}
}