package net.kayayan.onder.daggerexample.dagger;

import net.kayayan.onder.daggerexample.car.Engine;
import net.kayayan.onder.daggerexample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class PetrolEngineModule {
    private int horsePower;

    //@Binds
    //abstract Engine bindEngine(PetrolEngine engine);


    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new PetrolEngine(horsePower);
    }

}
