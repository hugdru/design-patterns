package behavioral.state.fan;

class HighFanState implements IFanState {
    @Override
    public void pull(CeilingFanContext ceilingFanContext) {
        ceilingFanContext.setCurrentState(new OffFanState());
        System.out.println("Turning off");
    }
}
