package Remote;

import Device.Device;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (!device.isEnabled()) {
            device.enable();
        } else {
            device.disable();
        }
    }

    public void volumeDown() {
        int vol = device.getVolume();
        vol--;
        if (vol >= 0) {
            device.setVolume(vol);
        }
    }

    public void volumeUp() {
        int vol = device.getVolume();
        vol++;
        device.setVolume(vol);
    }

    public void channelDown() {
        int ch = device.getChannel();
        ch--;
        if (ch >= 0) {
            device.setChannel(ch);
        }
    }

    public void channelUp() {
        int ch = device.getChannel();
        ch++;
        device.setChannel(ch);
    }
}
