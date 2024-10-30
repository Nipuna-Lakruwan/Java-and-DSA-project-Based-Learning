import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Path to the audio file
        String audioFilePath = "Bryan Adams - (Everything I Do) I Do It For You.wav";
        File file = new File(audioFilePath);

        if (!file.exists()) {
            System.out.println("Audio file not found: " + audioFilePath);
            return;
        }

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String command = "";
            while (!command.equalsIgnoreCase("exit")) {
                System.out.println("Enter a command (play, pause, resume, stop, exit):");
                command = scanner.nextLine();

                switch (command.toLowerCase()) {
                    case "play":
                        clip.setFramePosition(0); // rewind to the beginning
                        clip.start();
                        System.out.println("Playing audio...");
                        break;
                    case "pause":
                        clip.stop();
                        System.out.println("Audio paused.");
                        break;
                    case "resume":
                        clip.start();
                        System.out.println("Audio resumed.");
                        break;
                    case "stop":
                        clip.stop();
                        clip.setFramePosition(0); // rewind to the beginning
                        System.out.println("Audio stopped.");
                        break;
                    case "exit":
                        clip.stop();
                        clip.close();
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Unknown command.");
                        break;
                }
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}