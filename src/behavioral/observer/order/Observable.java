package behavioral.observer.order;

import behavioral.observer.notification.Observer;

public interface Observable  {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}

