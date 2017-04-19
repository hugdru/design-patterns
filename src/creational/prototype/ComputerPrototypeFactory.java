package creational.prototype;

import java.util.HashMap;

class ComputerPrototypeFactory {
    private HashMap<String, IComputerPrototype> prototypes = new HashMap<>();

    public RegisterResult register(IComputerPrototype computerPrototype) {
        String prototypeName = computerPrototype.getType() + "-" + computerPrototype.getModel();
        IComputerPrototype iComputerPrototype = prototypes.put(prototypeName, computerPrototype);
        return new RegisterResult(iComputerPrototype, prototypeName);
    }

    public IComputerPrototype copy(String prototypeName) {
        IComputerPrototype computerPrototype = prototypes.get(prototypeName);
        if (computerPrototype == null) {
            throw new IllegalArgumentException("Register the computer prototype first");
        }
        return computerPrototype.copy();
    }

    class RegisterResult {
        public final IComputerPrototype computerPrototype;
        public final String prototypeName;

        public RegisterResult(IComputerPrototype computerPrototype, String prototypeUniqueName) {
            this.computerPrototype = computerPrototype;
            this.prototypeName = prototypeUniqueName;
        }
    }
}
