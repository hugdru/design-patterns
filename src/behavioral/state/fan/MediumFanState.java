package behavioral.state.fan;

class MediumFanState implements IFanState {
    @Override
    public void pull(CeilingFanContext ceilingFanContext) {
        ceilingFanContext.setCurrentState(new HighFanState());
        System.out.println("High speed");
    }
}
