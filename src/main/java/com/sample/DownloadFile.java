package com.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {

	String status = null;

	public int download() {

		try {
			URLConnection conn = new URL(
					"http://www.tonycuffe.com/mp3/tail%20toddle.mp3")
					.openConnection();
			InputStream is = conn.getInputStream();

			File f1 = new File("/tmp/file.old");

			System.out
					.println("fIle creation status ====" + f1.createNewFile());

			OutputStream outstream = new FileOutputStream(f1);
			byte[] buffer = new byte[4096];
			int len;
			while ((len = is.read(buffer)) > 0) {
				outstream.write(buffer, 0, len);
			}
			outstream.close();

			File f = new File("/tmp/file.old");

			if (f.exists()) {
				status = "File Exists";
			} else {
				status = "File does not exist";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		status = "nothing happened";
		return 3;
	}

	public String getStatus() {
		return status;
	}
}
