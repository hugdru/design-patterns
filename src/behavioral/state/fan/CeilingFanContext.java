package behavioral.state.fan;

class CeilingFanContext {

    private IFanState currentState = new OffFanState();

    public void setCurrentState(IFanState currentState) {
        this.currentState = currentState;
    }

    public void pull() {
        this.currentState.pull(this);
    }
}
