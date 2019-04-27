package net.kayayan.onder.daggerexample.dagger;

import net.kayayan.onder.daggerexample.MainActivity;
import net.kayayan.onder.daggerexample.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
