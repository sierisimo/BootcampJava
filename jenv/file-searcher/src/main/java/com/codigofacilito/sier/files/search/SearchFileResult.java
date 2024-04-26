package com.codigofacilito.sier.files.search;

import java.io.File;

public sealed class SearchFileResult permits DirectoryNotFound, FilesFound, NoFilesFound {
    public final File[] files;

    public SearchFileResult(File[] files) {
        this.files = files;
    }
}
