package chapter03;

import java.io.File;

public class Ex12extensionSubDirectories {

	public static File[] extensionSub(String dirPath, String extension) {

		var file = new File(dirPath);
//fileNameFilter capture extension(lambda captures only effectively final variables)
		return file.listFiles( (File dir,String name) -> {return name.endsWith(extension);} );//end of listFiles
	}


}