package com.kyrptonaught.Alzairio.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UpdateChecker {
	public static boolean isUpdateAvailable() throws IOException, MalformedURLException {
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("http://mc-brikbroz.webs.com/Alzairio%20Mod/test.txt").openStream()));
		String curVersion = versionFile.readLine();

		versionFile.close(); 

		if (!curVersion.contains(Alzairio.MVersion)) {
			return true;
		}

		return false;
	}
}
