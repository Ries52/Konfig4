package Device;

public class ImplDevice implements Device {
    protected boolean enabled = false;
    protected int volume = 0;
    protected int channel = 0;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
        System.out.println(getClass().getSimpleName() + " enable");
    }

    @Override
    public void disable() {
        enabled = false;
        System.out.println(getClass().getSimpleName() + " disable");
    }

    @Override
    public int getVolume() {
        System.out.println(getClass().getSimpleName() + " getVolume");
        return volume;
    }

    @Override
    public void setVolume(int value) {
        volume = value;
        System.out.println(getClass().getSimpleName() + " setVolume: " + volume);
    }

    @Override
    public int getChannel() {
        System.out.println(getClass().getSimpleName() + " getChannel");
        return channel;
    }

    @Override
    public void setChannel(int value) {
        channel = value;
        System.out.println(getClass().getSimpleName() + " setChannel: " + channel);
    }
}