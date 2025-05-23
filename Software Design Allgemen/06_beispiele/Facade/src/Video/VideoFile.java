package Video;

public class VideoFile {
    private final String filename;
    private final String format;

    public VideoFile(String filename, String format) {
        this.filename = filename;
        this.format   = format;
    }

    public String getFilename() {
        return filename;
    }

    public String getFormat() {
        return format;
    }

    public boolean isMP4() {
        return "mp4".equalsIgnoreCase(format);
    }
}