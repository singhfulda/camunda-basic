package com.microservicer.camunda.SimpleWeather;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate
{

  @Override
  public void execute( DelegateExecution execution ) throws Exception
  {
    // check weather
    // Execute some code
    System.out.println( "enter in to check weather" );
    execution.setVariable( "name", "singh" );

    Random rand = new Random(); // create random boolean
    execution.setVariable( "weatherOk", rand.nextBoolean() );

  }

}
