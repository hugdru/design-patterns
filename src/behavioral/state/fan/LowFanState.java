package behavioral.state.fan;

class LowFanState implements IFanState {
    @Override
    public void pull(CeilingFanContext ceilingFanContext) {
        ceilingFanContext.setCurrentState(new MediumFanState());
        System.out.println("Medium speed");
    }
}
