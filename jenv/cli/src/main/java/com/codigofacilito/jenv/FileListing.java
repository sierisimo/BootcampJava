package com.codigofacilito.jenv;

import com.codigofacilito.sier.files.search.DirectoryNotFound;
import com.codigofacilito.sier.files.search.FilesFound;
import com.codigofacilito.sier.files.search.NoFilesFound;
import com.codigofacilito.sier.files.search.SearchFileResult;

import java.io.File;

public class FileListing {
    public SearchFileResult getFiles(String rootDirectory, String startPattern) {
        var directory = new File(rootDirectory);
        if (directory.exists() && directory.isDirectory()) {
            var filesFound = directory.listFiles(pathname ->
                    pathname.getName().startsWith(startPattern)
            );
            if (filesFound != null && filesFound.length > 0) {
                return new FilesFound(filesFound);
            } else {
                return new NoFilesFound();
            }
        } else {
            return new DirectoryNotFound();
        }
    }

}
