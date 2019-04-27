package net.kayayan.onder.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.kayayan.onder.daggerexample.car.Car;
import net.kayayan.onder.daggerexample.dagger.CarComponent;
import net.kayayan.onder.daggerexample.dagger.DaggerCarComponent;
import net.kayayan.onder.daggerexample.dagger.PetrolEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

   @Inject
   public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder().petrolEngineModule(new PetrolEngineModule(100)).build();
        component.inject(this);

        car.drive();

    }
}
