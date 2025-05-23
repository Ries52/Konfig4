package Library;

import Video.VideoFile;

public class BitrateReader {
    public void read(VideoFile file) {
        System.out.println("BitrateReader: reading " + file.getFilename());
    }
}