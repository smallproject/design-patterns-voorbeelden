package nl.novi.Behavioral.Mediator.Mediator.elementen;

import nl.novi.Behavioral.Mediator.Mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
