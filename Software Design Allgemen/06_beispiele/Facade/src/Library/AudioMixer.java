package Library;

import Video.VideoFile;

public class AudioMixer {
    public void mix(VideoFile file) {
        System.out.println("AudioMixer: mixing audio of " + file.getFilename());
    }
}
