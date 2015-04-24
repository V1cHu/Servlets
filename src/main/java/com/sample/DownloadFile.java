package com.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {
	public int download() {

		try {
			URLConnection conn = new URL(
					"http://online1.tingclass.com/lesson/shi0529/43/32.mp3")
					.openConnection();
			InputStream is = conn.getInputStream();

			OutputStream outstream = new FileOutputStream(new File(
					"/tmp/file.old"));
			byte[] buffer = new byte[4096];
			int len;
			while ((len = is.read(buffer)) > 0) {
				outstream.write(buffer, 0, len);
			}
			outstream.close();

			File f = new File("/tmp/file.old");

			if (f.exists()) {
				return 1;
			} else {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 3;
	}
}
