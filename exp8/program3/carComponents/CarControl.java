package exp8.program3.carComponents;

public interface CarControl extends EngineControl, ACControl, MusicControl
{
    void checkCarStatus();
}