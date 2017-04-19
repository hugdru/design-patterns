package behavioral.state.fan;

class OffFanState implements IFanState {
    @Override
    public void pull(CeilingFanContext ceilingFanContext) {
        ceilingFanContext.setCurrentState(new LowFanState());
        System.out.println("Low speed");
    }
}
