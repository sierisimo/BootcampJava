package com.codigofacilito.sier.files.search;

import java.io.File;

public final class NoFilesFound extends SearchFileResult {
    public NoFilesFound() {
        super(new File[]{});
    }
}
