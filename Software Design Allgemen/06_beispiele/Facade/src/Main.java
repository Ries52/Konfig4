//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Facade.VideoConverterFacade;
import Video.VideoFile;

public class Main {
    public static void main(String[] args) {
        VideoFile file = new VideoFile("film", "mp4");
        VideoConverterFacade converter = new VideoConverterFacade();
        converter.convert(file);
    }
}