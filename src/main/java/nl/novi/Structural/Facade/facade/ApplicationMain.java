package nl.novi.Structural.Facade.facade;

import java.io.File;

public class ApplicationMain {
    public static void main(String[] args) {
        VideoConverterFacade converter = new VideoConverterFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
