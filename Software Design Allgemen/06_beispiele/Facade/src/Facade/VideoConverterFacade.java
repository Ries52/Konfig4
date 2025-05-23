package Facade;


import Library.AudioMixer;
import Library.BitrateReader;
import Library.MPEG4CompressionCodec;
import Library.OtherCompressionCode;
import Video.VideoFile;

public class VideoConverterFacade {

    public void convert(VideoFile file) {
        // 1. Video laden und komprimieren
        if (file.isMP4()) {
            new MPEG4CompressionCodec().convert(file);
        } else {
            new OtherCompressionCode().convert(file);
        }

        // 2. Bitrate lesen
        new BitrateReader().read(file);

        // 3. Audio mischen
        new AudioMixer().mix(file);
    }
}