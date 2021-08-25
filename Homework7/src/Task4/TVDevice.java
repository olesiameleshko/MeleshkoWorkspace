package Task4;

abstract class TVDevice implements Device, Volume{
    protected String modelName;
    protected boolean isOn;

    public abstract void switchChannel();
}
