import Device.TV;
import Remote.AdvancedRemote;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bridge-Pattern: AdvancedRemote steuerbar über Device-Implementierung
        AdvancedRemote advRemote = new AdvancedRemote(new TV());

        advRemote.togglePower();   // schaltet TV ein
        advRemote.volumeUp();      // erhöht die Lautstärke
        advRemote.channelUp();     // wechselt den Kanal
        advRemote.mute();          // stumm schalten
        advRemote.togglePower();   // schaltet TV aus
    }
}