package net.kayayan.onder.daggerexample.dagger;

import net.kayayan.onder.daggerexample.car.Rims;
import net.kayayan.onder.daggerexample.car.Tires;
import net.kayayan.onder.daggerexample.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return  tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
