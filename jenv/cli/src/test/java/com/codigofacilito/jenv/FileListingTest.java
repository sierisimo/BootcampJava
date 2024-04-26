package com.codigofacilito.jenv;

import com.codigofacilito.sier.files.search.DirectoryNotFound;
import com.codigofacilito.sier.files.search.FilesFound;
import com.codigofacilito.sier.files.search.NoFilesFound;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FileListingTest {
    private FileListing fileListing = new FileListing();

    @Test
    public void testGetFileReturnsEmptyArrayWhenNoFilesWithExtension() {
        var actualFilesFound = fileListing.getFiles(
                "/home/sierisimo/Documents/Dev/CodigoFacilito/BootcampJava/jenv/tmp",
                "mp3"
        );

        assertNotNull(actualFilesFound);
        assertInstanceOf(NoFilesFound.class, actualFilesFound);
        assertNotNull(actualFilesFound.files);
        assertEquals(0, actualFilesFound.files.length);
    }

    @Test
    public void testGetFileReturnsArrayWithOneElement() {
        var actualFilesFound = fileListing.getFiles(
                "/home/sierisimo/Documents/Dev/CodigoFacilito/BootcampJava/jenv/tmp",
                "sier"
        );

        assertNotNull(actualFilesFound);
        assertInstanceOf(FilesFound.class, actualFilesFound);
        assertEquals(1, actualFilesFound.files.length);
    }

    @Test
    public void testGetFileWhenRootDirectoryDoesNotExist() {
        var actualFilesFound = fileListing.getFiles(
                "/home/sierisimo/Documents/Dev/CodigoFacilito/BootcampJava/jenv/tmp2",
                "mp4"
        );

        assertNotNull(actualFilesFound);
        assertInstanceOf(DirectoryNotFound.class, actualFilesFound);
        assertNull(actualFilesFound.files);
    }
}